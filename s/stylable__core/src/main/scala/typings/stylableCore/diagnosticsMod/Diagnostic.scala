package typings.stylableCore.diagnosticsMod

import typings.postcss.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends js.Object {
  
  var message: String = js.native
  
  var node: Node = js.native
  
  var options: DiagnosticOptions = js.native
  
  var `type`: DiagnosticType = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(message: String, node: Node, options: DiagnosticOptions, `type`: DiagnosticType): Diagnostic = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit class DiagnosticOps[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: DiagnosticOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DiagnosticType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
