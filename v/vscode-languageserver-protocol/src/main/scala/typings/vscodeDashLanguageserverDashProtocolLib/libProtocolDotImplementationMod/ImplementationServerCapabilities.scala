package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImplementationServerCapabilities extends js.Object {
  /**
       * The server provides Goto Implementation support.
       */
  var implementationProvider: js.UndefOr[
    scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

