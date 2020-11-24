package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCoverageData extends js.Object {
  
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: String = js.native
  
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: String = js.native
  
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics] = js.native
}
object CodeCoverageData {
  
  @scala.inline
  def apply(buildFlavor: String, buildPlatform: String, coverageStats: js.Array[CodeCoverageStatistics]): CodeCoverageData = {
    val __obj = js.Dynamic.literal(buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], coverageStats = coverageStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageData]
  }
  
  @scala.inline
  implicit class CodeCoverageDataOps[Self <: CodeCoverageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildFlavor(value: String): Self = this.set("buildFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPlatform(value: String): Self = this.set("buildPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageStatsVarargs(value: CodeCoverageStatistics*): Self = this.set("coverageStats", js.Array(value :_*))
    
    @scala.inline
    def setCoverageStats(value: js.Array[CodeCoverageStatistics]): Self = this.set("coverageStats", value.asInstanceOf[js.Any])
  }
}
