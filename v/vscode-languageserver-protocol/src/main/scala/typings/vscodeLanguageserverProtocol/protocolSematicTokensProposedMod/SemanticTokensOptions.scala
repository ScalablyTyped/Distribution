package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.anon.Edits
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensOptions extends WorkDoneProgressOptions {
  
  /**
    * Server supports providing semantic tokens for a full document.
    */
  var documentProvider: js.UndefOr[Boolean | Edits] = js.native
  
  /**
    * The legend used by the server
    */
  var legend: SemanticTokensLegend = js.native
  
  /**
    * Server supports providing semantic tokens for a sepcific range
    * of a document.
    */
  var rangeProvider: js.UndefOr[Boolean] = js.native
}
object SemanticTokensOptions {
  
  @scala.inline
  def apply(legend: SemanticTokensLegend): SemanticTokensOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensOptions]
  }
  
  @scala.inline
  implicit class SemanticTokensOptionsOps[Self <: SemanticTokensOptions] (val x: Self) extends AnyVal {
    
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
    def setLegend(value: SemanticTokensLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentProvider(value: Boolean | Edits): Self = this.set("documentProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentProvider: Self = this.set("documentProvider", js.undefined)
    
    @scala.inline
    def setRangeProvider(value: Boolean): Self = this.set("rangeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeProvider: Self = this.set("rangeProvider", js.undefined)
  }
}
