package typings
package atYarnpkgLockfileLib.atYarnpkgLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstLevelDependency extends js.Object {
  var dependencies: js.UndefOr[Dependency] = js.undefined
  var resolved: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object FirstLevelDependency {
  @scala.inline
  def apply(version: java.lang.String, dependencies: Dependency = null, resolved: java.lang.String = null): FirstLevelDependency = {
    val __obj = js.Dynamic.literal(version = version)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (resolved != null) __obj.updateDynamic("resolved")(resolved)
    __obj.asInstanceOf[FirstLevelDependency]
  }
}

