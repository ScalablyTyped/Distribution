package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for additional configuration for all widgets.
  */
@js.native
trait TwitterWidgetOptions extends StObject {
  
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.native
  
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.native
  
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.native
}
object TwitterWidgetOptions {
  
  @scala.inline
  def apply(): TwitterWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterWidgetOptions]
  }
  
  @scala.inline
  implicit class TwitterWidgetOptionsMutableBuilder[Self <: TwitterWidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnt(value: Boolean): Self = StObject.set(x, "dnt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDntUndefined: Self = StObject.set(x, "dnt", js.undefined)
    
    @scala.inline
    def setHashtags(value: String): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRelated(value: String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    @scala.inline
    def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
  }
}
