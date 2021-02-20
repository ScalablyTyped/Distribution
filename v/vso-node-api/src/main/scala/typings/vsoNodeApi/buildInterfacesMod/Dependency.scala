package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependency extends StObject {
  
  /**
    * The event. The dependency is satisfied when the referenced object emits this event.
    */
  var event: String = js.native
  
  /**
    * The scope. This names the object referenced by the dependency.
    */
  var scope: String = js.native
}
object Dependency {
  
  @scala.inline
  def apply(event: String, scope: String): Dependency = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  
  @scala.inline
  implicit class DependencyMutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
