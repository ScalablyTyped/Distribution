package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameParams extends js.Object {
  /**
    * The new name of the symbol. If the given name is not valid the
    * request must return a [ResponseError](#ResponseError) with an
    * appropriate message set.
    */
  var newName: java.lang.String
  /**
    * The position at which this request was sent.
    */
  var position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position
  /**
    * The document to rename.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object RenameParams {
  @scala.inline
  def apply(
    newName: java.lang.String,
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): RenameParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newName")(newName)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[RenameParams]
  }
}

