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

object PublishDiagnosticsParams {
  @scala.inline
  def apply(
    diagnostics: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
    ],
    uri: java.lang.String,
    version: scala.Int | scala.Double = null
  ): PublishDiagnosticsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagnostics")(diagnostics)
    __obj.updateDynamic("uri")(uri)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishDiagnosticsParams]
  }
}

