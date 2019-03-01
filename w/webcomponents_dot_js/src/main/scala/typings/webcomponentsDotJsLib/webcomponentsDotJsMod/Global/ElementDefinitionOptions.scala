package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This contains duplicates of some types in lib.dom.d.ts in order to support typescript 2.0
trait ElementDefinitionOptions extends js.Object {
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
}

object ElementDefinitionOptions {
  @scala.inline
  def apply(`extends`: java.lang.String = null): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
}

