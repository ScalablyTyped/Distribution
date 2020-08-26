package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSObject
  extends CSSOthersObjectForCSSObject
     with CSSPropertiesWithMultiValues
     with CSSPseudosForCSSObject

object CSSObject {
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
}

