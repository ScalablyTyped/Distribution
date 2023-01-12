package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.all
import typings.twitterForWeb.twitterForWebStrings.assertive
import typings.twitterForWeb.twitterForWebStrings.auto
import typings.twitterForWeb.twitterForWebStrings.dark
import typings.twitterForWeb.twitterForWebStrings.hidden
import typings.twitterForWeb.twitterForWebStrings.large
import typings.twitterForWeb.twitterForWebStrings.light
import typings.twitterForWeb.twitterForWebStrings.medium
import typings.twitterForWeb.twitterForWebStrings.none
import typings.twitterForWeb.twitterForWebStrings.polite
import typings.twitterForWeb.twitterForWebStrings.rude
import typings.twitterForWeb.twitterForWebStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for additional options for embedded Timelines.
  */
/* Inlined twitter-for-web.TwitterTimelineWidgetBaseOptions & {  ariaPolite :'polite' | 'assertive' | 'rude' | undefined,   height :number | undefined,   borderColor :string | undefined,   chrome :string | undefined,   tweetLimit :number | undefined,   showReplies :boolean | undefined} */
trait TwitterTimelineWidgetOptions extends StObject {
  
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[polite | assertive | rude] = js.undefined
  
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.undefined
  
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[String] = js.undefined
  
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.undefined
  
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.undefined
  
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.undefined
  
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.undefined
  
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.undefined
  
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.undefined
  
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.undefined
  
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.undefined
  
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.undefined
}
object TwitterTimelineWidgetOptions {
  
  inline def apply(): TwitterTimelineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTimelineWidgetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TwitterTimelineWidgetOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAriaPolite(value: polite | assertive | rude): Self = StObject.set(x, "ariaPolite", value.asInstanceOf[js.Any])
    
    inline def setAriaPoliteUndefined: Self = StObject.set(x, "ariaPolite", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setCards(value: hidden | visible): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setChrome(value: String): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
    
    inline def setConversation(value: none | all): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCounturl(value: String): Self = StObject.set(x, "counturl", value.asInstanceOf[js.Any])
    
    inline def setCounturlUndefined: Self = StObject.set(x, "counturl", js.undefined)
    
    inline def setDnt(value: Boolean): Self = StObject.set(x, "dnt", value.asInstanceOf[js.Any])
    
    inline def setDntUndefined: Self = StObject.set(x, "dnt", js.undefined)
    
    inline def setHashtags(value: String): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    inline def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
    
    inline def setRelated(value: String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setShowReplies(value: Boolean): Self = StObject.set(x, "showReplies", value.asInstanceOf[js.Any])
    
    inline def setShowRepliesUndefined: Self = StObject.set(x, "showReplies", js.undefined)
    
    inline def setSize(value: medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTweetLimit(value: Double): Self = StObject.set(x, "tweetLimit", value.asInstanceOf[js.Any])
    
    inline def setTweetLimitUndefined: Self = StObject.set(x, "tweetLimit", js.undefined)
    
    inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    
    inline def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
