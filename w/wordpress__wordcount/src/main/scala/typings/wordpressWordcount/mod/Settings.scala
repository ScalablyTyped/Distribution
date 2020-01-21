package typings.wordpressWordcount.mod

import typings.std.RegExp
import typings.wordpressWordcount.AnonShortcodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var HTMLEntityRegExp: RegExp
  var HTMLRegExp: RegExp
  var HTMLcommentRegExp: RegExp
  var astralRegExp: RegExp
  var characters_excluding_spacesRegExp: RegExp
  var characters_including_spacesRegExp: RegExp
  var connectorRegExp: RegExp
  var l10n: AnonShortcodes
  /** Characters to be removed from input text. */
  var removeRegExp: RegExp
  var spaceRegExp: RegExp
  var wordsRegExp: RegExp
}

object Settings {
  @scala.inline
  def apply(
    HTMLEntityRegExp: RegExp,
    HTMLRegExp: RegExp,
    HTMLcommentRegExp: RegExp,
    astralRegExp: RegExp,
    characters_excluding_spacesRegExp: RegExp,
    characters_including_spacesRegExp: RegExp,
    connectorRegExp: RegExp,
    l10n: AnonShortcodes,
    removeRegExp: RegExp,
    spaceRegExp: RegExp,
    wordsRegExp: RegExp
  ): Settings = {
    val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp.asInstanceOf[js.Any], HTMLRegExp = HTMLRegExp.asInstanceOf[js.Any], HTMLcommentRegExp = HTMLcommentRegExp.asInstanceOf[js.Any], astralRegExp = astralRegExp.asInstanceOf[js.Any], characters_excluding_spacesRegExp = characters_excluding_spacesRegExp.asInstanceOf[js.Any], characters_including_spacesRegExp = characters_including_spacesRegExp.asInstanceOf[js.Any], connectorRegExp = connectorRegExp.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], removeRegExp = removeRegExp.asInstanceOf[js.Any], spaceRegExp = spaceRegExp.asInstanceOf[js.Any], wordsRegExp = wordsRegExp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

