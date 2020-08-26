package typings.winkTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * It defines 0 or more properties from the list of 14 properties.
  * A true value for a property ensures tokenization for that type of text;
  * whereas false value will mean that the tokenization of that type of text will not be attempted.
  *
  * An empty config object is equivalent to splitting on spaces.
  * Whatever tokens are created like this are tagged as alien
  * and z is the finger print code of this token type.
  */
@js.native
trait Config extends js.Object {
  /**
    * such as $ or £ symbols
    * @default true
    */
  var currency: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var email: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var emoji: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var emoticon: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var hashtag: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var mention: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var number: js.UndefOr[Boolean] = js.native
  /**
    * ordinals like 1st , 2nd , 3rd , 4th or 12th or 91st
    * @default true
    */
  var ordinal: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var punctuation: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var quoted_phrase: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var symbol: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var time: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var url: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var word: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setCurrency(value: Boolean): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setEmail(value: Boolean): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmoji(value: Boolean): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    @scala.inline
    def setEmoticon(value: Boolean): Self = this.set("emoticon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmoticon: Self = this.set("emoticon", js.undefined)
    @scala.inline
    def setHashtag(value: Boolean): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    @scala.inline
    def setMention(value: Boolean): Self = this.set("mention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    @scala.inline
    def setNumber(value: Boolean): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOrdinal(value: Boolean): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    @scala.inline
    def setPunctuation(value: Boolean): Self = this.set("punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePunctuation: Self = this.set("punctuation", js.undefined)
    @scala.inline
    def setQuoted_phrase(value: Boolean): Self = this.set("quoted_phrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoted_phrase: Self = this.set("quoted_phrase", js.undefined)
    @scala.inline
    def setSymbol(value: Boolean): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setUrl(value: Boolean): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWord(value: Boolean): Self = this.set("word", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
  
}

