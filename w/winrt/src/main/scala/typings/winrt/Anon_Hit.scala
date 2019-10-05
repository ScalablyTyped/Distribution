package typings.winrt

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hit extends js.Object {
  var hit: Double
  var rect: Rect
}

object Anon_Hit {
  @scala.inline
  def apply(hit: Double, rect: Rect): Anon_Hit = {
    val __obj = js.Dynamic.literal(hit = hit, rect = rect)
  
    __obj.asInstanceOf[Anon_Hit]
  }
}

