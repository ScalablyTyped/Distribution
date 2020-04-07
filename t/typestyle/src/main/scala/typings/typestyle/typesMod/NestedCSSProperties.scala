package typings.typestyle.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedCSSProperties extends CSSProperties {
  /**
    * A debug only (stripped in process.env.NODE_ENV !== 'production') name
    * Helps you figure out where the class is coming from if you care
    **/
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.undefined
  @JSName("$nest")
  var $nest: js.UndefOr[NestedCSSSelectors] = js.undefined
}

object NestedCSSProperties {
  @scala.inline
  def apply($debugName: String = null, $nest: NestedCSSSelectors = null, CSSProperties: CSSProperties = null): NestedCSSProperties = {
    val __obj = js.Dynamic.literal()
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName.asInstanceOf[js.Any])
    if ($nest != null) __obj.updateDynamic("$nest")($nest.asInstanceOf[js.Any])
    if (CSSProperties != null) js.Dynamic.global.Object.assign(__obj, CSSProperties)
    __obj.asInstanceOf[NestedCSSProperties]
  }
}

