package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextDocumentWillSaveEvent extends js.Object {
  /**
       * The document that will be saved
       */
  var document: TextDocument
  /**
       * The reason why save was triggered.
       */
  var reason: TextDocumentSaveReason
}

