package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Diagnostic")
@js.native
class Diagnostic protected () extends js.Object {
  /**
  		 * Creates a new diagnostic object.
  		 *
  		 * @param range The range to which this diagnostic applies.
  		 * @param message The human-readable message.
  		 * @param severity The severity, default is [error](#DiagnosticSeverity.Error).
  		 */
  def this(range: Range, message: java.lang.String) = this()
  def this(range: Range, message: java.lang.String, severity: DiagnosticSeverity) = this()
  /**
  		 * A code or identifier for this diagnostics. Will not be surfaced
  		 * to the user, but should be used for later processing, e.g. when
  		 * providing [code actions](#CodeActionContext).
  		 */
  var code: js.UndefOr[java.lang.String | scala.Double] = js.native
  /**
  		 * The human-readable message.
  		 */
  var message: java.lang.String = js.native
  /**
  		 * The range to which this diagnostic applies.
  		 */
  var range: Range = js.native
  /**
  		 * An array of related diagnostic information, e.g. when symbol-names within
  		 * a scope collide all definitions can be marked via this property.
  		 */
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
  /**
  		 * The severity, default is [error](#DiagnosticSeverity.Error).
  		 */
  var severity: DiagnosticSeverity = js.native
  /**
  		 * A human-readable string describing the source of this
  		 * diagnostic, e.g. 'typescript' or 'super lint'.
  		 */
  var source: js.UndefOr[java.lang.String] = js.native
}

