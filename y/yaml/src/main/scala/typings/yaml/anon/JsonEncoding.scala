package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonEncoding extends js.Object {
  /**
    * Whether to restrict double-quoted strings to use JSON-compatible syntax.
    *
    * Default: `false`
    */
  var jsonEncoding: Boolean
  /**
    * Minimum length to use multiple lines to represent the value.
    *
    * Default: `40`
    */
  var minMultiLineLength: Double
}

object JsonEncoding {
  @scala.inline
  def apply(jsonEncoding: Boolean, minMultiLineLength: Double): JsonEncoding = {
    val __obj = js.Dynamic.literal(jsonEncoding = jsonEncoding.asInstanceOf[js.Any], minMultiLineLength = minMultiLineLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonEncoding]
  }
}

