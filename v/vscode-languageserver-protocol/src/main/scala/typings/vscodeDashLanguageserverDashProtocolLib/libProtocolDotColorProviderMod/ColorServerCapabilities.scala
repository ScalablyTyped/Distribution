package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorServerCapabilities extends js.Object {
  /**
    * The server provides color provider support.
    */
  var colorProvider: js.UndefOr[
    scala.Boolean | ColorProviderOptions | (ColorProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

