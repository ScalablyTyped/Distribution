package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.large
import typings.twitterForWeb.twitterForWebStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
  * use all options of tweet widgets and button widgets
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twitterForWeb.TwitterWidgetOptions because Already inherited
- typings.twitterForWeb.TwitterButtonWidgetOptions because var conflicts: align, dnt, hashtags, lang, related, via. Inlined count, counturl, size, text */ trait TwitterTimelineWidgetBaseOptions
  extends StObject
     with TwitterTweetWidgetOptions {
  
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.undefined
  
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.undefined
  
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.undefined
}
object TwitterTimelineWidgetBaseOptions {
  
  inline def apply(): TwitterTimelineWidgetBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTimelineWidgetBaseOptions]
  }
  
  extension [Self <: TwitterTimelineWidgetBaseOptions](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCounturl(value: String): Self = StObject.set(x, "counturl", value.asInstanceOf[js.Any])
    
    inline def setCounturlUndefined: Self = StObject.set(x, "counturl", js.undefined)
    
    inline def setSize(value: medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
