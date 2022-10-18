package typings.testcafeReporterDashboard

import typings.ioTs.mod.ExactC
import typings.ioTs.mod.ReadonlyC
import typings.ioTs.mod.TypeC
import typings.testcafeReporterDashboard.anon.BuildId
import typings.testcafeReporterDashboard.anon.FailedCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesTaskDoneArgsMod {
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-done-args", "TaskDoneArgsSchema")
  @js.native
  val TaskDoneArgsSchema: ReadonlyC[ExactC[TypeC[BuildId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-done-args", "TaskResultSchema")
  @js.native
  val TaskResultSchema: ReadonlyC[ExactC[TypeC[FailedCount]]] = js.native
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  endTime :io-ts-types.io-ts-types.DateFromISOStringC,   passed :io-ts.io-ts.NumberC,   warnings :io-ts.io-ts.ArrayC<io-ts.io-ts.StringC>,   warningsUploadId :io-ts.io-ts.UnionC<[io-ts.io-ts.StringC, io-ts.io-ts.UndefinedC]>,   result :io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  failedCount :io-ts.io-ts.NumberC,   passedCount :io-ts.io-ts.NumberC,   skippedCount :io-ts.io-ts.NumberC}>>>,   buildId :io-ts.io-ts.UnionC<[io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<100>>, io-ts.io-ts.UndefinedC]>}>>>> */
  type TaskDoneArgs = scala.Nothing
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  failedCount :io-ts.io-ts.NumberC,   passedCount :io-ts.io-ts.NumberC,   skippedCount :io-ts.io-ts.NumberC}>>>> */
  type TaskResult = scala.Nothing
}
