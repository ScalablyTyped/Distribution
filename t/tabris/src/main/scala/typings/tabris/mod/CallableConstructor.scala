package typings.tabris.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallableConstructor[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */, Selector /* <: js.Function */]
  extends StObject
     with /** This constructor can be called as a factory, without "new". Doing so allows passing an attributes object which may include (in addition to the properties) children, event listeners and layout shorthands. */
Instantiable1[/* args */ ConstructorParameters[OriginalConstructor], Instance] {
  
  /**
    * Creates an instance of this type.
    *
    * The given attributes object may include properties,
    * event listener and children, if supported.
    *
    * The second parameter should be given if this is the
    * return value of a functional component. In this case the
    * component itself (factory function) must be given to make it
    * a valid selector for the widget selector API such as
    * "$()" or the composite "find()" method.
    */
  def apply(): Instance = js.native
  def apply(attributes: Unit, selector: Selector): Instance = js.native
  def apply(attributes: Attributes[Instance, Any]): Instance = js.native
  def apply(attributes: Attributes[Instance, Any], selector: Selector): Instance = js.native
}
