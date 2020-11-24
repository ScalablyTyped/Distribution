package typings.stylableWebpackPlugin.typesMod

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableGeneratorOptions extends js.Object {
  
  var afterTransform: js.Any = js.native
  
  var experimentalHMR: Boolean = js.native
  
  var includeCSSInJS: Boolean = js.native
  
  var runtimeStylesheetId: module | namespace = js.native
}
object StylableGeneratorOptions {
  
  @scala.inline
  def apply(
    afterTransform: js.Any,
    experimentalHMR: Boolean,
    includeCSSInJS: Boolean,
    runtimeStylesheetId: module | namespace
  ): StylableGeneratorOptions = {
    val __obj = js.Dynamic.literal(afterTransform = afterTransform.asInstanceOf[js.Any], experimentalHMR = experimentalHMR.asInstanceOf[js.Any], includeCSSInJS = includeCSSInJS.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableGeneratorOptions]
  }
  
  @scala.inline
  implicit class StylableGeneratorOptionsOps[Self <: StylableGeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setExperimentalHMR(value: Boolean): Self = this.set("experimentalHMR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCSSInJS(value: Boolean): Self = this.set("includeCSSInJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = this.set("runtimeStylesheetId", value.asInstanceOf[js.Any])
  }
}
