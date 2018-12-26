package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextEdit")
@js.native
object TextEditNs extends js.Object {
  /**
       * Creates a delete text edit.
       * @param range The range of text to be deleted.
       */
  def del(range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  /**
       * Creates a insert text edit.
       * @param position The position to insert the text at.
       * @param newText The text to be inserted.
       */
  def insert(
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    newText: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def is(value: js.Any): /* is TextEdit */scala.Boolean = js.native
  /**
       * Creates a replace text edit.
       * @param range The range of text to be replaced.
       * @param newText The new text.
       */
  def replace(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    newText: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
}

