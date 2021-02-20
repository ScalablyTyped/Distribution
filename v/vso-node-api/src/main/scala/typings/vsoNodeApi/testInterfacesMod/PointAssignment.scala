package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointAssignment extends StObject {
  
  var configuration: ShallowReference = js.native
  
  var tester: IdentityRef = js.native
}
object PointAssignment {
  
  @scala.inline
  def apply(configuration: ShallowReference, tester: IdentityRef): PointAssignment = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAssignment]
  }
  
  @scala.inline
  implicit class PointAssignmentMutableBuilder[Self <: PointAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTester(value: IdentityRef): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
  }
}
