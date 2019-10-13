package typings.webcomponentsDotJs.webcomponentsDotJsMod._Global_

import typings.webcomponentsDotJs.webcomponentsDotJsMod.CustomElementsPolyfill
import typings.webcomponentsDotJs.webcomponentsDotJsMod.HTMLImportsPolyfill
import typings.webcomponentsDotJs.webcomponentsDotJsMod.Polyfill
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
    val __obj = js.Dynamic.literal(CustomElements = CustomElements, HTMLImports = HTMLImports, WebComponents = WebComponents, customElements = customElements)
  
    __obj.asInstanceOf[Window]
  }
}

