package typings.twitterText

import org.scalablytyped.runtime.StringDictionary
import typings.twitterText.anon.End
import typings.twitterText.anon.ExtractUrlsWithoutProtocol
import typings.twitterText.anon.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter-text", "autoLink")
  @js.native
  def autoLink(text: String): String = js.native
  @JSImport("twitter-text", "autoLink")
  @js.native
  def autoLink(text: String, options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "autoLinkCashtags")
  @js.native
  def autoLinkCashtags(text: String): String = js.native
  @JSImport("twitter-text", "autoLinkCashtags")
  @js.native
  def autoLinkCashtags(text: String, options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "autoLinkEntities")
  @js.native
  def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices]): String = js.native
  @JSImport("twitter-text", "autoLinkEntities")
  @js.native
  def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices], options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "autoLinkHashtags")
  @js.native
  def autoLinkHashtags(text: String): String = js.native
  @JSImport("twitter-text", "autoLinkHashtags")
  @js.native
  def autoLinkHashtags(text: String, options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "autoLinkUrlsCustom")
  @js.native
  def autoLinkUrlsCustom(text: String): String = js.native
  @JSImport("twitter-text", "autoLinkUrlsCustom")
  @js.native
  def autoLinkUrlsCustom(text: String, options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "autoLinkUsernamesOrLists")
  @js.native
  def autoLinkUsernamesOrLists(text: String): String = js.native
  @JSImport("twitter-text", "autoLinkUsernamesOrLists")
  @js.native
  def autoLinkUsernamesOrLists(text: String, options: AutoLinkOptions): String = js.native
  
  @JSImport("twitter-text", "convertUnicodeIndices")
  @js.native
  def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices]): Unit = js.native
  @JSImport("twitter-text", "convertUnicodeIndices")
  @js.native
  def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices], indicesInUTF16: Boolean): Unit = js.native
  
  @JSImport("twitter-text", "extractCashtags")
  @js.native
  def extractCashtags(text: String): js.Array[String] = js.native
  
  @JSImport("twitter-text", "extractCashtagsWithIndices")
  @js.native
  def extractCashtagsWithIndices(text: String): js.Array[CashtagWithIndices] = js.native
  
  @JSImport("twitter-text", "extractEntitiesWithIndices")
  @js.native
  def extractEntitiesWithIndices(text: String): js.Array[EntityWithIndices] = js.native
  
  @JSImport("twitter-text", "extractHashtags")
  @js.native
  def extractHashtags(text: String): js.Array[String] = js.native
  
  @JSImport("twitter-text", "extractHashtagsWithIndices")
  @js.native
  def extractHashtagsWithIndices(text: String): js.Array[HashtagWithIndices] = js.native
  
  @JSImport("twitter-text", "extractMentions")
  @js.native
  def extractMentions(text: String): js.Array[String] = js.native
  
  @JSImport("twitter-text", "extractMentionsOrListsWithIndices")
  @js.native
  def extractMentionsOrListsWithIndices(text: String): js.Array[MentionOrListWithIndices] = js.native
  
  @JSImport("twitter-text", "extractMentionsWithIndices")
  @js.native
  def extractMentionsWithIndices(text: String): js.Array[MentionWithIndices] = js.native
  
  @JSImport("twitter-text", "extractReplies")
  @js.native
  def extractReplies(text: String): js.Array[String] = js.native
  
  @JSImport("twitter-text", "extractUrls")
  @js.native
  def extractUrls(text: String): js.Array[String] = js.native
  
  @JSImport("twitter-text", "extractUrlsWithIndices")
  @js.native
  def extractUrlsWithIndices(text: String): js.Array[UrlWithIndices] = js.native
  @JSImport("twitter-text", "extractUrlsWithIndices")
  @js.native
  def extractUrlsWithIndices(text: String, options: ExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = js.native
  
  @JSImport("twitter-text", "getTweetLength")
  @js.native
  def getTweetLength(text: String): Double = js.native
  @JSImport("twitter-text", "getTweetLength")
  @js.native
  def getTweetLength(text: String, options: TweetLengthOptions): Double = js.native
  
  @JSImport("twitter-text", "getUnicodeTextLength")
  @js.native
  def getUnicodeTextLength(text: String): Double = js.native
  
  @JSImport("twitter-text", "hasInvalidCharacters")
  @js.native
  def hasInvalidCharacters(text: String): Boolean = js.native
  
  @JSImport("twitter-text", "hitHighlight")
  @js.native
  def hitHighlight(text: String): String = js.native
  @JSImport("twitter-text", "hitHighlight")
  @js.native
  def hitHighlight(text: String, hits: js.UndefOr[scala.Nothing], options: Tag): String = js.native
  @JSImport("twitter-text", "hitHighlight")
  @js.native
  def hitHighlight(text: String, hits: js.Array[js.Array[Double]]): String = js.native
  @JSImport("twitter-text", "hitHighlight")
  @js.native
  def hitHighlight(text: String, hits: js.Array[js.Array[Double]], options: Tag): String = js.native
  
  @JSImport("twitter-text", "htmlEscape")
  @js.native
  def htmlEscape(text: String): String = js.native
  
  @JSImport("twitter-text", "isInvalidTweet")
  @js.native
  def isInvalidTweet(text: String): String = js.native
  
  @JSImport("twitter-text", "isValidHashtag")
  @js.native
  def isValidHashtag(hashtag: String): Boolean = js.native
  
  @JSImport("twitter-text", "isValidList")
  @js.native
  def isValidList(usernameList: String): Boolean = js.native
  
  @JSImport("twitter-text", "isValidUrl")
  @js.native
  def isValidUrl(url: String, unicodeDomains: Boolean, requireProtocol: Boolean): Boolean = js.native
  
  @JSImport("twitter-text", "isValidUsername")
  @js.native
  def isValidUsername(username: String): Boolean = js.native
  
  @JSImport("twitter-text", "modifyIndicesFromUTF16ToUnicode")
  @js.native
  def modifyIndicesFromUTF16ToUnicode[I](i: I): I = js.native
  
  @JSImport("twitter-text", "modifyIndicesFromUnicodeToUTF16")
  @js.native
  def modifyIndicesFromUnicodeToUTF16[I](i: I): I = js.native
  
  @JSImport("twitter-text", "parseTweet")
  @js.native
  def parseTweet(text: String): ParsedTweet = js.native
  @JSImport("twitter-text", "parseTweet")
  @js.native
  def parseTweet(text: String, options: ParseTweetOptions): ParsedTweet = js.native
  
  @JSImport("twitter-text", "splitTags")
  @js.native
  def splitTags(text: String): js.Array[String] = js.native
  
  type Attributes = StringDictionary[String | Null]
  
  @js.native
  trait AutoLinkOptions extends StObject {
    
    var cashtagClass: js.UndefOr[String] = js.native
    
    var cashtagUrlBase: js.UndefOr[String] = js.native
    
    var hashtagClass: js.UndefOr[String] = js.native
    
    var hashtagUrlBase: js.UndefOr[String] = js.native
    
    var htmlAttrs: js.UndefOr[Attributes] = js.native
    
    var htmlEscapeNonEntities: js.UndefOr[Boolean] = js.native
    
    var invisibleTagAttrs: js.UndefOr[String] = js.native
    
    var linkAttributeBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, Unit]] = js.native
    
    var linkTextBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* text */ String, Unit]] = js.native
    
    var listClass: js.UndefOr[String] = js.native
    
    var listUrlBase: js.UndefOr[String] = js.native
    
    var suppressNoFollow: js.UndefOr[Boolean] = js.native
    
    var symbolTag: js.UndefOr[String] = js.native
    
    var targetBlank: js.UndefOr[Boolean] = js.native
    
    var textWithSymbolTag: js.UndefOr[String] = js.native
    
    var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.native
    
    var usernameClass: js.UndefOr[String] = js.native
    
    var usernameIncludeSymbol: js.UndefOr[Boolean] = js.native
    
    var usernameUrlBase: js.UndefOr[String] = js.native
  }
  object AutoLinkOptions {
    
    @scala.inline
    def apply(): AutoLinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoLinkOptions]
    }
    
    @scala.inline
    implicit class AutoLinkOptionsMutableBuilder[Self <: AutoLinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCashtagClass(value: String): Self = StObject.set(x, "cashtagClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCashtagClassUndefined: Self = StObject.set(x, "cashtagClass", js.undefined)
      
      @scala.inline
      def setCashtagUrlBase(value: String): Self = StObject.set(x, "cashtagUrlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCashtagUrlBaseUndefined: Self = StObject.set(x, "cashtagUrlBase", js.undefined)
      
      @scala.inline
      def setHashtagClass(value: String): Self = StObject.set(x, "hashtagClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagClassUndefined: Self = StObject.set(x, "hashtagClass", js.undefined)
      
      @scala.inline
      def setHashtagUrlBase(value: String): Self = StObject.set(x, "hashtagUrlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUrlBaseUndefined: Self = StObject.set(x, "hashtagUrlBase", js.undefined)
      
      @scala.inline
      def setHtmlAttrs(value: Attributes): Self = StObject.set(x, "htmlAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttrsUndefined: Self = StObject.set(x, "htmlAttrs", js.undefined)
      
      @scala.inline
      def setHtmlEscapeNonEntities(value: Boolean): Self = StObject.set(x, "htmlEscapeNonEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlEscapeNonEntitiesUndefined: Self = StObject.set(x, "htmlEscapeNonEntities", js.undefined)
      
      @scala.inline
      def setInvisibleTagAttrs(value: String): Self = StObject.set(x, "invisibleTagAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleTagAttrsUndefined: Self = StObject.set(x, "invisibleTagAttrs", js.undefined)
      
      @scala.inline
      def setLinkAttributeBlock(value: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => Unit): Self = StObject.set(x, "linkAttributeBlock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLinkAttributeBlockUndefined: Self = StObject.set(x, "linkAttributeBlock", js.undefined)
      
      @scala.inline
      def setLinkTextBlock(value: (/* entity */ EntityWithIndices, /* text */ String) => Unit): Self = StObject.set(x, "linkTextBlock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLinkTextBlockUndefined: Self = StObject.set(x, "linkTextBlock", js.undefined)
      
      @scala.inline
      def setListClass(value: String): Self = StObject.set(x, "listClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassUndefined: Self = StObject.set(x, "listClass", js.undefined)
      
      @scala.inline
      def setListUrlBase(value: String): Self = StObject.set(x, "listUrlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUrlBaseUndefined: Self = StObject.set(x, "listUrlBase", js.undefined)
      
      @scala.inline
      def setSuppressNoFollow(value: Boolean): Self = StObject.set(x, "suppressNoFollow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressNoFollowUndefined: Self = StObject.set(x, "suppressNoFollow", js.undefined)
      
      @scala.inline
      def setSymbolTag(value: String): Self = StObject.set(x, "symbolTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTagUndefined: Self = StObject.set(x, "symbolTag", js.undefined)
      
      @scala.inline
      def setTargetBlank(value: Boolean): Self = StObject.set(x, "targetBlank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetBlankUndefined: Self = StObject.set(x, "targetBlank", js.undefined)
      
      @scala.inline
      def setTextWithSymbolTag(value: String): Self = StObject.set(x, "textWithSymbolTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWithSymbolTagUndefined: Self = StObject.set(x, "textWithSymbolTag", js.undefined)
      
      @scala.inline
      def setUrlEntities(value: js.Array[UrlEntity]): Self = StObject.set(x, "urlEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlEntitiesUndefined: Self = StObject.set(x, "urlEntities", js.undefined)
      
      @scala.inline
      def setUrlEntitiesVarargs(value: UrlEntity*): Self = StObject.set(x, "urlEntities", js.Array(value :_*))
      
      @scala.inline
      def setUsernameClass(value: String): Self = StObject.set(x, "usernameClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameClassUndefined: Self = StObject.set(x, "usernameClass", js.undefined)
      
      @scala.inline
      def setUsernameIncludeSymbol(value: Boolean): Self = StObject.set(x, "usernameIncludeSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameIncludeSymbolUndefined: Self = StObject.set(x, "usernameIncludeSymbol", js.undefined)
      
      @scala.inline
      def setUsernameUrlBase(value: String): Self = StObject.set(x, "usernameUrlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUrlBaseUndefined: Self = StObject.set(x, "usernameUrlBase", js.undefined)
    }
  }
  
  @js.native
  trait CashtagWithIndices extends EntityWithIndices {
    
    var cashtag: String = js.native
    
    var indices: js.Tuple2[Double, Double] = js.native
  }
  object CashtagWithIndices {
    
    @scala.inline
    def apply(cashtag: String, indices: js.Tuple2[Double, Double]): CashtagWithIndices = {
      val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[CashtagWithIndices]
    }
    
    @scala.inline
    implicit class CashtagWithIndicesMutableBuilder[Self <: CashtagWithIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCashtag(value: String): Self = StObject.set(x, "cashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twitterText.mod.HashtagWithIndices
    - typings.twitterText.mod.UrlWithIndices
    - typings.twitterText.mod.MentionWithIndices
    - typings.twitterText.mod.MentionOrListWithIndices
    - typings.twitterText.mod.CashtagWithIndices
  */
  trait EntityWithIndices extends StObject
  object EntityWithIndices {
    
    @scala.inline
    def CashtagWithIndices(cashtag: String, indices: js.Tuple2[Double, Double]): typings.twitterText.mod.CashtagWithIndices = {
      val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.CashtagWithIndices]
    }
    
    @scala.inline
    def HashtagWithIndices(hashtag: String, indices: js.Tuple2[Double, Double]): typings.twitterText.mod.HashtagWithIndices = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.HashtagWithIndices]
    }
    
    @scala.inline
    def MentionOrListWithIndices(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): typings.twitterText.mod.MentionOrListWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.MentionOrListWithIndices]
    }
    
    @scala.inline
    def MentionWithIndices(indices: js.Tuple2[Double, Double], screenName: String): typings.twitterText.mod.MentionWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.MentionWithIndices]
    }
    
    @scala.inline
    def UrlWithIndices(indices: js.Tuple2[Double, Double], url: String): typings.twitterText.mod.UrlWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.UrlWithIndices]
    }
  }
  
  @js.native
  trait HashtagWithIndices extends EntityWithIndices {
    
    var hashtag: String = js.native
    
    var indices: js.Tuple2[Double, Double] = js.native
  }
  object HashtagWithIndices {
    
    @scala.inline
    def apply(hashtag: String, indices: js.Tuple2[Double, Double]): HashtagWithIndices = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashtagWithIndices]
    }
    
    @scala.inline
    implicit class HashtagWithIndicesMutableBuilder[Self <: HashtagWithIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Indices extends StObject {
    
    var indices: js.Tuple2[Double, Double] = js.native
  }
  object Indices {
    
    @scala.inline
    def apply(indices: js.Tuple2[Double, Double]): Indices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indices]
    }
    
    @scala.inline
    implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MentionOrListWithIndices extends EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double] = js.native
    
    var listSlug: String = js.native
    
    var screenName: String = js.native
  }
  object MentionOrListWithIndices {
    
    @scala.inline
    def apply(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): MentionOrListWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionOrListWithIndices]
    }
    
    @scala.inline
    implicit class MentionOrListWithIndicesMutableBuilder[Self <: MentionOrListWithIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListSlug(value: String): Self = StObject.set(x, "listSlug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MentionWithIndices extends EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double] = js.native
    
    var screenName: String = js.native
  }
  object MentionWithIndices {
    
    @scala.inline
    def apply(indices: js.Tuple2[Double, Double], screenName: String): MentionWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionWithIndices]
    }
    
    @scala.inline
    implicit class MentionWithIndicesMutableBuilder[Self <: MentionWithIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseTweetOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.native
    
    var maxWeightedTweetLength: js.UndefOr[Double] = js.native
    
    var ranges: js.UndefOr[js.Array[End]] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var transformedURLLength: js.UndefOr[Double] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object ParseTweetOptions {
    
    @scala.inline
    def apply(): ParseTweetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseTweetOptions]
    }
    
    @scala.inline
    implicit class ParseTweetOptionsMutableBuilder[Self <: ParseTweetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      @scala.inline
      def setMaxWeightedTweetLength(value: Double): Self = StObject.set(x, "maxWeightedTweetLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWeightedTweetLengthUndefined: Self = StObject.set(x, "maxWeightedTweetLength", js.undefined)
      
      @scala.inline
      def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setTransformedURLLength(value: Double): Self = StObject.set(x, "transformedURLLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformedURLLengthUndefined: Self = StObject.set(x, "transformedURLLength", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ParsedTweet extends StObject {
    
    var displayRangeEnd: Double = js.native
    
    var displayRangeStart: Double = js.native
    
    var permillage: Double = js.native
    
    var valid: Boolean = js.native
    
    var validRangeEnd: Double = js.native
    
    var validRangeStart: Double = js.native
    
    var weightedLength: Double = js.native
  }
  object ParsedTweet {
    
    @scala.inline
    def apply(
      displayRangeEnd: Double,
      displayRangeStart: Double,
      permillage: Double,
      valid: Boolean,
      validRangeEnd: Double,
      validRangeStart: Double,
      weightedLength: Double
    ): ParsedTweet = {
      val __obj = js.Dynamic.literal(displayRangeEnd = displayRangeEnd.asInstanceOf[js.Any], displayRangeStart = displayRangeStart.asInstanceOf[js.Any], permillage = permillage.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validRangeEnd = validRangeEnd.asInstanceOf[js.Any], validRangeStart = validRangeStart.asInstanceOf[js.Any], weightedLength = weightedLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTweet]
    }
    
    @scala.inline
    implicit class ParsedTweetMutableBuilder[Self <: ParsedTweet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayRangeEnd(value: Double): Self = StObject.set(x, "displayRangeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayRangeStart(value: Double): Self = StObject.set(x, "displayRangeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermillage(value: Double): Self = StObject.set(x, "permillage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeEnd(value: Double): Self = StObject.set(x, "validRangeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeStart(value: Double): Self = StObject.set(x, "validRangeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightedLength(value: Double): Self = StObject.set(x, "weightedLength", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TweetLengthOptions extends StObject {
    
    var short_url_length: Double = js.native
    
    var short_url_length_https: Double = js.native
  }
  object TweetLengthOptions {
    
    @scala.inline
    def apply(short_url_length: Double, short_url_length_https: Double): TweetLengthOptions = {
      val __obj = js.Dynamic.literal(short_url_length = short_url_length.asInstanceOf[js.Any], short_url_length_https = short_url_length_https.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweetLengthOptions]
    }
    
    @scala.inline
    implicit class TweetLengthOptionsMutableBuilder[Self <: TweetLengthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShort_url_length(value: Double): Self = StObject.set(x, "short_url_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_url_length_https(value: Double): Self = StObject.set(x, "short_url_length_https", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UrlEntity extends StObject {
    
    var display_url: String = js.native
    
    var expanded_url: String = js.native
    
    var indices: js.Tuple2[Double, Double] = js.native
    
    var url: String = js.native
  }
  object UrlEntity {
    
    @scala.inline
    def apply(display_url: String, expanded_url: String, indices: js.Tuple2[Double, Double], url: String): UrlEntity = {
      val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlEntity]
    }
    
    @scala.inline
    implicit class UrlEntityMutableBuilder[Self <: UrlEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UrlWithIndices extends EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double] = js.native
    
    var url: String = js.native
  }
  object UrlWithIndices {
    
    @scala.inline
    def apply(indices: js.Tuple2[Double, Double], url: String): UrlWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithIndices]
    }
    
    @scala.inline
    implicit class UrlWithIndicesMutableBuilder[Self <: UrlWithIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
