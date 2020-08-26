package typings.winkPosTagger.mod

import typings.winkPosTagger.anon.Lemma
import typings.winkTokenizer.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tagger extends js.Object {
  /**
    * This API has no effect. It has been maintained for compatibility purpose.
    * The wink-tokenizer will now always add lemma and normal forms.
    * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
    * @param config configuration object
    * @returns object with active configuration
    */
  def defineConfig(config: js.Any): Lemma = js.native
  /**
    * Tags the input tokens with their pos.
    * In order to pos tag a sentence directly, use tagSentence API instead
    * @param tokens array of tokens, as produced by the wink tokenizer
    * @return pos tagged tokens
    */
  def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken] = js.native
  /**
    * Tags the raw tokens with their pos.
    * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
    * @param tokens to be pos tagged. They are simple array of string.
    * @return pos tagged tokens
    */
  def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken] = js.native
  /**
    * Tokenizes the input sentence and tags the tokens.
    * @param sentence to be pos tagged
    * @return pos tagged tokens
    */
  def tagSentence(sentence: String): js.Array[PosTaggedToken] = js.native
  /**
    * Updates the internal lexicon using the input lexicon.
    * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
    * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
    * @return pos tagged tokens
    */
  def updateLexicon(lexicon: js.Object): Unit = js.native
}

object Tagger {
  @scala.inline
  def apply(
    defineConfig: js.Any => Lemma,
    tag: js.Array[Token] => js.Array[PosTaggedToken],
    tagRawTokens: js.Array[String] => js.Array[PosTaggedToken],
    tagSentence: String => js.Array[PosTaggedToken],
    updateLexicon: js.Object => Unit
  ): Tagger = {
    val __obj = js.Dynamic.literal(defineConfig = js.Any.fromFunction1(defineConfig), tag = js.Any.fromFunction1(tag), tagRawTokens = js.Any.fromFunction1(tagRawTokens), tagSentence = js.Any.fromFunction1(tagSentence), updateLexicon = js.Any.fromFunction1(updateLexicon))
    __obj.asInstanceOf[Tagger]
  }
  @scala.inline
  implicit class TaggerOps[Self <: Tagger] (val x: Self) extends AnyVal {
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
    def setDefineConfig(value: js.Any => Lemma): Self = this.set("defineConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setTag(value: js.Array[Token] => js.Array[PosTaggedToken]): Self = this.set("tag", js.Any.fromFunction1(value))
    @scala.inline
    def setTagRawTokens(value: js.Array[String] => js.Array[PosTaggedToken]): Self = this.set("tagRawTokens", js.Any.fromFunction1(value))
    @scala.inline
    def setTagSentence(value: String => js.Array[PosTaggedToken]): Self = this.set("tagSentence", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateLexicon(value: js.Object => Unit): Self = this.set("updateLexicon", js.Any.fromFunction1(value))
  }
  
}

