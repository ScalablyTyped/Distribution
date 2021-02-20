package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.CompilerDiagnostics.IDiagnosticWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompilerDiagnostics {
  
  @JSGlobal("TypeScript.CompilerDiagnostics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("TypeScript.CompilerDiagnostics.Alert")
  @js.native
  def Alert(output: String): Unit = js.native
  
  @JSGlobal("TypeScript.CompilerDiagnostics.analysisPass")
  @js.native
  def analysisPass: Double = js.native
  @scala.inline
  def analysisPass_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("analysisPass")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.CompilerDiagnostics.assert")
  @js.native
  def assert(condition: Boolean, s: String): Unit = js.native
  
  @JSGlobal("TypeScript.CompilerDiagnostics.debug")
  @js.native
  def debug: Boolean = js.native
  
  @JSGlobal("TypeScript.CompilerDiagnostics.debugPrint")
  @js.native
  def debugPrint(s: String): Unit = js.native
  
  @scala.inline
  def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.CompilerDiagnostics.diagnosticWriter")
  @js.native
  def diagnosticWriter: IDiagnosticWriter = js.native
  @scala.inline
  def diagnosticWriter_=(x: IDiagnosticWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diagnosticWriter")(x.asInstanceOf[js.Any])
}
