package typings.tabris.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallableConstructor[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */, Selector /* <: js.Function */]
  extends StObject
     with Instantiable1[/* args */ ConstructorParameters[OriginalConstructor], Instance] {
  
  def apply(): Instance = js.native
  def apply(attributes: Unit, selector: Selector): Instance = js.native
  def apply(attributes: Attributes[Instance]): Instance = js.native
  def apply(attributes: Attributes[Instance], selector: Selector): Instance = js.native
}
