package typings.webpackPluginServe.mod

import typings.globby.mod.GlobbyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticObject extends js.Object {
  
  var glob: js.UndefOr[String | js.Array[String]] = js.native
  
  var options: js.UndefOr[GlobbyOptions] = js.native
}
object StaticObject {
  
  @scala.inline
  def apply(): StaticObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticObject]
  }
  
  @scala.inline
  implicit class StaticObjectOps[Self <: StaticObject] (val x: Self) extends AnyVal {
    
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
    def setGlobVarargs(value: String*): Self = this.set("glob", js.Array(value :_*))
    
    @scala.inline
    def setGlob(value: String | js.Array[String]): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    
    @scala.inline
    def setOptions(value: GlobbyOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
