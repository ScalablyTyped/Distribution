package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGURIReference extends js.Object {
  val href: SVGAnimatedString
}

object SVGURIReference {
  @scala.inline
  def apply(href: SVGAnimatedString): SVGURIReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[SVGURIReference]
  }
}

