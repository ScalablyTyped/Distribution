package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLine extends js.Object {
  var fontSize: java.lang.String
  var lineHeight: java.lang.String
}

object BaseLine {
  @scala.inline
  def apply(fontSize: java.lang.String, lineHeight: java.lang.String): BaseLine = {
    val __obj = js.Dynamic.literal(fontSize = fontSize, lineHeight = lineHeight)
  
    __obj.asInstanceOf[BaseLine]
  }
}

