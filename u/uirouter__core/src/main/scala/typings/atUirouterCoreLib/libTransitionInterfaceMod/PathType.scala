package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathType extends js.Object {
  var name: java.lang.String
  var scope: TransitionHookScope
}

object PathType {
  @scala.inline
  def apply(name: java.lang.String, scope: TransitionHookScope): PathType = {
    val __obj = js.Dynamic.literal(name = name, scope = scope)
  
    __obj.asInstanceOf[PathType]
  }
}

