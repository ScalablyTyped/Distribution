package typings.webicon.systemInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Injector extends js.Object {
  /**
    * Requires a component of the `webicon`-module.
    */
  def apply[T](name: String, injector: Injector): T = js.native
  /**
    * Checks whether a component with the specified `name` exists.
    *
    * @param name
    * The name of the component to check for existence.
    *
    * @return
    * A value indicating whether a component with the specified `name` exists.
    */
  def has(name: String): Boolean = js.native
}

