package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedCompletionEntry
  extends StObject
     with CachedCompletionEntryDetails
object ResolvedCompletionEntry {
  
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    isResolved: () => Boolean,
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): ResolvedCompletionEntry = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], isResolved = js.Any.fromFunction0(isResolved), kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedCompletionEntry]
  }
}
