package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.ArrayC
import typings.ioTs.mod.BrandC
import typings.ioTs.mod.ExactC
import typings.ioTs.mod.NumberC
import typings.ioTs.mod.ReadonlyC
import typings.ioTs.mod.StringC
import typings.ioTs.mod.TypeC
import typings.ioTs.mod.UndefinedC
import typings.ioTs.mod.UnionC
import typings.ioTsTypes.libDateFromISOStringMod.DateFromISOStringC
import typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTime extends StObject {
  
  var buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]
  
  var endTime: DateFromISOStringC
  
  var passed: NumberC
  
  var result: ReadonlyC[ExactC[TypeC[FailedCount]]]
  
  var warnings: ArrayC[StringC]
  
  var warningsUploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
}
object EndTime {
  
  inline def apply(
    buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]],
    endTime: DateFromISOStringC,
    passed: NumberC,
    result: ReadonlyC[ExactC[TypeC[FailedCount]]],
    warnings: ArrayC[StringC],
    warningsUploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
  ): EndTime = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], warningsUploadId = warningsUploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndTime] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: DateFromISOStringC): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setPassed(value: NumberC): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ReadonlyC[ExactC[TypeC[FailedCount]]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: ArrayC[StringC]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUploadId(value: UnionC[js.Tuple2[StringC, UndefinedC]]): Self = StObject.set(x, "warningsUploadId", value.asInstanceOf[js.Any])
  }
}
