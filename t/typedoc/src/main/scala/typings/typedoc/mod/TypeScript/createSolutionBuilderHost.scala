package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.ReportEmitErrorSummary
import typings.typescript.mod.SolutionBuilderHost
import typings.typescript.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSolutionBuilderHost")
@js.native
object createSolutionBuilderHost extends js.Object {
  def apply[T /* <: BuilderProgram */](): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter
  ): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter,
    reportErrorSummary: ReportEmitErrorSummary
  ): SolutionBuilderHost[T] = js.native
}

