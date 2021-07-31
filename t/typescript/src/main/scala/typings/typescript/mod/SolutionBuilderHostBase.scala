package typings.typescript.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilderHostBase[T /* <: BuilderProgram */]
  extends StObject
     with ProgramHost[T] {
  
  var afterProgramEmitAndDiagnostics: js.UndefOr[js.Function1[/* program */ T, Unit]] = js.native
  
  var createDirectory: js.UndefOr[js.Function1[/* path */ java.lang.String, Unit]] = js.native
  
  def deleteFile(fileName: java.lang.String): Unit = js.native
  
  def getModifiedTime(fileName: java.lang.String): js.UndefOr[Date] = js.native
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ java.lang.String, js.UndefOr[ParsedCommandLine]]] = js.native
  
  def reportDiagnostic(diagnostic: Diagnostic): Unit = js.native
  @JSName("reportDiagnostic")
  var reportDiagnostic_Original: DiagnosticReporter = js.native
  
  def reportSolutionBuilderStatus(diagnostic: Diagnostic): Unit = js.native
  @JSName("reportSolutionBuilderStatus")
  var reportSolutionBuilderStatus_Original: DiagnosticReporter = js.native
  
  def setModifiedTime(fileName: java.lang.String, date: Date): Unit = js.native
  
  /**
    * Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
    * writeFileCallback
    */
  var writeFile: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String, 
      /* data */ java.lang.String, 
      /* writeByteOrderMark */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}
