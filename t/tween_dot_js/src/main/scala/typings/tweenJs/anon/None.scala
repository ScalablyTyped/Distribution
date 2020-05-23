package typings.tweenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait None extends js.Object {
  def None(k: Double): Double
}

object None {
  @scala.inline
  def apply(None: Double => Double): None = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
    __obj.asInstanceOf[None]
  }
}

