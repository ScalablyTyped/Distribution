package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlan extends StObject {
  
  var testPlan: scala.Double
  
  var testSuite: scala.Double
}
object TestPlan {
  
  inline def apply(testPlan: scala.Double, testSuite: scala.Double): TestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlan] (val x: Self) extends AnyVal {
    
    inline def setTestPlan(value: scala.Double): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    inline def setTestSuite(value: scala.Double): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
  }
}
