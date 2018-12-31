package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  val anchor: java.lang.String | scala.Null
  val comment: java.lang.String | scala.Null
  var context: ParseContext | scala.Null
  /** if not null, indicates a parser failure */
  var error: yamlLib.yamlMod.YAMLSyntaxError | scala.Null
  val hasComment: scala.Boolean
  val hasProps: scala.Boolean
  val jsonLike: scala.Boolean
  /** anchors, tags and comments */
  var props: js.Array[Range]
  /** span of context.src parsed into this node */
  var range: Range | scala.Null
  val rawValue: java.lang.String | scala.Null
  val tag: scala.Null | yamlLib.Anon_Verbatim | yamlLib.Anon_Suffix
  /** specific node type */
  var `type`: java.lang.String
  /** if non-null, overrides source value */
  var value: java.lang.String | scala.Null
  var valueRange: Range | scala.Null
  val valueRangeContainsNewline: scala.Boolean
}

