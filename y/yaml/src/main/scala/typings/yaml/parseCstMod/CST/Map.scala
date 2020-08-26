package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map
  extends Node
     with ContentNode {
  /** implicit keys are not wrapped */
  var items: js.Array[BlankLine | Comment | Alias | Scalar | MapItem] = js.native
  @JSName("type")
  var type_Map: MAP = js.native
}

object Map {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | Alias | Scalar | MapItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP,
    valueRangeContainsNewline: Boolean
  ): Map = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setItemsVarargs(value: (BlankLine | Comment | Alias | Scalar | MapItem)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[BlankLine | Comment | Alias | Scalar | MapItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MAP): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

