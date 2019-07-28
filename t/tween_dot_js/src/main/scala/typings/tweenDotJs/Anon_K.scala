package typings.tweenDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K extends js.Object {
  def None(k: Double): Double
}

object Anon_K {
  @scala.inline
  def apply(None: Double => Double): Anon_K = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
  
    __obj.asInstanceOf[Anon_K]
  }
}

