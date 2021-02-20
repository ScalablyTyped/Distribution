package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHighlight extends StObject {
  
  /**
    * The highlight kind, default is [text](#DocumentHighlightKind.Text).
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.native
  
  /**
    * The range this highlight applies to.
    */
  var range: Range = js.native
}
object DocumentHighlight {
  
  @scala.inline
  def apply(range: Range): DocumentHighlight = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlight]
  }
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  @JSImport("vscode-languageserver-types", "DocumentHighlight.create")
  @js.native
  def create(range: Range): DocumentHighlight = js.native
  @JSImport("vscode-languageserver-types", "DocumentHighlight.create")
  @js.native
  def create(range: Range, kind: DocumentHighlightKind): DocumentHighlight = js.native
  
  @scala.inline
  implicit class DocumentHighlightMutableBuilder[Self <: DocumentHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: DocumentHighlightKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
