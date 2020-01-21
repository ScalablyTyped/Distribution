package typings.webcomponentsJs.mod._Global_

import typings.webcomponentsJs.mod.CustomElementsPolyfill
import typings.webcomponentsJs.mod.HTMLImportsPolyfill
import typings.webcomponentsJs.mod.Polyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var CustomElements: CustomElementsPolyfill
  var HTMLImports: HTMLImportsPolyfill
  var WebComponents: Polyfill
  var customElements: CustomElementRegistry
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
}

