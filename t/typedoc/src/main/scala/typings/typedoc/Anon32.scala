package typings.typedoc

import typings.typedoc.typedocStrings.externalPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon32 extends js.Object {
  var name: externalPattern
}

object Anon32 {
  @scala.inline
  def apply(name: externalPattern): Anon32 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon32]
  }
}

