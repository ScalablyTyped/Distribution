package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codehead extends js.Object {
  var code_head: js.UndefOr[String] = js.native
  var dot_shiftY: Double = js.native
  var flag: Boolean = js.native
  var gracenote_stem_down_extension: Double = js.native
  var gracenote_stem_up_extension: Double = js.native
  var head_width: Double = js.native
  var line_above: Double = js.native
  var line_below: Double = js.native
  var position: js.UndefOr[String] = js.native
  var rest: js.UndefOr[Boolean] = js.native
  var stem: Boolean = js.native
  var stem_down_extension: Double = js.native
  var stem_offset: Double = js.native
  var stem_up_extension: Double = js.native
  var tabnote_stem_down_extension: Double = js.native
  var tabnote_stem_up_extension: Double = js.native
}

object Codehead {
  @scala.inline
  def apply(
    dot_shiftY: Double,
    flag: Boolean,
    gracenote_stem_down_extension: Double,
    gracenote_stem_up_extension: Double,
    head_width: Double,
    line_above: Double,
    line_below: Double,
    stem: Boolean,
    stem_down_extension: Double,
    stem_offset: Double,
    stem_up_extension: Double,
    tabnote_stem_down_extension: Double,
    tabnote_stem_up_extension: Double
  ): Codehead = {
    val __obj = js.Dynamic.literal(dot_shiftY = dot_shiftY.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], gracenote_stem_down_extension = gracenote_stem_down_extension.asInstanceOf[js.Any], gracenote_stem_up_extension = gracenote_stem_up_extension.asInstanceOf[js.Any], head_width = head_width.asInstanceOf[js.Any], line_above = line_above.asInstanceOf[js.Any], line_below = line_below.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], stem_down_extension = stem_down_extension.asInstanceOf[js.Any], stem_offset = stem_offset.asInstanceOf[js.Any], stem_up_extension = stem_up_extension.asInstanceOf[js.Any], tabnote_stem_down_extension = tabnote_stem_down_extension.asInstanceOf[js.Any], tabnote_stem_up_extension = tabnote_stem_up_extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codehead]
  }
  @scala.inline
  implicit class CodeheadOps[Self <: Codehead] (val x: Self) extends AnyVal {
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
    def setDot_shiftY(value: Double): Self = this.set("dot_shiftY", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlag(value: Boolean): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def setGracenote_stem_down_extension(value: Double): Self = this.set("gracenote_stem_down_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setGracenote_stem_up_extension(value: Double): Self = this.set("gracenote_stem_up_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_width(value: Double): Self = this.set("head_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine_above(value: Double): Self = this.set("line_above", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine_below(value: Double): Self = this.set("line_below", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem(value: Boolean): Self = this.set("stem", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem_down_extension(value: Double): Self = this.set("stem_down_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem_offset(value: Double): Self = this.set("stem_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem_up_extension(value: Double): Self = this.set("stem_up_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabnote_stem_down_extension(value: Double): Self = this.set("tabnote_stem_down_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabnote_stem_up_extension(value: Double): Self = this.set("tabnote_stem_up_extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode_head(value: String): Self = this.set("code_head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode_head: Self = this.set("code_head", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRest(value: Boolean): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRest: Self = this.set("rest", js.undefined)
  }
  
}

