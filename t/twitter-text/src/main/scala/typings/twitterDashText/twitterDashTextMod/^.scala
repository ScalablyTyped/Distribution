package typings.twitterDashText.twitterDashTextMod

import typings.twitterDashText.Anon_ExtractUrlsWithoutProtocol
import typings.twitterDashText.Anon_Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def autoLink(text: String): String = js.native
  def autoLink(text: String, options: AutoLinkOptions): String = js.native
  def autoLinkCashtags(text: String): String = js.native
  def autoLinkCashtags(text: String, options: AutoLinkOptions): String = js.native
  def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices]): String = js.native
  def autoLinkEntities(text: String, entities: js.Array[EntityWithIndices], options: AutoLinkOptions): String = js.native
  def autoLinkHashtags(text: String): String = js.native
  def autoLinkHashtags(text: String, options: AutoLinkOptions): String = js.native
  def autoLinkUrlsCustom(text: String): String = js.native
  def autoLinkUrlsCustom(text: String, options: AutoLinkOptions): String = js.native
  def autoLinkUsernamesOrLists(text: String): String = js.native
  def autoLinkUsernamesOrLists(text: String, options: AutoLinkOptions): String = js.native
  def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices]): Unit = js.native
  def convertUnicodeIndices(text: String, entities: js.Array[EntityWithIndices], indicesInUTF16: Boolean): Unit = js.native
  def extractCashtags(text: String): js.Array[String] = js.native
  def extractCashtagsWithIndices(text: String): js.Array[CashtagWithIndices] = js.native
  def extractEntitiesWithIndices(text: String): js.Array[EntityWithIndices] = js.native
  def extractHashtags(text: String): js.Array[String] = js.native
  def extractHashtagsWithIndices(text: String): js.Array[HashtagWithIndices] = js.native
  def extractMentions(text: String): js.Array[String] = js.native
  def extractMentionsOrListsWithIndices(text: String): js.Array[MentionOrListWithIndices] = js.native
  def extractMentionsWithIndices(text: String): js.Array[MentionWithIndices] = js.native
  def extractReplies(text: String): js.Array[String] = js.native
  def extractUrls(text: String): js.Array[String] = js.native
  def extractUrlsWithIndices(text: String): js.Array[UrlWithIndices] = js.native
  def extractUrlsWithIndices(text: String, options: Anon_ExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = js.native
  def getTweetLength(text: String): Double = js.native
  def getTweetLength(text: String, options: TweetLengthOptions): Double = js.native
  def getUnicodeTextLength(text: String): Double = js.native
  def hasInvalidCharacters(text: String): Boolean = js.native
  def hitHighlight(text: String): String = js.native
  def hitHighlight(text: String, hits: js.Array[js.Array[Double]]): String = js.native
  def hitHighlight(text: String, hits: js.Array[js.Array[Double]], options: Anon_Tag): String = js.native
  def htmlEscape(text: String): String = js.native
  def isInvalidTweet(text: String): String = js.native
  def isValidHashtag(hashtag: String): Boolean = js.native
  def isValidList(usernameList: String): Boolean = js.native
  def isValidUrl(url: String, unicodeDomains: Boolean, requireProtocol: Boolean): Boolean = js.native
  def isValidUsername(username: String): Boolean = js.native
  def modifyIndicesFromUTF16ToUnicode[I](i: I): I = js.native
  def modifyIndicesFromUnicodeToUTF16[I](i: I): I = js.native
  def parseTweet(text: String): ParsedTweet = js.native
  def parseTweet(text: String, options: ParseTweetOptions): ParsedTweet = js.native
  def splitTags(text: String): js.Array[String] = js.native
}

