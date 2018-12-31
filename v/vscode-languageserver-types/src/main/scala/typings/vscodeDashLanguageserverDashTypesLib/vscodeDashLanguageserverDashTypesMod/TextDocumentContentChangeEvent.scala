package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentContentChangeEvent extends js.Object {
  /**
    * The range of the document that changed.
    */
  var range: js.UndefOr[Range] = js.undefined
  /**
    * The length of the range that got replaced.
    */
  var rangeLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The new text of the document.
    */
  var text: java.lang.String
}

