package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var CustomElements: webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementsPolyfill
  var HTMLImports: webcomponentsDotJsLib.webcomponentsDotJsMod.HTMLImportsPolyfill
  var WebComponents: webcomponentsDotJsLib.webcomponentsDotJsMod.Polyfill
  var customElements: CustomElementRegistry
}

object Window {
  @scala.inline
  def apply(
    CustomElements: webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementsPolyfill,
    HTMLImports: webcomponentsDotJsLib.webcomponentsDotJsMod.HTMLImportsPolyfill,
    WebComponents: webcomponentsDotJsLib.webcomponentsDotJsMod.Polyfill,
    customElements: CustomElementRegistry
  ): Window = {
    val __obj = js.Dynamic.literal(CustomElements = CustomElements, HTMLImports = HTMLImports, WebComponents = WebComponents, customElements = customElements)
  
    __obj.asInstanceOf[Window]
  }
}

