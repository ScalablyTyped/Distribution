package typings
package atUirouterCoreLib.libStateStateBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateBuilder", "StateBuilder")
@js.native
class StateBuilder protected () extends js.Object {
  def this(matcher: atUirouterCoreLib.libStateStateMatcherMod.StateMatcher, urlMatcherFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.UrlMatcherFactory) = this()
  /** An object that contains all the BuilderFunctions registered, key'd by the name of the State property they build */
  var builders: js.Any = js.native
  var matcher: js.Any = js.native
  /**
    * Builds all of the properties on an essentially blank State object, returning a State object which has all its
    * properties and API built.
    *
    * @param state an uninitialized State object
    * @returns the built State object
    */
  def build(state: atUirouterCoreLib.libStateStateObjectMod.StateObject): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /**
    * Registers a [[BuilderFunction]] for a specific [[StateObject]] property (e.g., `parent`, `url`, or `path`).
    * More than one BuilderFunction can be registered for a given property.
    *
    * The BuilderFunction(s) will be used to define the property on any subsequently built [[StateObject]] objects.
    *
    * @param name The name of the State property being registered for.
    * @param fn The BuilderFunction which will be used to build the State property
    * @returns a function which deregisters the BuilderFunction
    */
  def builder(name: java.lang.String, fn: BuilderFunction): BuilderFunction | js.Array[BuilderFunction] | js.Function = js.native
  def name(state: atUirouterCoreLib.libStateStateObjectMod.StateObject): java.lang.String = js.native
  def parentName(state: atUirouterCoreLib.libStateStateObjectMod.StateObject): java.lang.String = js.native
}

