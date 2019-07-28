package typings.webcomponentsDotJs.webcomponentsDotJsMod.Global

import typings.webcomponentsDotJs.webcomponentsDotJsMod.CustomElementConstructor
import typings.webcomponentsDotJs.webcomponentsDotJsMod.CustomElementInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def registerElement(name: String, prototype: CustomElementInit): CustomElementConstructor
}

object Document {
  @scala.inline
  def apply(registerElement: (String, CustomElementInit) => CustomElementConstructor): Document = {
    val __obj = js.Dynamic.literal(registerElement = js.Any.fromFunction2(registerElement))
  
    __obj.asInstanceOf[Document]
  }
}

