package typings.stylableRuntime.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableExports extends js.Object {
  
  var classes: Record[String, String] = js.native
  
  var keyframes: Record[String, String] = js.native
  
  var stVars: Record[String, String] = js.native
  
  var vars: Record[String, String] = js.native
}
object StylableExports {
  
  @scala.inline
  def apply(
    classes: Record[String, String],
    keyframes: Record[String, String],
    stVars: Record[String, String],
    vars: Record[String, String]
  ): StylableExports = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableExports]
  }
  
  @scala.inline
  implicit class StylableExportsOps[Self <: StylableExports] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: Record[String, String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframes(value: Record[String, String]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStVars(value: Record[String, String]): Self = this.set("stVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: Record[String, String]): Self = this.set("vars", value.asInstanceOf[js.Any])
  }
}
