package typings
package vscodeDashLanguageclientLib.libProtocolCompletionItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ProtocolCompletionItem extends js.Object {
  var data: js.Any
  var deprecated: scala.Boolean
  var documentationFormat: java.lang.String
  var fromEdit: scala.Boolean
  var originalItemKind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItemKind
}

object ProtocolCompletionItem {
  @scala.inline
  def apply(
    data: js.Any,
    deprecated: scala.Boolean,
    documentationFormat: java.lang.String,
    fromEdit: scala.Boolean,
    originalItemKind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItemKind
  ): ProtocolCompletionItem = {
    val __obj = js.Dynamic.literal(data = data, deprecated = deprecated, documentationFormat = documentationFormat, fromEdit = fromEdit, originalItemKind = originalItemKind)
  
    __obj.asInstanceOf[ProtocolCompletionItem]
  }
}

