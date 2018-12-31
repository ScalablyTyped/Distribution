package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentItem extends js.Object {
  /**
    * The text document's language identifier
    */
  var languageId: java.lang.String
  /**
    * The content of the opened text document.
    */
  var text: java.lang.String
  /**
    * The text document's uri.
    */
  var uri: java.lang.String
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: scala.Double
}

