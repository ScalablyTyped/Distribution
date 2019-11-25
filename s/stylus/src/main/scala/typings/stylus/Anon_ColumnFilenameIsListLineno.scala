package typings.stylus

import typings.stylus.stylusMod.Stylus.Dictionary
import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameIsListLineno extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var isList: Boolean
  var lineno: Double
  var map: Dictionary[Node]
  var nodes: js.Array[Node]
  var preserve: Boolean
}

object Anon_ColumnFilenameIsListLineno {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    isList: Boolean,
    lineno: Double,
    map: Dictionary[Node],
    nodes: js.Array[Node],
    preserve: Boolean
  ): Anon_ColumnFilenameIsListLineno = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], isList = isList.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameIsListLineno]
  }
}

