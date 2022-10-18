package typings.testcafeReporterDashboard

import typings.ioTs.mod.ExactC
import typings.ioTs.mod.PartialC
import typings.ioTs.mod.ReadonlyC
import typings.ioTs.mod.TypeC
import typings.testcafeReporterDashboard.anon.Author
import typings.testcafeReporterDashboard.anon.CiInfo
import typings.testcafeReporterDashboard.anon.Fixture
import typings.testcafeReporterDashboard.anon.Id
import typings.testcafeReporterDashboard.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesTaskStartArgsMod {
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-start-args", "CIInfoSchema")
  @js.native
  val CIInfoSchema: ReadonlyC[ExactC[PartialC[Author]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-start-args", "ReportedFixtureItemSchema")
  @js.native
  val ReportedFixtureItemSchema: ReadonlyC[ExactC[TypeC[Name]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-start-args", "ReportedTestItemSchema")
  @js.native
  val ReportedTestItemSchema: ReadonlyC[ExactC[TypeC[Id]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-start-args", "ReportedTestStructureItemSchema")
  @js.native
  val ReportedTestStructureItemSchema: ReadonlyC[ExactC[TypeC[Fixture]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/task-start-args", "TaskStartArgsSchema")
  @js.native
  val TaskStartArgsSchema: ReadonlyC[ExactC[TypeC[CiInfo]]] = js.native
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.PartialC<{  commitSHA :io-ts.io-ts.StringC,   author :io-ts.io-ts.StringC,   branchName :io-ts.io-ts.StringC}>>>> */
  type CIInfo = scala.Nothing
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   tests :io-ts.io-ts.ArrayC<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<10>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   skip :io-ts.io-ts.BooleanC}>>>>}>>>> */
  type ReportedFixtureItem = scala.Nothing
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<10>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   skip :io-ts.io-ts.BooleanC}>>>> */
  type ReportedTestItem = scala.Nothing
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  fixture :io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   tests :io-ts.io-ts.ArrayC<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<10>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   skip :io-ts.io-ts.BooleanC}>>>>}>>>}>>>> */
  type ReportedTestStructureItem = scala.Nothing
  
  /* Inlined io-ts.io-ts.TypeOf<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  startTime :io-ts-types.io-ts-types.DateFromISOStringC,   userAgents :io-ts.io-ts.ArrayC<io-ts.io-ts.StringC>,   testCount :io-ts.io-ts.NumberC,   buildId :io-ts.io-ts.UnionC<[io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<100>>, io-ts.io-ts.UndefinedC]>,   taskStructure :io-ts.io-ts.ArrayC<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  fixture :io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   tests :io-ts.io-ts.ArrayC<io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.TypeC<{  id :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<10>>,   name :io-ts.io-ts.BrandC<io-ts.io-ts.StringC, testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/common.MaxLengthString<300>>,   skip :io-ts.io-ts.BooleanC}>>>>}>>>}>>>>,   ciInfo :io-ts.io-ts.UnionC<[io-ts.io-ts.UndefinedC, io-ts.io-ts.ReadonlyC<io-ts.io-ts.ExactC<io-ts.io-ts.PartialC<{  commitSHA :io-ts.io-ts.StringC,   author :io-ts.io-ts.StringC,   branchName :io-ts.io-ts.StringC}>>>]>}>>>> */
  type TaskStartArgs = scala.Nothing
}
