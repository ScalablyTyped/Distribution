package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontCSSElement extends js.Object {
  /**
    * A relative or absolute URL pointing to a CSS file with `@font-face` definitions
    * @example 'https://fonts.googleapis.com/css?family=Open+Sans'
    */
  var cssSrc: java.lang.String
}

object FontCSSElement {
  @scala.inline
  def apply(cssSrc: java.lang.String): FontCSSElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssSrc")(cssSrc)
    __obj.asInstanceOf[FontCSSElement]
  }
}

