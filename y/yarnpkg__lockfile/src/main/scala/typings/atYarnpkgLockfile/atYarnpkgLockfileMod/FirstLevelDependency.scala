package typings.atYarnpkgLockfile.atYarnpkgLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstLevelDependency extends js.Object {
  var dependencies: js.UndefOr[Dependency] = js.undefined
  var resolved: js.UndefOr[String] = js.undefined
  var version: String
}

object FirstLevelDependency {
  @scala.inline
  def apply(version: String, dependencies: Dependency = null, resolved: String = null): FirstLevelDependency = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLevelDependency]
  }
}

