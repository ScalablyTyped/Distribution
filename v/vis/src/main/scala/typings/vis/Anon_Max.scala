package typings.vis

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: Date
  var min: Date
}

object Anon_Max {
  @scala.inline
  def apply(max: Date, min: Date): Anon_Max = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[Anon_Max]
  }
}

