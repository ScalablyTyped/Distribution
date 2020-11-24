package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterTransform extends js.Object {
  
  var afterTransform: js.Any = js.native
  
  var runtimeStylesheetId: module | namespace = js.native
}
object AfterTransform {
  
  @scala.inline
  def apply(afterTransform: js.Any, runtimeStylesheetId: module | namespace): AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = afterTransform.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterTransform]
  }
  
  @scala.inline
  implicit class AfterTransformOps[Self <: AfterTransform] (val x: Self) extends AnyVal {
    
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
    def setAfterTransform(value: js.Any): Self = this.set("afterTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = this.set("runtimeStylesheetId", value.asInstanceOf[js.Any])
  }
}
