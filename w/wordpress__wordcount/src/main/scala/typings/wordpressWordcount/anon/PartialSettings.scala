package typings.wordpressWordcount.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/wordcount.@wordpress/wordcount.Settings> */
@js.native
trait PartialSettings extends js.Object {
  var HTMLEntityRegExp: js.UndefOr[RegExp] = js.native
  var HTMLRegExp: js.UndefOr[RegExp] = js.native
  var HTMLcommentRegExp: js.UndefOr[RegExp] = js.native
  var astralRegExp: js.UndefOr[RegExp] = js.native
  var characters_excluding_spacesRegExp: js.UndefOr[RegExp] = js.native
  var characters_including_spacesRegExp: js.UndefOr[RegExp] = js.native
  var connectorRegExp: js.UndefOr[RegExp] = js.native
  var l10n: js.UndefOr[Shortcodes] = js.native
  var removeRegExp: js.UndefOr[RegExp] = js.native
  var spaceRegExp: js.UndefOr[RegExp] = js.native
  var wordsRegExp: js.UndefOr[RegExp] = js.native
}

object PartialSettings {
  @scala.inline
  def apply(): PartialSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSettings]
  }
  @scala.inline
  implicit class PartialSettingsOps[Self <: PartialSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHTMLEntityRegExp(value: RegExp): Self = this.set("HTMLEntityRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTMLEntityRegExp: Self = this.set("HTMLEntityRegExp", js.undefined)
    @scala.inline
    def setHTMLRegExp(value: RegExp): Self = this.set("HTMLRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTMLRegExp: Self = this.set("HTMLRegExp", js.undefined)
    @scala.inline
    def setHTMLcommentRegExp(value: RegExp): Self = this.set("HTMLcommentRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTMLcommentRegExp: Self = this.set("HTMLcommentRegExp", js.undefined)
    @scala.inline
    def setAstralRegExp(value: RegExp): Self = this.set("astralRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstralRegExp: Self = this.set("astralRegExp", js.undefined)
    @scala.inline
    def setCharacters_excluding_spacesRegExp(value: RegExp): Self = this.set("characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacters_excluding_spacesRegExp: Self = this.set("characters_excluding_spacesRegExp", js.undefined)
    @scala.inline
    def setCharacters_including_spacesRegExp(value: RegExp): Self = this.set("characters_including_spacesRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacters_including_spacesRegExp: Self = this.set("characters_including_spacesRegExp", js.undefined)
    @scala.inline
    def setConnectorRegExp(value: RegExp): Self = this.set("connectorRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorRegExp: Self = this.set("connectorRegExp", js.undefined)
    @scala.inline
    def setL10n(value: Shortcodes): Self = this.set("l10n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL10n: Self = this.set("l10n", js.undefined)
    @scala.inline
    def setRemoveRegExp(value: RegExp): Self = this.set("removeRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveRegExp: Self = this.set("removeRegExp", js.undefined)
    @scala.inline
    def setSpaceRegExp(value: RegExp): Self = this.set("spaceRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceRegExp: Self = this.set("spaceRegExp", js.undefined)
    @scala.inline
    def setWordsRegExp(value: RegExp): Self = this.set("wordsRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordsRegExp: Self = this.set("wordsRegExp", js.undefined)
  }
  
}

