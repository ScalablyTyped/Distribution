package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitCharactersSupport extends StObject {
  
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
  implicit class CommitCharactersSupportMutableBuilder[Self <: CommitCharactersSupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitCharactersSupport(value: Boolean): Self = StObject.set(x, "commitCharactersSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitCharactersSupportUndefined: Self = StObject.set(x, "commitCharactersSupport", js.undefined)
    
    @scala.inline
    def setDeprecatedSupport(value: Boolean): Self = StObject.set(x, "deprecatedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedSupportUndefined: Self = StObject.set(x, "deprecatedSupport", js.undefined)
    
    @scala.inline
    def setDocumentationFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "documentationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationFormatUndefined: Self = StObject.set(x, "documentationFormat", js.undefined)
    
    @scala.inline
    def setDocumentationFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "documentationFormat", js.Array(value :_*))
    
    @scala.inline
    def setPreselectSupport(value: Boolean): Self = StObject.set(x, "preselectSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselectSupportUndefined: Self = StObject.set(x, "preselectSupport", js.undefined)
    
    @scala.inline
    def setSnippetSupport(value: Boolean): Self = StObject.set(x, "snippetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetSupportUndefined: Self = StObject.set(x, "snippetSupport", js.undefined)
    
    @scala.inline
    def setTagSupport(value: ValueSetArray): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
  }
}
