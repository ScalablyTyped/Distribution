package typings.yaml.mod.scalarOptions

import typings.yaml.anon.JsonEncoding
import typings.yaml.anon.LineWidth
import typings.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Str extends js.Object {
  /**
    * The default type of string literal used to stringify values
    *
    * Default: `'PLAIN'`
    */
  var defaultType: Type = js.native
  var doubleQuoted: JsonEncoding = js.native
  var fold: LineWidth = js.native
}

object Str {
  @scala.inline
  def apply(defaultType: Type, doubleQuoted: JsonEncoding, fold: LineWidth): Str = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], doubleQuoted = doubleQuoted.asInstanceOf[js.Any], fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Str]
  }
  @scala.inline
  implicit class StrOps[Self <: Str] (val x: Self) extends AnyVal {
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
    def setDefaultType(value: Type): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubleQuoted(value: JsonEncoding): Self = this.set("doubleQuoted", value.asInstanceOf[js.Any])
    @scala.inline
    def setFold(value: LineWidth): Self = this.set("fold", value.asInstanceOf[js.Any])
  }
  
}

