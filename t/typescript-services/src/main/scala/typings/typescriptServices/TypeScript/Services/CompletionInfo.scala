package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionInfo extends StObject {
  
  var entries: js.Array[CompletionEntry] = js.native
  
  var isMemberCompletion: Boolean = js.native
  
  var maybeInaccurate: Boolean = js.native
}
object CompletionInfo {
  
  @scala.inline
  def apply(entries: js.Array[CompletionEntry], isMemberCompletion: Boolean, maybeInaccurate: Boolean): CompletionInfo = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], maybeInaccurate = maybeInaccurate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionInfo]
  }
  
  @scala.inline
  implicit class CompletionInfoMutableBuilder[Self <: CompletionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: CompletionEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaybeInaccurate(value: Boolean): Self = StObject.set(x, "maybeInaccurate", value.asInstanceOf[js.Any])
  }
}
