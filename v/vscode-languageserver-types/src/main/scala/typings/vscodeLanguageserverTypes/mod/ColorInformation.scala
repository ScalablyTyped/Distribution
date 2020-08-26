package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorInformation extends js.Object {
  /**
    * The actual color value for this color range.
    */
  var color: Color = js.native
  /**
    * The range in the document where this color appers.
    */
  var range: Range = js.native
}

@JSImport("vscode-languageserver-types", "ColorInformation")
@js.native
object ColorInformation extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(range: Range, color: Color): ColorInformation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = js.native
}

