package typings.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathType extends js.Object {
  var name: String
  var scope: TransitionHookScope
}

object PathType {
  @scala.inline
  def apply(name: String, scope: TransitionHookScope): PathType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathType]
  }
}

