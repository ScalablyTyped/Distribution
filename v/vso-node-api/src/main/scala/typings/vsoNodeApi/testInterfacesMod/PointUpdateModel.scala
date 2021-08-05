package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointUpdateModel extends StObject {
  
  var outcome: String
  
  var resetToActive: Boolean
  
  var tester: IdentityRef
}
object PointUpdateModel {
  
  inline def apply(outcome: String, resetToActive: Boolean, tester: IdentityRef): PointUpdateModel = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], resetToActive = resetToActive.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointUpdateModel]
  }
  
  extension [Self <: PointUpdateModel](x: Self) {
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setResetToActive(value: Boolean): Self = StObject.set(x, "resetToActive", value.asInstanceOf[js.Any])
    
    inline def setTester(value: IdentityRef): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
  }
}
