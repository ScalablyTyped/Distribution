package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTests extends js.Object {
  val requiredExtensions: SVGStringList
  val systemLanguage: SVGStringList
}

object SVGTests {
  @scala.inline
  def apply(requiredExtensions: SVGStringList, systemLanguage: SVGStringList): SVGTests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requiredExtensions")(requiredExtensions)
    __obj.updateDynamic("systemLanguage")(systemLanguage)
    __obj.asInstanceOf[SVGTests]
  }
}

