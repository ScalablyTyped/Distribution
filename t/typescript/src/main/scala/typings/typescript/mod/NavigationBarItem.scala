package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navigation bar interface designed for visual studio's dual-column layout.
  * This does not form a proper tree.
  * The navbar is returned as a list of top-level items, each of which has a list of child items.
  * Child items always have an empty array for their `childItems`.
  */
@js.native
trait NavigationBarItem extends js.Object {
  var bolded: Boolean = js.native
  var childItems: js.Array[NavigationBarItem] = js.native
  var grayed: Boolean = js.native
  var indent: Double = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var spans: js.Array[TextSpan] = js.native
  var text: java.lang.String = js.native
}

object NavigationBarItem {
  @scala.inline
  def apply(
    bolded: Boolean,
    childItems: js.Array[NavigationBarItem],
    grayed: Boolean,
    indent: Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded.asInstanceOf[js.Any], childItems = childItems.asInstanceOf[js.Any], grayed = grayed.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarItem]
  }
  @scala.inline
  implicit class NavigationBarItemOps[Self <: NavigationBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBolded(value: Boolean): Self = this.set("bolded", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildItemsVarargs(value: NavigationBarItem*): Self = this.set("childItems", js.Array(value :_*))
    @scala.inline
    def setChildItems(value: js.Array[NavigationBarItem]): Self = this.set("childItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayed(value: Boolean): Self = this.set("grayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpansVarargs(value: TextSpan*): Self = this.set("spans", js.Array(value :_*))
    @scala.inline
    def setSpans(value: js.Array[TextSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

