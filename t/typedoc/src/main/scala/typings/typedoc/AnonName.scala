package typings.typedoc

import typings.typedoc.typedocStrings.entryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: entryPoint
}

object AnonName {
  @scala.inline
  def apply(name: entryPoint): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

