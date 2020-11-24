package typings.tsLoader.interfacesMod

import typings.std.Map
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionDiagnostics extends js.Object {
  
  var global: js.Array[Diagnostic] = js.native
  
  var perFile: Map[String, js.Array[Diagnostic]] = js.native
  
  var transpileErrors: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]] = js.native
}
object SolutionDiagnostics {
  
  @scala.inline
  def apply(
    global: js.Array[Diagnostic],
    perFile: Map[String, js.Array[Diagnostic]],
    transpileErrors: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]]
  ): SolutionDiagnostics = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], perFile = perFile.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionDiagnostics]
  }
  
  @scala.inline
  implicit class SolutionDiagnosticsOps[Self <: SolutionDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobalVarargs(value: Diagnostic*): Self = this.set("global", js.Array(value :_*))
    
    @scala.inline
    def setGlobal(value: js.Array[Diagnostic]): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerFile(value: Map[String, js.Array[Diagnostic]]): Self = this.set("perFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranspileErrorsVarargs(value: (js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]])*): Self = this.set("transpileErrors", js.Array(value :_*))
    
    @scala.inline
    def setTranspileErrors(value: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]]): Self = this.set("transpileErrors", value.asInstanceOf[js.Any])
  }
}
