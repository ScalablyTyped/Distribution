package typings.webgme

import typings.std.Error
import typings.webgme.Core.ObjectHash
import typings.webgme.webgmeStrings.CANCELED
import typings.webgme.webgmeStrings.FORKED
import typings.webgme.webgmeStrings.SYNCED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeStorage {
  
  type CommitHash = String
  
  type CommitHashCallback = js.Function2[/* err */ Error | Null, /* result */ CommitHash, Unit]
  
  @js.native
  trait CommitObject extends StObject {
    
    /**
      * Hash of the commit object, a.k.a commitHash.
      */
    var _id: CommitHash = js.native
    
    /**
      * Commit message.
      */
    var message: String = js.native
    
    /**
      * Commits from where this commit evolved.
      */
    var parents: js.Array[CommitHash] = js.native
    
    /**
      * Hash of the associated root object, a.k.a. rootHash.
      */
    var root: ObjectHash = js.native
    
    /**
      * When the commit object was created (new Date()).getTime().
      */
    var time: Double = js.native
    
    /**
      * A constant 'commit'.
      */
    var `type`: String = js.native
    
    /**
      * Who performed the update.
      */
    var updater: js.Array[String] = js.native
  }
  object CommitObject {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CommitObjectMutableBuilder[Self <: CommitObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[CommitHash]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: CommitHash*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: ObjectHash): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdater(value: js.Array[String]): Self = StObject.set(x, "updater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdaterVarargs(value: String*): Self = StObject.set(x, "updater", js.Array(value :_*))
      
      @scala.inline
      def set_id(value: CommitHash): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommitResult extends StObject {
    
    /** The commitHash for the commit. */
    var hash: CommitHash = js.native
    
    var status: js.UndefOr[SYNCED | FORKED | CANCELED] = js.native
  }
  object CommitResult {
    
    @scala.inline
    def apply(hash: CommitHash): CommitResult = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitResult]
    }
    
    @scala.inline
    implicit class CommitResultMutableBuilder[Self <: CommitResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: CommitHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: SYNCED | FORKED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
}
