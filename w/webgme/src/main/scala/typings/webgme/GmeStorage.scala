package typings.webgme

import typings.std.Error
import typings.webgme.Core.ObjectHash
import typings.webgme.webgmeStrings.CANCELED
import typings.webgme.webgmeStrings.FORKED
import typings.webgme.webgmeStrings.SYNCED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeStorage {
  
  type CommitHash = String
  
  type CommitHashCallback = js.Function2[/* err */ Error | Null, /* result */ CommitHash, Unit]
  
  trait CommitObject extends StObject {
    
    /**
      * Hash of the commit object, a.k.a commitHash.
      */
    var _id: CommitHash
    
    /**
      * Commit message.
      */
    var message: String
    
    /**
      * Commits from where this commit evolved.
      */
    var parents: js.Array[CommitHash]
    
    /**
      * Hash of the associated root object, a.k.a. rootHash.
      */
    var root: ObjectHash
    
    /**
      * When the commit object was created (new Date()).getTime().
      */
    var time: Double
    
    /**
      * A constant 'commit'.
      */
    var `type`: String
    
    /**
      * Who performed the update.
      */
    var updater: js.Array[String]
  }
  object CommitObject {
    
    inline def apply(
      _id: CommitHash,
      message: String,
      parents: js.Array[CommitHash],
      root: ObjectHash,
      time: Double,
      `type`: String,
      updater: js.Array[String]
    ): CommitObject = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updater = updater.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitObject]
    }
    
    extension [Self <: CommitObject](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[CommitHash]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: CommitHash*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      inline def setRoot(value: ObjectHash): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdater(value: js.Array[String]): Self = StObject.set(x, "updater", value.asInstanceOf[js.Any])
      
      inline def setUpdaterVarargs(value: String*): Self = StObject.set(x, "updater", js.Array(value :_*))
      
      inline def set_id(value: CommitHash): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitResult extends StObject {
    
    /** The commitHash for the commit. */
    var hash: CommitHash
    
    var status: js.UndefOr[SYNCED | FORKED | CANCELED] = js.undefined
  }
  object CommitResult {
    
    inline def apply(hash: CommitHash): CommitResult = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitResult]
    }
    
    extension [Self <: CommitResult](x: Self) {
      
      inline def setHash(value: CommitHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SYNCED | FORKED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
}
