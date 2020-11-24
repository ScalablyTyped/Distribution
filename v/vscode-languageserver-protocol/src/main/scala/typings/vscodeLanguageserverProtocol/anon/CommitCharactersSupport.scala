package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitCharactersSupport extends js.Object {
  
  /**
    * Client supports commit characters on a completion item.
    */
  var commitCharactersSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports the deprecated property on a completion item.
    */
  var deprecatedSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  
  /**
    * Client supports the preselect property on a completion item.
    */
  var preselectSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports snippets as insert text.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    */
  var snippetSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports the tag property on a completion item. Clients supporting
    * tags have to handle unknown tags gracefully. Clients especially need to
    * preserve unknown tags when sending a completion item back to the server in
    * a resolve call.
    *
    * @since 3.15.0
    */
  var tagSupport: js.UndefOr[ValueSetArray] = js.native
}
object CommitCharactersSupport {
  
  @scala.inline
  def apply(): CommitCharactersSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitCharactersSupport]
  }
  
  @scala.inline
  implicit class CommitCharactersSupportOps[Self <: CommitCharactersSupport] (val x: Self) extends AnyVal {
    
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
    def setCommitCharactersSupport(value: Boolean): Self = this.set("commitCharactersSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitCharactersSupport: Self = this.set("commitCharactersSupport", js.undefined)
    
    @scala.inline
    def setDeprecatedSupport(value: Boolean): Self = this.set("deprecatedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedSupport: Self = this.set("deprecatedSupport", js.undefined)
    
    @scala.inline
    def setDocumentationFormatVarargs(value: MarkupKind*): Self = this.set("documentationFormat", js.Array(value :_*))
    
    @scala.inline
    def setDocumentationFormat(value: js.Array[MarkupKind]): Self = this.set("documentationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationFormat: Self = this.set("documentationFormat", js.undefined)
    
    @scala.inline
    def setPreselectSupport(value: Boolean): Self = this.set("preselectSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreselectSupport: Self = this.set("preselectSupport", js.undefined)
    
    @scala.inline
    def setSnippetSupport(value: Boolean): Self = this.set("snippetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetSupport: Self = this.set("snippetSupport", js.undefined)
    
    @scala.inline
    def setTagSupport(value: ValueSetArray): Self = this.set("tagSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSupport: Self = this.set("tagSupport", js.undefined)
  }
}
