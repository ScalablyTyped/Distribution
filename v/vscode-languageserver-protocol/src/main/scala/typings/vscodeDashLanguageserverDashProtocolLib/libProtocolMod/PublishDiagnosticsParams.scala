package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishDiagnosticsParams extends js.Object {
  /**
    * An array of diagnostic information items.
    */
  var diagnostics: js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
  ]
  /**
    * The URI for which diagnostic information is reported.
    */
  var uri: java.lang.String
  /**
    * Optional the version number of the document the diagnostics are published for.
    */
  var version: js.UndefOr[scala.Double] = js.undefined
}

