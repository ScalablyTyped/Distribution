package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends DiagnosticRelatedInformation {
  
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.native
  
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.native
  
  var source: js.UndefOr[java.lang.String] = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String | DiagnosticMessageChain): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit class DiagnosticOps[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = this.set("relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = this.set("relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedInformation: Self = this.set("relatedInformation", js.undefined)
    
    @scala.inline
    def setReportsDeprecated(value: js.Object): Self = this.set("reportsDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportsDeprecated: Self = this.set("reportsDeprecated", js.undefined)
    
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = this.set("reportsUnnecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportsUnnecessary: Self = this.set("reportsUnnecessary", js.undefined)
    
    @scala.inline
    def setSource(value: java.lang.String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
