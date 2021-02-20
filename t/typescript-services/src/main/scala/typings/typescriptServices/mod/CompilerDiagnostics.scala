package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.CompilerDiagnostics.IDiagnosticWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompilerDiagnostics {
  
  @JSImport("typescript-services", "CompilerDiagnostics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "CompilerDiagnostics.Alert")
  @js.native
  def Alert(output: String): Unit = js.native
  
  @JSImport("typescript-services", "CompilerDiagnostics.analysisPass")
  @js.native
  def analysisPass: Double = js.native
  @scala.inline
  def analysisPass_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("analysisPass")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "CompilerDiagnostics.assert")
  @js.native
  def assert(condition: Boolean, s: String): Unit = js.native
  
  @JSImport("typescript-services", "CompilerDiagnostics.debug")
  @js.native
  def debug: Boolean = js.native
  
  @JSImport("typescript-services", "CompilerDiagnostics.debugPrint")
  @js.native
  def debugPrint(s: String): Unit = js.native
  
  @scala.inline
  def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "CompilerDiagnostics.diagnosticWriter")
  @js.native
  def diagnosticWriter: IDiagnosticWriter = js.native
  @scala.inline
  def diagnosticWriter_=(x: IDiagnosticWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diagnosticWriter")(x.asInstanceOf[js.Any])
}
