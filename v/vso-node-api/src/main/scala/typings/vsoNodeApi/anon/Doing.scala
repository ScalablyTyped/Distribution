package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doing extends js.Object {
  var doing: scala.Double
  var done: scala.Double
  var followed: scala.Double
}

object Doing {
  @scala.inline
  def apply(doing: scala.Double, done: scala.Double, followed: scala.Double): Doing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doing]
  }
}

