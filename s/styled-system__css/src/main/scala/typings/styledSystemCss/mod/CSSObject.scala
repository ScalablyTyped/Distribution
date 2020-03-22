package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSObject
  extends CSSOthersObjectForCSSObject
     with CSSPropertiesWithMultiValues
     with CSSPseudosForCSSObject

object CSSObject {
  @scala.inline
  def apply(
    CSSPropertiesWithMultiValues: CSSPropertiesWithMultiValues = null,
    CSSPseudosForCSSObject: CSSPseudosForCSSObject = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    if (CSSPropertiesWithMultiValues != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesWithMultiValues)
    if (CSSPseudosForCSSObject != null) js.Dynamic.global.Object.assign(__obj, CSSPseudosForCSSObject)
    __obj.asInstanceOf[CSSObject]
  }
}

