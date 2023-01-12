package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachedCompletionEntryDetails
  extends StObject
     with CompletionEntryDetails {
  
  def isResolved(): Boolean
}
object CachedCompletionEntryDetails {
  
  inline def apply(
    docComment: String,
    fullSymbolName: String,
    isResolved: () => Boolean,
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CachedCompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], isResolved = js.Any.fromFunction0(isResolved), kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CachedCompletionEntryDetails] (val x: Self) extends AnyVal {
    
    inline def setIsResolved(value: () => Boolean): Self = StObject.set(x, "isResolved", js.Any.fromFunction0(value))
  }
}
