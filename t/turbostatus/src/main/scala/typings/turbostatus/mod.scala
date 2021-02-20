package typings.turbostatus

import typings.turbostatus.turbostatusBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("turbostatus", "checkout")
  @js.native
  def checkout(folder: String, commit: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "clone")
  @js.native
  def clone_(origin: String, folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "describe")
  @js.native
  def describe(folder: String): js.Promise[Description] = js.native
  
  @JSImport("turbostatus", "getBranch")
  @js.native
  def getBranch(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getBranchFast")
  @js.native
  def getBranchFast(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getLocalCommit")
  @js.native
  def getLocalCommit(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getMergeBase")
  @js.native
  def getMergeBase(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getOrigin")
  @js.native
  def getOrigin(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getRemoteCommit")
  @js.native
  def getRemoteCommit(folder: String): js.Promise[String] = js.native
  
  @JSImport("turbostatus", "getRepos")
  @js.native
  def getRepos(folder: String): js.Promise[js.Array[Repository]] = js.native
  @JSImport("turbostatus", "getRepos")
  @js.native
  def getRepos(folder: String, wildcard: String): js.Promise[js.Array[Repository]] = js.native
  
  @JSImport("turbostatus", "hasUncommited")
  @js.native
  def hasUncommited(folder: String): js.Promise[Boolean] = js.native
  
  @JSImport("turbostatus", "hasUntracked")
  @js.native
  def hasUntracked(folder: String): js.Promise[Boolean] = js.native
  
  @JSImport("turbostatus", "info")
  @js.native
  def info(repo: Repository): js.Promise[Repository] = js.native
  @JSImport("turbostatus", "info")
  @js.native
  def info(repo: Repository, remotes: Boolean): js.Promise[Repository] = js.native
  
  @JSImport("turbostatus", "isRepo")
  @js.native
  def isRepo(folder: String): js.Promise[Boolean] = js.native
  
  @JSImport("turbostatus", "references")
  @js.native
  def references(folder: String): js.Promise[String] = js.native
  
  @js.native
  trait Description extends StObject {
    
    var commitsSinceTag: String | `false` = js.native
    
    var hash: String = js.native
    
    var nearestTag: String | `false` = js.native
  }
  object Description {
    
    @scala.inline
    def apply(commitsSinceTag: String | `false`, hash: String, nearestTag: String | `false`): Description = {
      val __obj = js.Dynamic.literal(commitsSinceTag = commitsSinceTag.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nearestTag = nearestTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommitsSinceTag(value: String | `false`): Self = StObject.set(x, "commitsSinceTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestTag(value: String | `false`): Self = StObject.set(x, "nearestTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Repository extends StObject {
    
    var name: String = js.native
    
    var path: String = js.native
  }
  object Repository {
    
    @scala.inline
    def apply(name: String, path: String): Repository = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repository]
    }
    
    @scala.inline
    implicit class RepositoryMutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
