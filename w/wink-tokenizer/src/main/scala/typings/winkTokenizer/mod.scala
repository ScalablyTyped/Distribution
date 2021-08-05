package typings.winkTokenizer

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wink-tokenizer", JSImport.Namespace)
  @js.native
  /**
    * create a tokenizer instance
    */
  class ^ ()
    extends StObject
       with Tokenizer
  
  /**
    * It defines 0 or more properties from the list of 14 properties.
    * A true value for a property ensures tokenization for that type of text;
    * whereas false value will mean that the tokenization of that type of text will not be attempted.
    *
    * An empty config object is equivalent to splitting on spaces.
    * Whatever tokens are created like this are tagged as alien
    * and z is the finger print code of this token type.
    */
  trait Config extends StObject {
    
    /**
      * such as $ or £ symbols
      * @default true
      */
    var currency: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var email: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var emoticon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var hashtag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var mention: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var number: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ordinals like 1st , 2nd , 3rd , 4th or 12th or 91st
      * @default true
      */
    var ordinal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var punctuation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var quoted_phrase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var symbol: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var time: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var url: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var word: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCurrency(value: Boolean): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setEmoticon(value: Boolean): Self = StObject.set(x, "emoticon", value.asInstanceOf[js.Any])
      
      inline def setEmoticonUndefined: Self = StObject.set(x, "emoticon", js.undefined)
      
      inline def setHashtag(value: Boolean): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: Boolean): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOrdinal(value: Boolean): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setPunctuation(value: Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      inline def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
      
      inline def setQuoted_phrase(value: Boolean): Self = StObject.set(x, "quoted_phrase", value.asInstanceOf[js.Any])
      
      inline def setQuoted_phraseUndefined: Self = StObject.set(x, "quoted_phrase", js.undefined)
      
      inline def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWord(value: Boolean): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.winkTokenizer.winkTokenizerStrings.word
    - typings.winkTokenizer.winkTokenizerStrings.email
    - typings.winkTokenizer.winkTokenizerStrings.emoji
    - typings.winkTokenizer.winkTokenizerStrings.punctuation
    - typings.winkTokenizer.winkTokenizerStrings.number
    - typings.winkTokenizer.winkTokenizerStrings.time
    - typings.winkTokenizer.winkTokenizerStrings.hashtag
    - typings.winkTokenizer.winkTokenizerStrings.mention
    - typings.winkTokenizer.winkTokenizerStrings.emoticon
    - typings.winkTokenizer.winkTokenizerStrings.ordinal
    - typings.winkTokenizer.winkTokenizerStrings.quoted_phrase
    - typings.winkTokenizer.winkTokenizerStrings.url
    - typings.winkTokenizer.winkTokenizerStrings.symbol
    - typings.winkTokenizer.winkTokenizerStrings.currency
    - typings.winkTokenizer.winkTokenizerStrings.alien
  */
  trait Tag extends StObject
  object Tag {
    
    inline def alien: typings.winkTokenizer.winkTokenizerStrings.alien = "alien".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.alien]
    
    inline def currency: typings.winkTokenizer.winkTokenizerStrings.currency = "currency".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.currency]
    
    inline def email: typings.winkTokenizer.winkTokenizerStrings.email = "email".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.email]
    
    inline def emoji: typings.winkTokenizer.winkTokenizerStrings.emoji = "emoji".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.emoji]
    
    inline def emoticon: typings.winkTokenizer.winkTokenizerStrings.emoticon = "emoticon".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.emoticon]
    
    inline def hashtag: typings.winkTokenizer.winkTokenizerStrings.hashtag = "hashtag".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.hashtag]
    
    inline def mention: typings.winkTokenizer.winkTokenizerStrings.mention = "mention".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.mention]
    
    inline def number: typings.winkTokenizer.winkTokenizerStrings.number = "number".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.number]
    
    inline def ordinal: typings.winkTokenizer.winkTokenizerStrings.ordinal = "ordinal".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.ordinal]
    
    inline def punctuation: typings.winkTokenizer.winkTokenizerStrings.punctuation = "punctuation".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.punctuation]
    
    inline def quoted_phrase: typings.winkTokenizer.winkTokenizerStrings.quoted_phrase = "quoted_phrase".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.quoted_phrase]
    
    inline def symbol: typings.winkTokenizer.winkTokenizerStrings.symbol = "symbol".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.symbol]
    
    inline def time: typings.winkTokenizer.winkTokenizerStrings.time = "time".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.time]
    
    inline def url: typings.winkTokenizer.winkTokenizerStrings.url = "url".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.url]
    
    inline def word: typings.winkTokenizer.winkTokenizerStrings.word = "word".asInstanceOf[typings.winkTokenizer.winkTokenizerStrings.word]
  }
  
  trait Token extends StObject {
    
    var tag: Tag
    
    var value: String
  }
  object Token {
    
    inline def apply(tag: Tag, value: String): Token = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tokenizer extends StObject {
    
    /**
      * Adds a regex for parsing a new type of token.
      * This regex can either be mapped to an existing tag or it allows creation of a new tag along with its finger print.
      * The uniqueness of the finger prints have to ensured by the user.
      * @param regex the new regular expression
      * @param tag tokens matching the regex will be assigned this tag
      * @param fingerprintCode
      */
    def addRegex(regex: RegExp, tag: String): Unit = js.native
    def addRegex(regex: RegExp, tag: String, fingerprintCode: String): Unit = js.native
    
    /**
      * Defines the configuration in terms of the types of token that will be extracted by tokenize() method.
      * Note by default, all types of tokens will be detected and tagged automatically.
      * @param config configuration object
      * @returns number of true parameters
      */
    def defineConfig(config: Config): Double = js.native
    
    /**
      * Returns the finger print of the tokens generated by the last call to tokenize().
      * A finger print is a string created by sequentially joining the unique code of each token's type.
      *
      * currency: 'r', email: 'e', emoji: 'j', emoticon: 'c',
      * hashtag: 'h', number: 'n', ordinal: 'o',
      * punctuation: token becomes fingerprint,
      * quoted_phrase: 'q', symbol: token becomes fingerprint,
      * time: 't', mention: 'm', url: 'u', word: 'w',
      * @return string of token types
      */
    def getTokensFP(): String = js.native
    
    /**
      * Tokenize a string
      * @param sentence to be tokenized
      * @returns tokens
      */
    def tokenize(sentence: String): js.Array[Token] = js.native
  }
}
