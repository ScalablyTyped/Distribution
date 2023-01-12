package typings.testcafeReporterDashboard

import typings.ioTs.mod.BrandC
import typings.ioTs.mod.StringC
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.UndefinedC
import typings.ioTs.mod.UnionC
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`190`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCommonMod {
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "AggregateId")
  @js.native
  val AggregateId: BrandC[StringC, MaxLengthString[`190`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "BuildIdSchema")
  @js.native
  val BuildIdSchema: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]] = js.native
  
  trait MaxLengthString[N] extends StObject {
    
    val MaxLengthString: js.Symbol
    
    val length: N
  }
  object MaxLengthString {
    
    @JSImport("testcafe-reporter-dashboard/lib/types/common", "MaxLengthString")
    @js.native
    def apply[N /* <: Double */](len: N): BrandC[StringC, MaxLengthString[N]] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxLengthString[?], N] (val x: Self & MaxLengthString[N]) extends AnyVal {
      
      inline def setLength(value: N): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthString(value: js.Symbol): Self = StObject.set(x, "MaxLengthString", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "NameSchema")
  @js.native
  val NameSchema: BrandC[StringC, MaxLengthString[`300`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "ShortIdSchema")
  @js.native
  val ShortIdSchema: BrandC[StringC, MaxLengthString[`10`]] = js.native
  
  type BuildId = TypeOf[UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]]
  
  type Name = TypeOf[BrandC[StringC, MaxLengthString[`300`]]]
  
  type ShortId = TypeOf[BrandC[StringC, MaxLengthString[`10`]]]
}
