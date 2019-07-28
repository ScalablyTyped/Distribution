package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontCSSElement extends js.Object {
  /**
    * A relative or absolute URL pointing to a CSS file with `@font-face` definitions
    * @example 'https://fonts.googleapis.com/css?family=Open+Sans'
    */
  var cssSrc: String
}

object FontCSSElement {
  @scala.inline
  def apply(cssSrc: String): FontCSSElement = {
    val __obj = js.Dynamic.literal(cssSrc = cssSrc)
  
    __obj.asInstanceOf[FontCSSElement]
  }
}

