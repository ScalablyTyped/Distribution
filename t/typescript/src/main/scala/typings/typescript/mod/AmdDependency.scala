package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmdDependency extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object AmdDependency {
  @scala.inline
  def apply(path: java.lang.String, name: java.lang.String = null): AmdDependency = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmdDependency]
  }
}

