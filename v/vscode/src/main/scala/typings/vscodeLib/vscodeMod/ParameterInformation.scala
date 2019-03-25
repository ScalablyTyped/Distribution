package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ParameterInformation")
@js.native
class ParameterInformation protected () extends js.Object {
  /**
  		 * Creates a new parameter information object.
  		 *
  		 * @param label A label string or inclusive start and exclusive end offsets within its containing signature label.
  		 * @param documentation A doc string.
  		 */
  def this(label: java.lang.String) = this()
  def this(label: js.Tuple2[scala.Double, scala.Double]) = this()
  def this(label: java.lang.String, documentation: java.lang.String) = this()
  def this(label: java.lang.String, documentation: MarkdownString) = this()
  def this(label: js.Tuple2[scala.Double, scala.Double], documentation: java.lang.String) = this()
  def this(label: js.Tuple2[scala.Double, scala.Double], documentation: MarkdownString) = this()
  /**
  		 * The human-readable doc-comment of this signature. Will be shown
  		 * in the UI but can be omitted.
  		 */
  var documentation: js.UndefOr[java.lang.String | MarkdownString] = js.native
  /**
  		 * The label of this signature.
  		 *
  		 * Either a string or inclusive start and exclusive end offsets within its containing
  		 * [signature label](#SignatureInformation.label). *Note*: A label of type string must be
  		 * a substring of its containing signature information's [label](#SignatureInformation.label).
  		 */
  var label: java.lang.String | (js.Tuple2[scala.Double, scala.Double]) = js.native
}

