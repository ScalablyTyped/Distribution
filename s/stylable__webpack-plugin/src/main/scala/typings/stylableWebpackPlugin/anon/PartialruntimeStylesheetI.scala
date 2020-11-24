package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  runtimeStylesheetId :'module' | 'namespace',   afterTransform :any}> */
@js.native
trait PartialruntimeStylesheetI extends js.Object {
  
  var afterTransform: js.UndefOr[js.Any] = js.native
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.native
}
object PartialruntimeStylesheetI {
  
  @scala.inline
  def apply(): PartialruntimeStylesheetI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialruntimeStylesheetI]
  }
  
  @scala.inline
  implicit class PartialruntimeStylesheetIOps[Self <: PartialruntimeStylesheetI] (val x: Self) extends AnyVal {
    
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
    def deleteAfterTransform: Self = this.set("afterTransform", js.undefined)
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = this.set("runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeStylesheetId: Self = this.set("runtimeStylesheetId", js.undefined)
  }
}
