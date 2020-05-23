package typings.typedoc.anon

import typings.typedoc.typedocStrings.entryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: entryPoint
}

object Name {
  @scala.inline
  def apply(name: entryPoint): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

