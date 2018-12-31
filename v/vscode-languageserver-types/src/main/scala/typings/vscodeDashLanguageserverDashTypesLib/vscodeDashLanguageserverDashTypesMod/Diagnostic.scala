package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  /**
    * The diagnostic's code, which usually appear in the user interface.
    */
  var code: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The diagnostic's message. It usually appears in the user interface
    */
  var message: java.lang.String
  /**
    * The range at which the message applies
    */
  var range: Range
  /**
    * An array of related diagnostic information, e.g. when symbol-names within
    * a scope collide all definitions can be marked via this property.
    */
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.undefined
  /**
    * The diagnostic's severity. Can be omitted. If omitted it is up to the
    * client to interpret diagnostics as error, warning, info or hint.
    */
  var severity: js.UndefOr[DiagnosticSeverity] = js.undefined
  /**
    * A human-readable string describing the source of this
    * diagnostic, e.g. 'typescript' or 'super lint'. It usually
    * appears in the user interface.
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

