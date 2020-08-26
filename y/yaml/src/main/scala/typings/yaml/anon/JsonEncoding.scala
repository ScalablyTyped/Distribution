package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonEncoding extends js.Object {
  /**
    * Whether to restrict double-quoted strings to use JSON-compatible syntax.
    *
    * Default: `false`
    */
  var jsonEncoding: Boolean = js.native
  /**
    * Minimum length to use multiple lines to represent the value.
    *
    * Default: `40`
    */
  var minMultiLineLength: Double = js.native
}

object JsonEncoding {
  @scala.inline
  def apply(jsonEncoding: Boolean, minMultiLineLength: Double): JsonEncoding = {
    val __obj = js.Dynamic.literal(jsonEncoding = jsonEncoding.asInstanceOf[js.Any], minMultiLineLength = minMultiLineLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonEncoding]
  }
  @scala.inline
  implicit class JsonEncodingOps[Self <: JsonEncoding] (val x: Self) extends AnyVal {
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
    def setJsonEncoding(value: Boolean): Self = this.set("jsonEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinMultiLineLength(value: Double): Self = this.set("minMultiLineLength", value.asInstanceOf[js.Any])
  }
  
}

