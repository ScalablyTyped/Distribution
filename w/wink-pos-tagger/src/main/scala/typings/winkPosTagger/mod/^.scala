package typings.winkPosTagger.mod

import typings.winkPosTagger.AnonLemma
import typings.winkTokenizer.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wink-pos-tagger", JSImport.Namespace)
@js.native
/**
	 * create a tagger instance
	 */
class ^ () extends Tagger {
  /**
  	 * This API has no effect. It has been maintained for compatibility purpose.
  	 * The wink-tokenizer will now always add lemma and normal forms.
  	 * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
  	 * @param config configuration object
  	 * @returns object with active configuration
  	 */
  /* CompleteClass */
  override def defineConfig(config: js.Any): AnonLemma = js.native
  /**
  	 * Tags the input tokens with their pos.
  	 * In order to pos tag a sentence directly, use tagSentence API instead
  	 * @param tokens array of tokens, as produced by the wink tokenizer
  	 * @return pos tagged tokens
  	 */
  /* CompleteClass */
  override def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken] = js.native
  /**
  	 * Tags the raw tokens with their pos.
  	 * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
  	 * @param tokens to be pos tagged. They are simple array of string.
  	 * @return pos tagged tokens
  	 */
  /* CompleteClass */
  override def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken] = js.native
  /**
  	 * Tokenizes the input sentence and tags the tokens.
  	 * @param sentence to be pos tagged
  	 * @return pos tagged tokens
  	 */
  /* CompleteClass */
  override def tagSentence(sentence: String): js.Array[PosTaggedToken] = js.native
  /**
  	 * Updates the internal lexicon using the input lexicon.
  	 * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
  	 * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
  	 * @return pos tagged tokens
  	 */
  /* CompleteClass */
  override def updateLexicon(lexicon: js.Object): Unit = js.native
}

