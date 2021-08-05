package typings.turbostatus

import typings.turbostatus.turbostatusBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("turbostatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkout(folder: String, commit: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(folder.asInstanceOf[js.Any], commit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def clone_(origin: String, folder: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(origin.asInstanceOf[js.Any], folder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def describe(folder: String): js.Promise[Description] = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Description]]
  
  inline def getBranch(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBranch")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getBranchFast(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBranchFast")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getLocalCommit(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalCommit")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMergeBase(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergeBase")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getOrigin(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrigin")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getRemoteCommit(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteCommit")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getRepos(folder: String): js.Promise[js.Array[Repository]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepos")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Repository]]]
  inline def getRepos(folder: String, wildcard: String): js.Promise[js.Array[Repository]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepos")(folder.asInstanceOf[js.Any], wildcard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Repository]]]
  
  inline def hasUncommited(folder: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUncommited")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def hasUntracked(folder: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUntracked")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def info(repo: Repository): js.Promise[Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Repository]]
  inline def info(repo: Repository, remotes: Boolean): js.Promise[Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(repo.asInstanceOf[js.Any], remotes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Repository]]
  
  inline def isRepo(folder: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepo")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def references(folder: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("references")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait Description extends StObject {
    
    var commitsSinceTag: String | `false`
    
    var hash: String
    
    var nearestTag: String | `false`
  }
  object Description {
    
    inline def apply(commitsSinceTag: String | `false`, hash: String, nearestTag: String | `false`): Description = {
      val __obj = js.Dynamic.literal(commitsSinceTag = commitsSinceTag.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nearestTag = nearestTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setCommitsSinceTag(value: String | `false`): Self = StObject.set(x, "commitsSinceTag", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setNearestTag(value: String | `false`): Self = StObject.set(x, "nearestTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Repository extends StObject {
    
    var name: String
    
    var path: String
  }
  object Repository {
    
    inline def apply(name: String, path: String): Repository = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repository]
    }
    
    extension [Self <: Repository](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
