package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColorPresentationParams extends js.Object {
  /**
       * The color to request presentations for.
       */
  var color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color
  /**
       * The range where the color would be inserted. Serves as a context.
       */
  var range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  /**
       * The text document.
       */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

