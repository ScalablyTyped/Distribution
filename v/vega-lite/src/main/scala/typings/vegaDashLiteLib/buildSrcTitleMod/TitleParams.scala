package typings
package vegaDashLiteLib.buildSrcTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleParams extends TitleBase {
  /**
    * The title text.
    */
  var text: java.lang.String
}

object TitleParams {
  @scala.inline
  def apply(
    text: java.lang.String,
    anchor: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Anchor = null,
    offset: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.TitleOrient = null,
    style: java.lang.String | js.Array[java.lang.String] = null
  ): TitleParams = {
    val __obj = js.Dynamic.literal(text = text)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleParams]
  }
}

