package typings
package typestyleLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedCSSProperties extends CSSProperties {
  /**
    * A debug only (stripped in process.env.NODE_ENV !== 'production') name
    * Helps you figure out where the class is coming from if you care
    **/
  @JSName("$debugName")
  var $debugName: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$nest")
  var $nest: js.UndefOr[NestedCSSSelectors] = js.undefined
}

object NestedCSSProperties {
  @scala.inline
  def apply(
    $debugName: java.lang.String = null,
    $nest: NestedCSSSelectors = null,
    CSSProperties: CSSProperties = null
  ): NestedCSSProperties = {
    val __obj = js.Dynamic.literal()
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName)
    if ($nest != null) __obj.updateDynamic("$nest")($nest)
    js.Dynamic.global.Object.assign(__obj, CSSProperties)
    __obj.asInstanceOf[NestedCSSProperties]
  }
}

