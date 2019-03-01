package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyle extends js.Object {
  /**
    * 格式#ff0000
    */
  var backgroundColor: java.lang.String
  /**
    * 格式#ff0000
    */
  var borderColor: java.lang.String
  var borderRadius: scala.Double
  var borderWidth: scala.Double
  var fontSize: scala.Double
  var height: scala.Double
  var left: scala.Double
  var lineHeight: scala.Double
  var textAlign: wegameDashApiLib.wegameDashApiLibStrings.left | wegameDashApiLib.wegameDashApiLibStrings.center | wegameDashApiLib.wegameDashApiLibStrings.right
  var top: scala.Double
  var width: scala.Double
}

object ButtonStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    borderColor: java.lang.String,
    borderRadius: scala.Double,
    borderWidth: scala.Double,
    fontSize: scala.Double,
    height: scala.Double,
    left: scala.Double,
    lineHeight: scala.Double,
    textAlign: wegameDashApiLib.wegameDashApiLibStrings.left | wegameDashApiLib.wegameDashApiLibStrings.center | wegameDashApiLib.wegameDashApiLibStrings.right,
    top: scala.Double,
    width: scala.Double
  ): ButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("borderRadius")(borderRadius)
    __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ButtonStyle]
  }
}

