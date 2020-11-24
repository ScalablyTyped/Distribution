package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticChangeEvent extends js.Object {
  
  /**
    * An array of resources for which diagnostics have changed.
    */
  val uris: js.Array[Uri] = js.native
}
object DiagnosticChangeEvent {
  
  @scala.inline
  def apply(uris: js.Array[Uri]): DiagnosticChangeEvent = {
    val __obj = js.Dynamic.literal(uris = uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticChangeEvent]
  }
  
  @scala.inline
  implicit class DiagnosticChangeEventOps[Self <: DiagnosticChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setUrisVarargs(value: Uri*): Self = this.set("uris", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[Uri]): Self = this.set("uris", value.asInstanceOf[js.Any])
  }
}
