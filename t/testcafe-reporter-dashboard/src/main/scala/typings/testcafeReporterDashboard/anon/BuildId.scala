package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.ArrayC
import typings.ioTs.mod.BrandC
import typings.ioTs.mod.ExactC
import typings.ioTs.mod.NumberC
import typings.ioTs.mod.PartialC
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

trait BuildId extends StObject {
  
  var buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]
  
  var ciInfo: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]]
  
  var startTime: DateFromISOStringC
  
  var taskStructure: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]]
  
  var testCount: NumberC
  
  var userAgents: ArrayC[StringC]
}
object BuildId {
  
  inline def apply(
    buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]],
    ciInfo: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]],
    startTime: DateFromISOStringC,
    taskStructure: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]],
    testCount: NumberC,
    userAgents: ArrayC[StringC]
  ): BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ciInfo = ciInfo.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], taskStructure = taskStructure.asInstanceOf[js.Any], testCount = testCount.asInstanceOf[js.Any], userAgents = userAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildId] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCiInfo(value: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]]): Self = StObject.set(x, "ciInfo", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: DateFromISOStringC): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStructure(value: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]]): Self = StObject.set(x, "taskStructure", value.asInstanceOf[js.Any])
    
    inline def setTestCount(value: NumberC): Self = StObject.set(x, "testCount", value.asInstanceOf[js.Any])
    
    inline def setUserAgents(value: ArrayC[StringC]): Self = StObject.set(x, "userAgents", value.asInstanceOf[js.Any])
  }
}
