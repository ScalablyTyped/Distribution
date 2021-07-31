package typings.webpackNotifier

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-notifier", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  /** @deprecated use Options */
  type Config = Options
  
  trait Options extends StObject {
    
    var alwaysNotify: js.UndefOr[Boolean] = js.undefined
    
    var contentImage: js.UndefOr[String] = js.undefined
    
    /**
      * Use emoji in notifications
      * @default false
      */
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    var excludeWarnings: js.UndefOr[Boolean] = js.undefined
    
    var skipFirstNotification: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysNotify(value: Boolean): Self = StObject.set(x, "alwaysNotify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysNotifyUndefined: Self = StObject.set(x, "alwaysNotify", js.undefined)
      
      @scala.inline
      def setContentImage(value: String): Self = StObject.set(x, "contentImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentImageUndefined: Self = StObject.set(x, "contentImage", js.undefined)
      
      @scala.inline
      def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      @scala.inline
      def setExcludeWarnings(value: Boolean): Self = StObject.set(x, "excludeWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeWarningsUndefined: Self = StObject.set(x, "excludeWarnings", js.undefined)
      
      @scala.inline
      def setSkipFirstNotification(value: Boolean): Self = StObject.set(x, "skipFirstNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFirstNotificationUndefined: Self = StObject.set(x, "skipFirstNotification", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type WebpackNotifierPlugin = Plugin
}
