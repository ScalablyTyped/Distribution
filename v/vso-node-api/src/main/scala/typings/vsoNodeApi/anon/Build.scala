package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends js.Object {
  
  var build: scala.Double = js.native
  
  var xaml: scala.Double = js.native
}
object Build {
  
  @scala.inline
  def apply(build: scala.Double, xaml: scala.Double): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], xaml = xaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: scala.Double): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaml(value: scala.Double): Self = this.set("xaml", value.asInstanceOf[js.Any])
  }
}
