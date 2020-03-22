package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyItem extends js.Object {
  /**
    * More detail for this item, e.g. the signature of a function.
    */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * The kind of this item.
    */
  var kind: SymbolKind
  /**
    * The name of this item.
    */
  var name: String
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
    */
  var range: Range
  /**
    * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
    * Must be contained by the [`range`](#CallHierarchyItem.range).
    */
  var selectionRange: Range
  /**
    * Tags for this item.
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.undefined
  /**
    * The resource identifier of this item.
    */
  var uri: DocumentUri
}

object CallHierarchyItem {
  @scala.inline
  def apply(
    kind: SymbolKind,
    name: String,
    range: Range,
    selectionRange: Range,
    uri: DocumentUri,
    detail: String = null,
    tags: js.Array[SymbolTag] = null
  ): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
}

