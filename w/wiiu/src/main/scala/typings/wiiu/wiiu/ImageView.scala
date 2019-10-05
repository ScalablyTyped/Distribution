package typings.wiiu.wiiu

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView extends js.Object {
  var viewMode: Double
  def end(): Boolean
  def getErrorCode(): Double
}

object ImageView {
  @scala.inline
  def apply(end: () => Boolean, getErrorCode: () => Double, viewMode: Double): ImageView = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getErrorCode = js.Any.fromFunction0(getErrorCode), viewMode = viewMode)
  
    __obj.asInstanceOf[ImageView]
  }
}

@JSGlobal("wiiu.imageview")
@js.native
object imageview extends TopLevel[ImageView]

