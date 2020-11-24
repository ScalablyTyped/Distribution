package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllBuildDir extends js.Object {
  
  var allBuildDir: scala.Double = js.native
  
  var source: scala.Double = js.native
  
  var sourceAndOutputDir: scala.Double = js.native
  
  var sourceDir: scala.Double = js.native
}
object AllBuildDir {
  
  @scala.inline
  def apply(
    allBuildDir: scala.Double,
    source: scala.Double,
    sourceAndOutputDir: scala.Double,
    sourceDir: scala.Double
  ): AllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuildDir]
  }
  
  @scala.inline
  implicit class AllBuildDirOps[Self <: AllBuildDir] (val x: Self) extends AnyVal {
    
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
    def setAllBuildDir(value: scala.Double): Self = this.set("allBuildDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: scala.Double): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAndOutputDir(value: scala.Double): Self = this.set("sourceAndOutputDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDir(value: scala.Double): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
}
