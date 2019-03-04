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
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderColor = borderColor, borderRadius = borderRadius, borderWidth = borderWidth, fontSize = fontSize, height = height, left = left, lineHeight = lineHeight, textAlign = textAlign.asInstanceOf[js.Any], top = top, width = width)
  
    __obj.asInstanceOf[ButtonStyle]
  }
}

