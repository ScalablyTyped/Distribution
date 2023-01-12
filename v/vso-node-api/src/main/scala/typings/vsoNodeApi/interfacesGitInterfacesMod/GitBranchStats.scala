package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitBranchStats extends StObject {
  
  /**
    * Number of commits ahead.
    */
  var aheadCount: Double
  
  /**
    * Number of commits behind.
    */
  var behindCount: Double
  
  /**
    * Current commit.
    */
  var commit: GitCommitRef
  
  /**
    * True if this is the result for the base version.
    */
  var isBaseVersion: Boolean
  
  /**
    * Name of the ref.
    */
  var name: String
}
object GitBranchStats {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GitBranchStats] (val x: Self) extends AnyVal {
    
    inline def setAheadCount(value: Double): Self = StObject.set(x, "aheadCount", value.asInstanceOf[js.Any])
    
    inline def setBehindCount(value: Double): Self = StObject.set(x, "behindCount", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: GitCommitRef): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setIsBaseVersion(value: Boolean): Self = StObject.set(x, "isBaseVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
