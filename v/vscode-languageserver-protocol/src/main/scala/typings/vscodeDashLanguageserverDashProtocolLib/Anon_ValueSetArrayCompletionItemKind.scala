package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ValueSetArrayCompletionItemKind extends js.Object {
  /**
               * The completion item kind values the client supports. When this
               * property exists the client also guarantees that it will
               * handle values outside its set gracefully and falls back
               * to a default value when unknown.
               *
               * If this property is not present the client only supports
               * the completion items kinds from `Text` to `Reference` as defined in
               * the initial version of the protocol.
               */
  var valueSet: js.UndefOr[
    js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItemKind
    ]
  ] = js.undefined
}

