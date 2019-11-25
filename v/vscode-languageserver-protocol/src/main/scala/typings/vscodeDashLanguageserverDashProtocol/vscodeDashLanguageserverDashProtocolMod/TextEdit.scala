package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "TextEdit")
@js.native
object TextEdit extends js.Object {
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  def del(range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  def insert(
    position: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position,
    newText: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  def replace(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    newText: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
}

