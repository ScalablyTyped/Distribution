package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingOptions extends js.Object {
  var indentSpaces: Double
  var newLineCharacter: String
  var spacesPerTab: Double
  var useTabs: Boolean
}

object FormattingOptions {
  @scala.inline
  def apply(indentSpaces: Double, newLineCharacter: String, spacesPerTab: Double, useTabs: Boolean): FormattingOptions = {
    val __obj = js.Dynamic.literal(indentSpaces = indentSpaces.asInstanceOf[js.Any], newLineCharacter = newLineCharacter.asInstanceOf[js.Any], spacesPerTab = spacesPerTab.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
}

