package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitBranchStats extends StObject {
  
  /**
    * Number of commits ahead.
    */
  var aheadCount: Double = js.native
  
  /**
    * Number of commits behind.
    */
  var behindCount: Double = js.native
  
  /**
    * Current commit.
    */
  var commit: GitCommitRef = js.native
  
  /**
    * True if this is the result for the base version.
    */
  var isBaseVersion: Boolean = js.native
  
  /**
    * Name of the ref.
    */
  var name: String = js.native
}
object GitBranchStats {
  
  @scala.inline
  def apply(
    aheadCount: Double,
    behindCount: Double,
    commit: GitCommitRef,
    isBaseVersion: Boolean,
    name: String
  ): GitBranchStats = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount.asInstanceOf[js.Any], behindCount = behindCount.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isBaseVersion = isBaseVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitBranchStats]
  }
  
  @scala.inline
  implicit class GitBranchStatsMutableBuilder[Self <: GitBranchStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAheadCount(value: Double): Self = StObject.set(x, "aheadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehindCount(value: Double): Self = StObject.set(x, "behindCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: GitCommitRef): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBaseVersion(value: Boolean): Self = StObject.set(x, "isBaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
