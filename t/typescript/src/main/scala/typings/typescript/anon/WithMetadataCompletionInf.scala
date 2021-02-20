package typings.typescript.anon

import typings.typescript.mod.CompletionEntry
import typings.typescript.mod.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.WithMetadata<typescript.typescript.CompletionInfo> */
@js.native
trait WithMetadataCompletionInf extends StObject {
  
  var entries: js.Array[CompletionEntry] = js.native
  
  /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: Boolean = js.native
  
  var isMemberCompletion: Boolean = js.native
  
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: Boolean = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * In the absence of `CompletionEntry["replacementSpan"], the editor may choose whether to use
    * this span or its default one. If `CompletionEntry["replacementSpan"]` is defined, that span
    * must be used to commit that completion entry.
    */
  var optionalReplacementSpan: js.UndefOr[TextSpan] = js.native
}
object WithMetadataCompletionInf {
  
  @scala.inline
  def apply(
    entries: js.Array[CompletionEntry],
    isGlobalCompletion: Boolean,
    isMemberCompletion: Boolean,
    isNewIdentifierLocation: Boolean
  ): WithMetadataCompletionInf = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMetadataCompletionInf]
  }
  
  @scala.inline
  implicit class WithMetadataCompletionInfMutableBuilder[Self <: WithMetadataCompletionInf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: CompletionEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setIsGlobalCompletion(value: Boolean): Self = StObject.set(x, "isGlobalCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewIdentifierLocation(value: Boolean): Self = StObject.set(x, "isNewIdentifierLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOptionalReplacementSpan(value: TextSpan): Self = StObject.set(x, "optionalReplacementSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalReplacementSpanUndefined: Self = StObject.set(x, "optionalReplacementSpan", js.undefined)
  }
}
