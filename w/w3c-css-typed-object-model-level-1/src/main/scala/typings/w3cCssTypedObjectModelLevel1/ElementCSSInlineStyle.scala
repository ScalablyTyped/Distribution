package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCSSInlineStyle extends js.Object {
  val attributeStyleMap: StylePropertyMap
}

object ElementCSSInlineStyle {
  @scala.inline
  def apply(attributeStyleMap: StylePropertyMap): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(attributeStyleMap = attributeStyleMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
}

