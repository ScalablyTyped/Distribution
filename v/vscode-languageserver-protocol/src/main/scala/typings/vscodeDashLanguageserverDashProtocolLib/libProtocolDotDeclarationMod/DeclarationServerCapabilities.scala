package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var declarationProvider: js.UndefOr[
    scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

