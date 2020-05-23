package typings.typeFest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opaque extends js.Object {
  val __opaque__ : js.Symbol
}

object Opaque {
  @scala.inline
  def apply(__opaque__ : js.Symbol): Opaque = {
    val __obj = js.Dynamic.literal(__opaque__ = __opaque__.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opaque]
  }
}

