package typings.typedoc

import typings.typedoc.typedocStrings.exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var name: exclude
}

object Anon1 {
  @scala.inline
  def apply(name: exclude): Anon1 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

