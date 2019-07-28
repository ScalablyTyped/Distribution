package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmdDependency extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var path: String
}

object AmdDependency {
  @scala.inline
  def apply(path: String, name: String = null): AmdDependency = {
    val __obj = js.Dynamic.literal(path = path)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AmdDependency]
  }
}

