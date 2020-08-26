package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.ALIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias
  extends Node
     with ContentNode {
  /** contain the anchor without the * prefix */
  @JSName("rawValue")
  val rawValue_Alias: String = js.native
  @JSName("type")
  var type_Alias: ALIAS = js.native
}

object Alias {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: String,
    `type`: ALIAS,
    valueRangeContainsNewline: Boolean
  ): Alias = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
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
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ALIAS): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

