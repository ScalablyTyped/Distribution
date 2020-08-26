package typings.yarnpkgLockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstLevelDependency extends js.Object {
  var dependencies: js.UndefOr[Dependency] = js.native
  var resolved: js.UndefOr[String] = js.native
  var version: String = js.native
}

object FirstLevelDependency {
  @scala.inline
  def apply(version: String): FirstLevelDependency = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLevelDependency]
  }
  @scala.inline
  implicit class FirstLevelDependencyOps[Self <: FirstLevelDependency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencies(value: Dependency): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setResolved(value: String): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
  }
  
}

