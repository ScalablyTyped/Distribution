package typings.vueComponentCompilerUtils.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.typesMod.RawSourceMap
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCCustomBlock extends js.Object {
  var attrs: StringDictionary[String | `true`] = js.native
  var content: String = js.native
  var end: Double = js.native
  var map: js.UndefOr[RawSourceMap] = js.native
  var start: Double = js.native
  var `type`: String = js.native
}

object SFCCustomBlock {
  @scala.inline
  def apply(
    attrs: StringDictionary[String | `true`],
    content: String,
    end: Double,
    start: Double,
    `type`: String
  ): SFCCustomBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCCustomBlock]
  }
  @scala.inline
  implicit class SFCCustomBlockOps[Self <: SFCCustomBlock] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[String | `true`]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

