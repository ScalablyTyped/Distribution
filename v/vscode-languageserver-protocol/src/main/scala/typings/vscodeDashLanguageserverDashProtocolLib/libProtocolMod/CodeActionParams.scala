package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeActionParams extends js.Object {
  /**
       * Context carrying additional information.
       */
  var context: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext
  /**
       * The range for which the command was invoked.
       */
  var range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  /**
       * The document in which the command was invoked.
       */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

