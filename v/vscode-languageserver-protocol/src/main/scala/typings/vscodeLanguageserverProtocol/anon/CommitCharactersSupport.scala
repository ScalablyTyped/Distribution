package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitCharactersSupport extends StObject {
  
  /**
    * Client supports commit characters on a completion item.
    */
  var commitCharactersSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the deprecated property on a completion item.
    */
  var deprecatedSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  
  /**
    * Client supports the preselect property on a completion item.
    */
  var preselectSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports snippets as insert text.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    */
  var snippetSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the tag property on a completion item. Clients supporting
    * tags have to handle unknown tags gracefully. Clients especially need to
    * preserve unknown tags when sending a completion item back to the server in
    * a resolve call.
    *
    * @since 3.15.0
    */
  var tagSupport: js.UndefOr[ValueSetArray] = js.undefined
}
object CommitCharactersSupport {
  
  inline def apply(): CommitCharactersSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitCharactersSupport]
  }
  
  extension [Self <: CommitCharactersSupport](x: Self) {
    
    inline def setCommitCharactersSupport(value: Boolean): Self = StObject.set(x, "commitCharactersSupport", value.asInstanceOf[js.Any])
    
    inline def setCommitCharactersSupportUndefined: Self = StObject.set(x, "commitCharactersSupport", js.undefined)
    
    inline def setDeprecatedSupport(value: Boolean): Self = StObject.set(x, "deprecatedSupport", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedSupportUndefined: Self = StObject.set(x, "deprecatedSupport", js.undefined)
    
    inline def setDocumentationFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "documentationFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentationFormatUndefined: Self = StObject.set(x, "documentationFormat", js.undefined)
    
    inline def setDocumentationFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "documentationFormat", js.Array(value :_*))
    
    inline def setPreselectSupport(value: Boolean): Self = StObject.set(x, "preselectSupport", value.asInstanceOf[js.Any])
    
    inline def setPreselectSupportUndefined: Self = StObject.set(x, "preselectSupport", js.undefined)
    
    inline def setSnippetSupport(value: Boolean): Self = StObject.set(x, "snippetSupport", value.asInstanceOf[js.Any])
    
    inline def setSnippetSupportUndefined: Self = StObject.set(x, "snippetSupport", js.undefined)
    
    inline def setTagSupport(value: ValueSetArray): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    inline def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
  }
}
