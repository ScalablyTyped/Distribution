package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTransliterate extends Options {
  /**
    * Ignore a list of strings untouched
    * @example tr('你好，世界', { ignore: ['你'] }) // 你 Hao , Shi Jie
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /**
    * Replace a list of string / regex in the source string into the provided target string before transliteration
    * The option can either be an array or an object
    * @example tr('你好，世界', { replace: {你: 'You'} }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [['你', 'You']] }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [[/你/g, 'You']] }) // You Hao , Shi Jie
    */
  var replace: js.UndefOr[OptionReplaceCombined] = js.native
  /**
    * Same as `replace` but after transliteration
    */
  var replaceAfter: js.UndefOr[OptionReplaceCombined] = js.native
  /**
    * Decides whether or not to trim the result string after transliteration
    * @default false
    */
  var trim: js.UndefOr[Boolean] = js.native
  /**
    * Any characters not known by this library will be replaced by a specific string `unknown`
    * @default ''
    */
  var unknown: js.UndefOr[String] = js.native
}

object OptionsTransliterate {
  @scala.inline
  def apply(): OptionsTransliterate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTransliterate]
  }
  @scala.inline
  implicit class OptionsTransliterateOps[Self <: OptionsTransliterate] (val x: Self) extends AnyVal {
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
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setReplaceVarargs(value: OptionReplaceArrayItem*): Self = this.set("replace", js.Array(value :_*))
    @scala.inline
    def setReplace(value: OptionReplaceCombined): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setReplaceAfterVarargs(value: OptionReplaceArrayItem*): Self = this.set("replaceAfter", js.Array(value :_*))
    @scala.inline
    def setReplaceAfter(value: OptionReplaceCombined): Self = this.set("replaceAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAfter: Self = this.set("replaceAfter", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    @scala.inline
    def setUnknown(value: String): Self = this.set("unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
  
}

