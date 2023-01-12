package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.BooleanC
import typings.ioTs.mod.BrandC
import typings.ioTs.mod.StringC
import typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: BrandC[StringC, MaxLengthString[`10`]]
  
  var name: BrandC[StringC, MaxLengthString[`300`]]
  
  var skip: BooleanC
}
object Id {
  
  inline def apply(
    id: BrandC[StringC, MaxLengthString[`10`]],
    name: BrandC[StringC, MaxLengthString[`300`]],
    skip: BooleanC
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: BrandC[StringC, MaxLengthString[`10`]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: BrandC[StringC, MaxLengthString[`300`]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: BooleanC): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
