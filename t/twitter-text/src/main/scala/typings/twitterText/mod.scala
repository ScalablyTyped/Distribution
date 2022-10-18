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
  
  inline def modifyIndicesFromUTF16ToUnicode(text: String, entities: js.Array[EntityWithIndices]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyIndicesFromUTF16ToUnicode")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def modifyIndicesFromUnicodeToUTF16(text: String, entities: js.Array[EntityWithIndices]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyIndicesFromUnicodeToUTF16")(text.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseTweet(text: String): ParsedTweet = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTweet")(text.asInstanceOf[js.Any]).asInstanceOf[ParsedTweet]
  inline def parseTweet(text: String, options: ParseTweetOptions): ParsedTweet = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTweet")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedTweet]
  
  object regexen {
    
    @JSImport("twitter-text", "regexen")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("twitter-text", "regexen.astralLetterAndMarks")
    @js.native
    def astralLetterAndMarks: js.RegExp = js.native
    inline def astralLetterAndMarks_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("astralLetterAndMarks")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.astralNumerals")
    @js.native
    def astralNumerals: js.RegExp = js.native
    inline def astralNumerals_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("astralNumerals")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.atSigns")
    @js.native
    def atSigns: js.RegExp = js.native
    inline def atSigns_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atSigns")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.bmpLetterAndMarks")
    @js.native
    def bmpLetterAndMarks: js.RegExp = js.native
    inline def bmpLetterAndMarks_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpLetterAndMarks")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.bmpNumerals")
    @js.native
    def bmpNumerals: js.RegExp = js.native
    inline def bmpNumerals_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpNumerals")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.cashtag")
    @js.native
    def cashtag: js.RegExp = js.native
    inline def cashtag_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cashtag")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.codePoint")
    @js.native
    def codePoint: js.RegExp = js.native
    inline def codePoint_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codePoint")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.cyrillicLettersAndMarks")
    @js.native
    def cyrillicLettersAndMarks: js.RegExp = js.native
    inline def cyrillicLettersAndMarks_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyrillicLettersAndMarks")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.endHashtagMatch")
    @js.native
    def endHashtagMatch: js.RegExp = js.native
    inline def endHashtagMatch_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endHashtagMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.endMentionMatch")
    @js.native
    def endMentionMatch: js.RegExp = js.native
    inline def endMentionMatch_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endMentionMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.extractUrl")
    @js.native
    def extractUrl: js.RegExp = js.native
    inline def extractUrl_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.hashSigns")
    @js.native
    def hashSigns: js.RegExp = js.native
    inline def hashSigns_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashSigns")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.hashtagAlpha")
    @js.native
    def hashtagAlpha: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.hashtagAlphaNumeric")
    @js.native
    def hashtagAlphaNumeric: js.RegExp = js.native
    inline def hashtagAlphaNumeric_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashtagAlphaNumeric")(x.asInstanceOf[js.Any])
    
    inline def hashtagAlpha_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashtagAlpha")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.hashtagBoundary")
    @js.native
    def hashtagBoundary: js.RegExp = js.native
    inline def hashtagBoundary_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashtagBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.hashtagSpecialChars")
    @js.native
    def hashtagSpecialChars: js.RegExp = js.native
    inline def hashtagSpecialChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashtagSpecialChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.invalidChars")
    @js.native
    def invalidChars: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.invalidCharsGroup")
    @js.native
    def invalidCharsGroup: js.RegExp = js.native
    inline def invalidCharsGroup_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCharsGroup")(x.asInstanceOf[js.Any])
    
    inline def invalidChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.invalidDomainChars")
    @js.native
    def invalidDomainChars: js.RegExp = js.native
    inline def invalidDomainChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidDomainChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.invalidUrlWithoutProtocolPrecedingChars")
    @js.native
    def invalidUrlWithoutProtocolPrecedingChars: js.RegExp = js.native
    inline def invalidUrlWithoutProtocolPrecedingChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidUrlWithoutProtocolPrecedingChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.latinAccentChars")
    @js.native
    def latinAccentChars: js.RegExp = js.native
    inline def latinAccentChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("latinAccentChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.nonBmpCodePairs")
    @js.native
    def nonBmpCodePairs: js.RegExp = js.native
    inline def nonBmpCodePairs_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonBmpCodePairs")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.punct")
    @js.native
    def punct: js.RegExp = js.native
    inline def punct_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("punct")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.rtlChars")
    @js.native
    def rtlChars: js.RegExp = js.native
    inline def rtlChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtlChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.spaces")
    @js.native
    def spaces: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.spacesGroup")
    @js.native
    def spacesGroup: js.RegExp = js.native
    inline def spacesGroup_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacesGroup")(x.asInstanceOf[js.Any])
    
    inline def spaces_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaces")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.urlHasHttps")
    @js.native
    def urlHasHttps: js.RegExp = js.native
    inline def urlHasHttps_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlHasHttps")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.urlHasProtocol")
    @js.native
    def urlHasProtocol: js.RegExp = js.native
    inline def urlHasProtocol_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlHasProtocol")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validAsciiDomain")
    @js.native
    def validAsciiDomain: js.RegExp = js.native
    inline def validAsciiDomain_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validAsciiDomain")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validCCTLD")
    @js.native
    def validCCTLD: js.RegExp = js.native
    inline def validCCTLD_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validCCTLD")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validCashtag")
    @js.native
    def validCashtag: js.RegExp = js.native
    inline def validCashtag_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validCashtag")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validDomain")
    @js.native
    def validDomain: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.validDomainChars")
    @js.native
    def validDomainChars: js.RegExp = js.native
    inline def validDomainChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validDomainChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validDomainName")
    @js.native
    def validDomainName: js.RegExp = js.native
    inline def validDomainName_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validDomainName")(x.asInstanceOf[js.Any])
    
    inline def validDomain_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validDomain")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validGTLD")
    @js.native
    def validGTLD: js.RegExp = js.native
    inline def validGTLD_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validGTLD")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validGeneralUrlPathChars")
    @js.native
    def validGeneralUrlPathChars: js.RegExp = js.native
    inline def validGeneralUrlPathChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validGeneralUrlPathChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validHashtag")
    @js.native
    def validHashtag: js.RegExp = js.native
    inline def validHashtag_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validHashtag")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validMentionOrList")
    @js.native
    def validMentionOrList: js.RegExp = js.native
    inline def validMentionOrList_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validMentionOrList")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validMentionPrecedingChars")
    @js.native
    def validMentionPrecedingChars: js.RegExp = js.native
    inline def validMentionPrecedingChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validMentionPrecedingChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validPortNumber")
    @js.native
    def validPortNumber: js.RegExp = js.native
    inline def validPortNumber_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validPortNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validPunycode")
    @js.native
    def validPunycode: js.RegExp = js.native
    inline def validPunycode_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validPunycode")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validReply")
    @js.native
    def validReply: js.RegExp = js.native
    inline def validReply_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validReply")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validSubdomain")
    @js.native
    def validSubdomain: js.RegExp = js.native
    inline def validSubdomain_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validSubdomain")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validTcoUrl")
    @js.native
    def validTcoUrl: js.RegExp = js.native
    inline def validTcoUrl_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validTcoUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validUrlBalancedParens")
    @js.native
    def validUrlBalancedParens: js.RegExp = js.native
    inline def validUrlBalancedParens_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlBalancedParens")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validUrlPath")
    @js.native
    def validUrlPath: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.validUrlPathEndingChars")
    @js.native
    def validUrlPathEndingChars: js.RegExp = js.native
    inline def validUrlPathEndingChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlPathEndingChars")(x.asInstanceOf[js.Any])
    
    inline def validUrlPath_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlPath")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validUrlPrecedingChars")
    @js.native
    def validUrlPrecedingChars: js.RegExp = js.native
    inline def validUrlPrecedingChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlPrecedingChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validUrlQueryChars")
    @js.native
    def validUrlQueryChars: js.RegExp = js.native
    inline def validUrlQueryChars_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlQueryChars")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validUrlQueryEndingChar")
    @js.native
    def validUrlQueryEndingChar: js.RegExp = js.native
    inline def validUrlQueryEndingChar_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validUrlQueryEndingChar")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlAuthority")
    @js.native
    def validateUrlAuthority: js.RegExp = js.native
    inline def validateUrlAuthority_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlAuthority")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlDecOctet")
    @js.native
    def validateUrlDecOctet: js.RegExp = js.native
    inline def validateUrlDecOctet_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlDecOctet")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlDomain")
    @js.native
    def validateUrlDomain: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.validateUrlDomainSegment")
    @js.native
    def validateUrlDomainSegment: js.RegExp = js.native
    inline def validateUrlDomainSegment_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlDomainSegment")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlDomainTld")
    @js.native
    def validateUrlDomainTld: js.RegExp = js.native
    inline def validateUrlDomainTld_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlDomainTld")(x.asInstanceOf[js.Any])
    
    inline def validateUrlDomain_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlDomain")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlFragment")
    @js.native
    def validateUrlFragment: js.RegExp = js.native
    inline def validateUrlFragment_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlHost")
    @js.native
    def validateUrlHost: js.RegExp = js.native
    inline def validateUrlHost_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlHost")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlIp")
    @js.native
    def validateUrlIp: js.RegExp = js.native
    inline def validateUrlIp_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlIp")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlIpv4")
    @js.native
    def validateUrlIpv4: js.RegExp = js.native
    inline def validateUrlIpv4_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlIpv4")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlIpv6")
    @js.native
    def validateUrlIpv6: js.RegExp = js.native
    inline def validateUrlIpv6_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlIpv6")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlPath")
    @js.native
    def validateUrlPath: js.RegExp = js.native
    inline def validateUrlPath_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlPath")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlPchar")
    @js.native
    def validateUrlPchar: js.RegExp = js.native
    inline def validateUrlPchar_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlPchar")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlPctEncoded")
    @js.native
    def validateUrlPctEncoded: js.RegExp = js.native
    inline def validateUrlPctEncoded_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlPctEncoded")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlPort")
    @js.native
    def validateUrlPort: js.RegExp = js.native
    inline def validateUrlPort_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlPort")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlQuery")
    @js.native
    def validateUrlQuery: js.RegExp = js.native
    inline def validateUrlQuery_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlScheme")
    @js.native
    def validateUrlScheme: js.RegExp = js.native
    inline def validateUrlScheme_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlScheme")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlSubDelims")
    @js.native
    def validateUrlSubDelims: js.RegExp = js.native
    inline def validateUrlSubDelims_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlSubDelims")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlSubDomainSegment")
    @js.native
    def validateUrlSubDomainSegment: js.RegExp = js.native
    inline def validateUrlSubDomainSegment_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlSubDomainSegment")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnencoded")
    @js.native
    def validateUrlUnencoded: js.RegExp = js.native
    inline def validateUrlUnencoded_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnencoded")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeAuthority")
    @js.native
    def validateUrlUnicodeAuthority: js.RegExp = js.native
    inline def validateUrlUnicodeAuthority_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeAuthority")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeDomain")
    @js.native
    def validateUrlUnicodeDomain: js.RegExp = js.native
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeDomainSegment")
    @js.native
    def validateUrlUnicodeDomainSegment: js.RegExp = js.native
    inline def validateUrlUnicodeDomainSegment_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeDomainSegment")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeDomainTld")
    @js.native
    def validateUrlUnicodeDomainTld: js.RegExp = js.native
    inline def validateUrlUnicodeDomainTld_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeDomainTld")(x.asInstanceOf[js.Any])
    
    inline def validateUrlUnicodeDomain_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeDomain")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeHost")
    @js.native
    def validateUrlUnicodeHost: js.RegExp = js.native
    inline def validateUrlUnicodeHost_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeHost")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnicodeSubDomainSegment")
    @js.native
    def validateUrlUnicodeSubDomainSegment: js.RegExp = js.native
    inline def validateUrlUnicodeSubDomainSegment_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnicodeSubDomainSegment")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUnreserved")
    @js.native
    def validateUrlUnreserved: js.RegExp = js.native
    inline def validateUrlUnreserved_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUnreserved")(x.asInstanceOf[js.Any])
    
    @JSImport("twitter-text", "regexen.validateUrlUserinfo")
    @js.native
    def validateUrlUserinfo: js.RegExp = js.native
    inline def validateUrlUserinfo_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateUrlUserinfo")(x.asInstanceOf[js.Any])
  }
  
  inline def splitTags(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitTags")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def standardizeIndices(text: String, startIndex: Double, endIndex: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeIndices")(text.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
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
      
      inline def setUrlEntitiesVarargs(value: UrlEntity*): Self = StObject.set(x, "urlEntities", js.Array(value*))
      
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
    
    var emojiParsingEnabled: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setEmojiParsingEnabled(value: Boolean): Self = StObject.set(x, "emojiParsingEnabled", value.asInstanceOf[js.Any])
      
      inline def setEmojiParsingEnabledUndefined: Self = StObject.set(x, "emojiParsingEnabled", js.undefined)
      
      inline def setMaxWeightedTweetLength(value: Double): Self = StObject.set(x, "maxWeightedTweetLength", value.asInstanceOf[js.Any])
      
      inline def setMaxWeightedTweetLengthUndefined: Self = StObject.set(x, "maxWeightedTweetLength", js.undefined)
      
      inline def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value*))
      
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
