package typings.stylus.anon

import typings.stylus.mod.Stylus.Dictionary
import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var filename: String = js.native
  var isList: Boolean = js.native
  var lineno: Double = js.native
  var map: Dictionary[Node] = js.native
  var nodes: js.Array[Node] = js.native
  var preserve: Boolean = js.native
}

object Map {
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
  ): Map = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], isList = isList.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__type(value: String): Self = this.set("__type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsList(value: Boolean): Self = this.set("isList", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: Dictionary[Node]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
  }
  
}

