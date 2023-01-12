package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.ArrayC
import typings.ioTs.mod.BrandC
import typings.ioTs.mod.ExactC
import typings.ioTs.mod.ReadonlyC
import typings.ioTs.mod.StringC
import typings.ioTs.mod.TypeC
import typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var id: BrandC[StringC, MaxLengthString[`300`]]
  
  var name: BrandC[StringC, MaxLengthString[`300`]]
  
  var tests: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]
}
object Name {
  
  inline def apply(
    id: BrandC[StringC, MaxLengthString[`300`]],
    name: BrandC[StringC, MaxLengthString[`300`]],
    tests: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]
  ): Name = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setId(value: BrandC[StringC, MaxLengthString[`300`]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: BrandC[StringC, MaxLengthString[`300`]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTests(value: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
  }
}
