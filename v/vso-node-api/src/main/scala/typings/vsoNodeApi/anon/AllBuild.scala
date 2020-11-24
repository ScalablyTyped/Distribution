package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllBuild extends js.Object {
  
  var all: scala.Double = js.native
  
  var build: scala.Double = js.native
  
  var release: scala.Double = js.native
}
object AllBuild {
  
  @scala.inline
  def apply(all: scala.Double, build: scala.Double, release: scala.Double): AllBuild = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuild]
  }
  
  @scala.inline
  implicit class AllBuildOps[Self <: AllBuild] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: scala.Double): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: scala.Double): Self = this.set("release", value.asInstanceOf[js.Any])
  }
}
