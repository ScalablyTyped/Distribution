package typings.atWordpressWordcount.atWordpressWordcountMod

import typings.atWordpressWordcount.Anon_Shortcodes
import typings.std.RegExp
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
  var l10n: Anon_Shortcodes
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
    l10n: Anon_Shortcodes,
    removeRegExp: RegExp,
    spaceRegExp: RegExp,
    wordsRegExp: RegExp
  ): Settings = {
    val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp, HTMLRegExp = HTMLRegExp, HTMLcommentRegExp = HTMLcommentRegExp, astralRegExp = astralRegExp, characters_excluding_spacesRegExp = characters_excluding_spacesRegExp, characters_including_spacesRegExp = characters_including_spacesRegExp, connectorRegExp = connectorRegExp, l10n = l10n, removeRegExp = removeRegExp, spaceRegExp = spaceRegExp, wordsRegExp = wordsRegExp)
  
    __obj.asInstanceOf[Settings]
  }
}

