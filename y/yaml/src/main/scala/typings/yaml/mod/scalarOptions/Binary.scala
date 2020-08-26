package typings.yaml.mod.scalarOptions

import typings.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binary extends js.Object {
  /**
    * The type of string literal used to stringify `!!binary` values.
    *
    * Default: `'BLOCK_LITERAL'`
    */
  var defaultType: Type = js.native
  /**
    * Maximum line width for `!!binary`.
    *
    * Default: `76`
    */
  var lineWidth: Double = js.native
}

object Binary {
  @scala.inline
  def apply(defaultType: Type, lineWidth: Double): Binary = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
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
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
  }
  
}

