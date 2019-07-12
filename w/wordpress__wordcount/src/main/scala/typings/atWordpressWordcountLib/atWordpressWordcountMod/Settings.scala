package typings
package atWordpressWordcountLib.atWordpressWordcountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var HTMLEntityRegExp: stdLib.RegExp
  var HTMLRegExp: stdLib.RegExp
  var HTMLcommentRegExp: stdLib.RegExp
  var astralRegExp: stdLib.RegExp
  var characters_excluding_spacesRegExp: stdLib.RegExp
  var characters_including_spacesRegExp: stdLib.RegExp
  var connectorRegExp: stdLib.RegExp
  var l10n: atWordpressWordcountLib.Anon_Shortcodes
  /** Characters to be removed from input text. */
  var removeRegExp: stdLib.RegExp
  var spaceRegExp: stdLib.RegExp
  var wordsRegExp: stdLib.RegExp
}

object Settings {
  @scala.inline
  def apply(
    HTMLEntityRegExp: stdLib.RegExp,
    HTMLRegExp: stdLib.RegExp,
    HTMLcommentRegExp: stdLib.RegExp,
    astralRegExp: stdLib.RegExp,
    characters_excluding_spacesRegExp: stdLib.RegExp,
    characters_including_spacesRegExp: stdLib.RegExp,
    connectorRegExp: stdLib.RegExp,
    l10n: atWordpressWordcountLib.Anon_Shortcodes,
    removeRegExp: stdLib.RegExp,
    spaceRegExp: stdLib.RegExp,
    wordsRegExp: stdLib.RegExp
  ): Settings = {
    val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp, HTMLRegExp = HTMLRegExp, HTMLcommentRegExp = HTMLcommentRegExp, astralRegExp = astralRegExp, characters_excluding_spacesRegExp = characters_excluding_spacesRegExp, characters_including_spacesRegExp = characters_including_spacesRegExp, connectorRegExp = connectorRegExp, l10n = l10n, removeRegExp = removeRegExp, spaceRegExp = spaceRegExp, wordsRegExp = wordsRegExp)
  
    __obj.asInstanceOf[Settings]
  }
}

