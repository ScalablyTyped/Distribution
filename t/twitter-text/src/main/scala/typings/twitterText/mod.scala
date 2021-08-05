package typings.twitterText

import org.scalablytyped.runtime.StringDictionary
import typings.twitterText.anon.End
import typings.twitterText.anon.ExtractUrlsWithoutProtocol
import typings.twitterText.anon.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoLink(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autoLink")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autoLink(text: String, options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLink")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoLinkCashtags(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkCashtags")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autoLinkCashtags(text: String, options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkCashtags")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkEntities")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices], options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkEntities")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoLinkHashtags(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkHashtags")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autoLinkHashtags(text: String, options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkHashtags")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoLinkUrlsCustom(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkUrlsCustom")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autoLinkUrlsCustom(text: String, options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkUrlsCustom")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoLinkUsernamesOrLists(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkUsernamesOrLists")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autoLinkUsernamesOrLists(text: String, options: AutoLinkOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoLinkUsernamesOrLists")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnicodeIndices")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices], indicesInUTF16: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnicodeIndices")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any], indicesInUTF16.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractCashtags(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractCashtags")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extractCashtagsWithIndices(text: String): js.Array[CashtagWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractCashtagsWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[CashtagWithIndices]]
  
  inline def extractEntitiesWithIndices(text: String): js.Array[EntityWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractEntitiesWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[EntityWithIndices]]
  
  inline def extractHashtags(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHashtags")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extractHashtagsWithIndices(text: String): js.Array[HashtagWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHashtagsWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[HashtagWithIndices]]
  
  inline def extractMentions(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMentions")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extractMentionsOrListsWithIndices(text: String): js.Array[MentionOrListWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMentionsOrListsWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[MentionOrListWithIndices]]
  
  inline def extractMentionsWithIndices(text: String): js.Array[MentionWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMentionsWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[MentionWithIndices]]
  
  inline def extractReplies(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractReplies")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extractUrls(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrls")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extractUrlsWithIndices(text: String): js.Array[UrlWithIndices] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlsWithIndices")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[UrlWithIndices]]
  inline def extractUrlsWithIndices(text: String, options: ExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlsWithIndices")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[UrlWithIndices]]
  
  inline def getTweetLength(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTweetLength")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTweetLength(text: String, options: TweetLengthOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTweetLength")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getUnicodeTextLength(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnicodeTextLength")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasInvalidCharacters(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInvalidCharacters")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hitHighlight(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hitHighlight")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hitHighlight(text: String, hits: js.Array[js.Array[Double]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hitHighlight")(text.asInstanceOf[js.Any], hits.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hitHighlight(text: String, hits: js.Array[js.Array[Double]], options: Tag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hitHighlight")(text.asInstanceOf[js.Any], hits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hitHighlight(text: String, hits: Unit, options: Tag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hitHighlight")(text.asInstanceOf[js.Any], hits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def htmlEscape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isInvalidTweet(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalidTweet")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidHashtag(hashtag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHashtag")(hashtag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidList(usernameList: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidList")(usernameList.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidUrl(url: String, unicodeDomains: Boolean, requireProtocol: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidUrl")(url.asInstanceOf[js.Any], unicodeDomains.asInstanceOf[js.Any], requireProtocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidUsername(username: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUsername")(username.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def modifyIndicesFromUTF16ToUnicode[I](i: I): I = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyIndicesFromUTF16ToUnicode")(i.asInstanceOf[js.Any]).asInstanceOf[I]
  
  inline def modifyIndicesFromUnicodeToUTF16[I](i: I): I = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyIndicesFromUnicodeToUTF16")(i.asInstanceOf[js.Any]).asInstanceOf[I]
  
  inline def parseTweet(text: String): ParsedTweet = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTweet")(text.asInstanceOf[js.Any]).asInstanceOf[ParsedTweet]
  inline def parseTweet(text: String, options: ParseTweetOptions): ParsedTweet = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTweet")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedTweet]
  
  inline def splitTags(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitTags")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  type Attributes = StringDictionary[String | Null]
  
  trait AutoLinkOptions extends StObject {
    
    var cashtagClass: js.UndefOr[String] = js.undefined
    
    var cashtagUrlBase: js.UndefOr[String] = js.undefined
    
    var hashtagClass: js.UndefOr[String] = js.undefined
    
    var hashtagUrlBase: js.UndefOr[String] = js.undefined
    
    var htmlAttrs: js.UndefOr[Attributes] = js.undefined
    
    var htmlEscapeNonEntities: js.UndefOr[Boolean] = js.undefined
    
    var invisibleTagAttrs: js.UndefOr[String] = js.undefined
    
    var linkAttributeBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, Unit]] = js.undefined
    
    var linkTextBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* text */ String, Unit]] = js.undefined
    
    var listClass: js.UndefOr[String] = js.undefined
    
    var listUrlBase: js.UndefOr[String] = js.undefined
    
    var suppressNoFollow: js.UndefOr[Boolean] = js.undefined
    
    var symbolTag: js.UndefOr[String] = js.undefined
    
    var targetBlank: js.UndefOr[Boolean] = js.undefined
    
    var textWithSymbolTag: js.UndefOr[String] = js.undefined
    
    var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.undefined
    
    var usernameClass: js.UndefOr[String] = js.undefined
    
    var usernameIncludeSymbol: js.UndefOr[Boolean] = js.undefined
    
    var usernameUrlBase: js.UndefOr[String] = js.undefined
  }
  object AutoLinkOptions {
    
    inline def apply(): AutoLinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoLinkOptions]
    }
    
    extension [Self <: AutoLinkOptions](x: Self) {
      
      inline def setCashtagClass(value: String): Self = StObject.set(x, "cashtagClass", value.asInstanceOf[js.Any])
      
      inline def setCashtagClassUndefined: Self = StObject.set(x, "cashtagClass", js.undefined)
      
      inline def setCashtagUrlBase(value: String): Self = StObject.set(x, "cashtagUrlBase", value.asInstanceOf[js.Any])
      
      inline def setCashtagUrlBaseUndefined: Self = StObject.set(x, "cashtagUrlBase", js.undefined)
      
      inline def setHashtagClass(value: String): Self = StObject.set(x, "hashtagClass", value.asInstanceOf[js.Any])
      
      inline def setHashtagClassUndefined: Self = StObject.set(x, "hashtagClass", js.undefined)
      
      inline def setHashtagUrlBase(value: String): Self = StObject.set(x, "hashtagUrlBase", value.asInstanceOf[js.Any])
      
      inline def setHashtagUrlBaseUndefined: Self = StObject.set(x, "hashtagUrlBase", js.undefined)
      
      inline def setHtmlAttrs(value: Attributes): Self = StObject.set(x, "htmlAttrs", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttrsUndefined: Self = StObject.set(x, "htmlAttrs", js.undefined)
      
      inline def setHtmlEscapeNonEntities(value: Boolean): Self = StObject.set(x, "htmlEscapeNonEntities", value.asInstanceOf[js.Any])
      
      inline def setHtmlEscapeNonEntitiesUndefined: Self = StObject.set(x, "htmlEscapeNonEntities", js.undefined)
      
      inline def setInvisibleTagAttrs(value: String): Self = StObject.set(x, "invisibleTagAttrs", value.asInstanceOf[js.Any])
      
      inline def setInvisibleTagAttrsUndefined: Self = StObject.set(x, "invisibleTagAttrs", js.undefined)
      
      inline def setLinkAttributeBlock(value: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => Unit): Self = StObject.set(x, "linkAttributeBlock", js.Any.fromFunction2(value))
      
      inline def setLinkAttributeBlockUndefined: Self = StObject.set(x, "linkAttributeBlock", js.undefined)
      
      inline def setLinkTextBlock(value: (/* entity */ EntityWithIndices, /* text */ String) => Unit): Self = StObject.set(x, "linkTextBlock", js.Any.fromFunction2(value))
      
      inline def setLinkTextBlockUndefined: Self = StObject.set(x, "linkTextBlock", js.undefined)
      
      inline def setListClass(value: String): Self = StObject.set(x, "listClass", value.asInstanceOf[js.Any])
      
      inline def setListClassUndefined: Self = StObject.set(x, "listClass", js.undefined)
      
      inline def setListUrlBase(value: String): Self = StObject.set(x, "listUrlBase", value.asInstanceOf[js.Any])
      
      inline def setListUrlBaseUndefined: Self = StObject.set(x, "listUrlBase", js.undefined)
      
      inline def setSuppressNoFollow(value: Boolean): Self = StObject.set(x, "suppressNoFollow", value.asInstanceOf[js.Any])
      
      inline def setSuppressNoFollowUndefined: Self = StObject.set(x, "suppressNoFollow", js.undefined)
      
      inline def setSymbolTag(value: String): Self = StObject.set(x, "symbolTag", value.asInstanceOf[js.Any])
      
      inline def setSymbolTagUndefined: Self = StObject.set(x, "symbolTag", js.undefined)
      
      inline def setTargetBlank(value: Boolean): Self = StObject.set(x, "targetBlank", value.asInstanceOf[js.Any])
      
      inline def setTargetBlankUndefined: Self = StObject.set(x, "targetBlank", js.undefined)
      
      inline def setTextWithSymbolTag(value: String): Self = StObject.set(x, "textWithSymbolTag", value.asInstanceOf[js.Any])
      
      inline def setTextWithSymbolTagUndefined: Self = StObject.set(x, "textWithSymbolTag", js.undefined)
      
      inline def setUrlEntities(value: js.Array[UrlEntity]): Self = StObject.set(x, "urlEntities", value.asInstanceOf[js.Any])
      
      inline def setUrlEntitiesUndefined: Self = StObject.set(x, "urlEntities", js.undefined)
      
      inline def setUrlEntitiesVarargs(value: UrlEntity*): Self = StObject.set(x, "urlEntities", js.Array(value :_*))
      
      inline def setUsernameClass(value: String): Self = StObject.set(x, "usernameClass", value.asInstanceOf[js.Any])
      
      inline def setUsernameClassUndefined: Self = StObject.set(x, "usernameClass", js.undefined)
      
      inline def setUsernameIncludeSymbol(value: Boolean): Self = StObject.set(x, "usernameIncludeSymbol", value.asInstanceOf[js.Any])
      
      inline def setUsernameIncludeSymbolUndefined: Self = StObject.set(x, "usernameIncludeSymbol", js.undefined)
      
      inline def setUsernameUrlBase(value: String): Self = StObject.set(x, "usernameUrlBase", value.asInstanceOf[js.Any])
      
      inline def setUsernameUrlBaseUndefined: Self = StObject.set(x, "usernameUrlBase", js.undefined)
    }
  }
  
  trait CashtagWithIndices
    extends StObject
       with EntityWithIndices {
    
    var cashtag: String
    
    var indices: js.Tuple2[Double, Double]
  }
  object CashtagWithIndices {
    
    inline def apply(cashtag: String, indices: js.Tuple2[Double, Double]): CashtagWithIndices = {
      val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[CashtagWithIndices]
    }
    
    extension [Self <: CashtagWithIndices](x: Self) {
      
      inline def setCashtag(value: String): Self = StObject.set(x, "cashtag", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
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
    
    inline def CashtagWithIndices(cashtag: String, indices: js.Tuple2[Double, Double]): typings.twitterText.mod.CashtagWithIndices = {
      val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.CashtagWithIndices]
    }
    
    inline def HashtagWithIndices(hashtag: String, indices: js.Tuple2[Double, Double]): typings.twitterText.mod.HashtagWithIndices = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.HashtagWithIndices]
    }
    
    inline def MentionOrListWithIndices(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): typings.twitterText.mod.MentionOrListWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.MentionOrListWithIndices]
    }
    
    inline def MentionWithIndices(indices: js.Tuple2[Double, Double], screenName: String): typings.twitterText.mod.MentionWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.MentionWithIndices]
    }
    
    inline def UrlWithIndices(indices: js.Tuple2[Double, Double], url: String): typings.twitterText.mod.UrlWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.twitterText.mod.UrlWithIndices]
    }
  }
  
  trait HashtagWithIndices
    extends StObject
       with EntityWithIndices {
    
    var hashtag: String
    
    var indices: js.Tuple2[Double, Double]
  }
  object HashtagWithIndices {
    
    inline def apply(hashtag: String, indices: js.Tuple2[Double, Double]): HashtagWithIndices = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashtagWithIndices]
    }
    
    extension [Self <: HashtagWithIndices](x: Self) {
      
      inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  trait Indices extends StObject {
    
    var indices: js.Tuple2[Double, Double]
  }
  object Indices {
    
    inline def apply(indices: js.Tuple2[Double, Double]): Indices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indices]
    }
    
    extension [Self <: Indices](x: Self) {
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  trait MentionOrListWithIndices
    extends StObject
       with EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double]
    
    var listSlug: String
    
    var screenName: String
  }
  object MentionOrListWithIndices {
    
    inline def apply(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): MentionOrListWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionOrListWithIndices]
    }
    
    extension [Self <: MentionOrListWithIndices](x: Self) {
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setListSlug(value: String): Self = StObject.set(x, "listSlug", value.asInstanceOf[js.Any])
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  trait MentionWithIndices
    extends StObject
       with EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double]
    
    var screenName: String
  }
  object MentionWithIndices {
    
    inline def apply(indices: js.Tuple2[Double, Double], screenName: String): MentionWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionWithIndices]
    }
    
    extension [Self <: MentionWithIndices](x: Self) {
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseTweetOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.undefined
    
    var maxWeightedTweetLength: js.UndefOr[Double] = js.undefined
    
    var ranges: js.UndefOr[js.Array[End]] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var transformedURLLength: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object ParseTweetOptions {
    
    inline def apply(): ParseTweetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseTweetOptions]
    }
    
    extension [Self <: ParseTweetOptions](x: Self) {
      
      inline def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      inline def setMaxWeightedTweetLength(value: Double): Self = StObject.set(x, "maxWeightedTweetLength", value.asInstanceOf[js.Any])
      
      inline def setMaxWeightedTweetLengthUndefined: Self = StObject.set(x, "maxWeightedTweetLength", js.undefined)
      
      inline def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTransformedURLLength(value: Double): Self = StObject.set(x, "transformedURLLength", value.asInstanceOf[js.Any])
      
      inline def setTransformedURLLengthUndefined: Self = StObject.set(x, "transformedURLLength", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ParsedTweet extends StObject {
    
    var displayRangeEnd: Double
    
    var displayRangeStart: Double
    
    var permillage: Double
    
    var valid: Boolean
    
    var validRangeEnd: Double
    
    var validRangeStart: Double
    
    var weightedLength: Double
  }
  object ParsedTweet {
    
    inline def apply(
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
    
    extension [Self <: ParsedTweet](x: Self) {
      
      inline def setDisplayRangeEnd(value: Double): Self = StObject.set(x, "displayRangeEnd", value.asInstanceOf[js.Any])
      
      inline def setDisplayRangeStart(value: Double): Self = StObject.set(x, "displayRangeStart", value.asInstanceOf[js.Any])
      
      inline def setPermillage(value: Double): Self = StObject.set(x, "permillage", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidRangeEnd(value: Double): Self = StObject.set(x, "validRangeEnd", value.asInstanceOf[js.Any])
      
      inline def setValidRangeStart(value: Double): Self = StObject.set(x, "validRangeStart", value.asInstanceOf[js.Any])
      
      inline def setWeightedLength(value: Double): Self = StObject.set(x, "weightedLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait TweetLengthOptions extends StObject {
    
    var short_url_length: Double
    
    var short_url_length_https: Double
  }
  object TweetLengthOptions {
    
    inline def apply(short_url_length: Double, short_url_length_https: Double): TweetLengthOptions = {
      val __obj = js.Dynamic.literal(short_url_length = short_url_length.asInstanceOf[js.Any], short_url_length_https = short_url_length_https.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweetLengthOptions]
    }
    
    extension [Self <: TweetLengthOptions](x: Self) {
      
      inline def setShort_url_length(value: Double): Self = StObject.set(x, "short_url_length", value.asInstanceOf[js.Any])
      
      inline def setShort_url_length_https(value: Double): Self = StObject.set(x, "short_url_length_https", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlEntity extends StObject {
    
    var display_url: String
    
    var expanded_url: String
    
    var indices: js.Tuple2[Double, Double]
    
    var url: String
  }
  object UrlEntity {
    
    inline def apply(display_url: String, expanded_url: String, indices: js.Tuple2[Double, Double], url: String): UrlEntity = {
      val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlEntity]
    }
    
    extension [Self <: UrlEntity](x: Self) {
      
      inline def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
      
      inline def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlWithIndices
    extends StObject
       with EntityWithIndices {
    
    var indices: js.Tuple2[Double, Double]
    
    var url: String
  }
  object UrlWithIndices {
    
    inline def apply(indices: js.Tuple2[Double, Double], url: String): UrlWithIndices = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithIndices]
    }
    
    extension [Self <: UrlWithIndices](x: Self) {
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
