package typings.vueTestUtils.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetupState extends StObject {
  
  var setupState: Record[String, Any]
}
object SetupState {
  
  inline def apply(setupState: Record[String, Any]): SetupState = {
    val __obj = js.Dynamic.literal(setupState = setupState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetupState] (val x: Self) extends AnyVal {
    
    inline def setSetupState(value: Record[String, Any]): Self = StObject.set(x, "setupState", value.asInstanceOf[js.Any])
  }
}
