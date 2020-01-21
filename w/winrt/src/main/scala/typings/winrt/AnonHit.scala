package typings.winrt

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHit extends js.Object {
  var hit: Double
  var rect: Rect
}

object AnonHit {
  @scala.inline
  def apply(hit: Double, rect: Rect): AnonHit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHit]
  }
}

