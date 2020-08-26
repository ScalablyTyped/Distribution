package typings.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathType extends js.Object {
  var name: String = js.native
  var scope: TransitionHookScope = js.native
}

object PathType {
  @scala.inline
  def apply(name: String, scope: TransitionHookScope): PathType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathType]
  }
  @scala.inline
  implicit class PathTypeOps[Self <: PathType] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: TransitionHookScope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

