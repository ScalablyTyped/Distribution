package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointAssignment extends StObject {
  
  var configuration: ShallowReference
  
  var tester: IdentityRef
}
object PointAssignment {
  
  inline def apply(configuration: ShallowReference, tester: IdentityRef): PointAssignment = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAssignment]
  }
  
  extension [Self <: PointAssignment](x: Self) {
    
    inline def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setTester(value: IdentityRef): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
  }
}
