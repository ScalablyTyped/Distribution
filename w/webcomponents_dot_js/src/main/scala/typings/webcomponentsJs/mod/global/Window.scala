package typings.webcomponentsJs.mod.global

import typings.webcomponentsJs.mod.CustomElementsPolyfill
import typings.webcomponentsJs.mod.HTMLImportsPolyfill
import typings.webcomponentsJs.mod.Polyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var CustomElements: CustomElementsPolyfill = js.native
  
  var HTMLImports: HTMLImportsPolyfill = js.native
  
  var WebComponents: Polyfill = js.native
  
  var customElements: CustomElementRegistry = js.native
}
object Window {
  
  @scala.inline
  def apply(
    CustomElements: CustomElementsPolyfill,
    HTMLImports: HTMLImportsPolyfill,
    WebComponents: Polyfill,
    customElements: CustomElementRegistry
  ): Window = {
    val __obj = js.Dynamic.literal(CustomElements = CustomElements.asInstanceOf[js.Any], HTMLImports = HTMLImports.asInstanceOf[js.Any], WebComponents = WebComponents.asInstanceOf[js.Any], customElements = customElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setCustomElements(value: CustomElementsPolyfill): Self = this.set("CustomElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLImports(value: HTMLImportsPolyfill): Self = this.set("HTMLImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebComponents(value: Polyfill): Self = this.set("WebComponents", value.asInstanceOf[js.Any])
  }
}
