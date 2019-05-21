package typings
package webiconLib.systemInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Injector extends js.Object {
  /**
    * Requires a component of the `webicon`-module.
    */
  def apply[T](name: java.lang.String, injector: Injector): T = js.native
  /**
    * Checks whether a component with the specified `name` exists.
    *
    * @param name
    * The name of the component to check for existence.
    *
    * @return
    * A value indicating whether a component with the specified `name` exists.
    */
  def has(name: java.lang.String): scala.Boolean = js.native
}

