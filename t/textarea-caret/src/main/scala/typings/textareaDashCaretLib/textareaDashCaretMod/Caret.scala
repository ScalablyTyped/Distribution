package typings
package textareaDashCaretLib.textareaDashCaretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caret extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var top: scala.Double
}

object Caret {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double): Caret = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top)
  
    __obj.asInstanceOf[Caret]
  }
}

