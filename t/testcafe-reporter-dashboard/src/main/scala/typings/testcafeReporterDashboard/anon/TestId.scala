package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.BrandC
import typings.ioTs.mod.StringC
import typings.testcafeReporterDashboard.commonMod.MaxLengthString
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestId extends StObject {
  
  var testId: BrandC[StringC, MaxLengthString[`10`]]
}
object TestId {
  
  inline def apply(testId: BrandC[StringC, MaxLengthString[`10`]]): TestId = {
    val __obj = js.Dynamic.literal(testId = testId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestId]
  }
  
  extension [Self <: TestId](x: Self) {
    
    inline def setTestId(value: BrandC[StringC, MaxLengthString[`10`]]): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
  }
}
