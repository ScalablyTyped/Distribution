package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChannelName extends StObject {
    
    /**
      * The `channelName` property to use when creating the
      * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
      */
    var channelName: js.UndefOr[String] = js.native
    
    /**
      * The `options` property to use when creating the
      * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
      */
    var options: js.UndefOr[js.Object] = js.native
  }
  object ChannelName {
    
    @scala.inline
    def apply(): ChannelName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelName]
    }
    
    @scala.inline
    implicit class ChannelNameMutableBuilder[Self <: ChannelName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var filePaths: js.Array[String] = js.native
    
    var size: Double = js.native
    
    var warnings: js.Array[String] = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, filePaths: js.Array[String], size: Double, warnings: js.Array[String]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePaths(value: js.Array[String]): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    /**
      * The `headers` property to use when creating the
      * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
      */
    var headers: js.UndefOr[js.Object] = js.native
    
    /**
      * The `statuses` property to use when creating the
      * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
      */
    var statuses: js.UndefOr[js.Array[Double]] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      @scala.inline
      def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MaxAgeSeconds extends StObject {
    
    /**
      * The `maxAgeSeconds` property to use when creating the
      * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
      */
    var maxAgeSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The `maxEntries` property to use when creating the
      * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
      */
    var maxEntries: js.UndefOr[Double] = js.native
  }
  object MaxAgeSeconds {
    
    @scala.inline
    def apply(): MaxAgeSeconds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAgeSeconds]
    }
    
    @scala.inline
    implicit class MaxAgeSecondsMutableBuilder[Self <: MaxAgeSeconds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      @scala.inline
      def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    /**
      * The `name` property to use when creating the
      * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The `options` property to use when creating the
      * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
      */
    var options: js.UndefOr[js.Object] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
