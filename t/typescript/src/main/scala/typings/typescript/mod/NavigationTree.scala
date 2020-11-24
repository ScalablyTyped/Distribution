package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
@js.native
trait NavigationTree extends js.Object {
  
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.native
  
  var kind: ScriptElementKind = js.native
  
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String = js.native
  
  var nameSpan: js.UndefOr[TextSpan] = js.native
  
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan] = js.native
  
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String = js.native
}
object NavigationTree {
  
  @scala.inline
  def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTree]
  }
  
  @scala.inline
  implicit class NavigationTreeOps[Self <: NavigationTree] (val x: Self) extends AnyVal {
    
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
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansVarargs(value: TextSpan*): Self = this.set("spans", js.Array(value :_*))
    
    @scala.inline
    def setSpans(value: js.Array[TextSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItemsVarargs(value: NavigationTree*): Self = this.set("childItems", js.Array(value :_*))
    
    @scala.inline
    def setChildItems(value: js.Array[NavigationTree]): Self = this.set("childItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildItems: Self = this.set("childItems", js.undefined)
    
    @scala.inline
    def setNameSpan(value: TextSpan): Self = this.set("nameSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameSpan: Self = this.set("nameSpan", js.undefined)
  }
}
