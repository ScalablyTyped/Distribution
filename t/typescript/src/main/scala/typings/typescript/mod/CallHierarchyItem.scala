package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyItem extends js.Object {
  var file: java.lang.String
  var kind: ScriptElementKind
  var name: java.lang.String
  var selectionSpan: TextSpan
  var span: TextSpan
}

object CallHierarchyItem {
  @scala.inline
  def apply(
    file: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    selectionSpan: TextSpan,
    span: TextSpan
  ): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSpan = selectionSpan.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallHierarchyItem]
  }
}

