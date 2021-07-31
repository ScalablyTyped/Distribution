package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageData extends StObject {
  
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: String
  
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: String
  
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics]
}
object CodeCoverageData {
  
  @scala.inline
  def apply(buildFlavor: String, buildPlatform: String, coverageStats: js.Array[CodeCoverageStatistics]): CodeCoverageData = {
    val __obj = js.Dynamic.literal(buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], coverageStats = coverageStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageData]
  }
  
  @scala.inline
  implicit class CodeCoverageDataMutableBuilder[Self <: CodeCoverageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildFlavor(value: String): Self = StObject.set(x, "buildFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPlatform(value: String): Self = StObject.set(x, "buildPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageStats(value: js.Array[CodeCoverageStatistics]): Self = StObject.set(x, "coverageStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageStatsVarargs(value: CodeCoverageStatistics*): Self = StObject.set(x, "coverageStats", js.Array(value :_*))
  }
}
