package typings.twitchExt

import typings.twitchExt.twitchExtStrings.`chat-only`
import typings.twitchExt.twitchExtStrings.audio
import typings.twitchExt.twitchExtStrings.config
import typings.twitchExt.twitchExtStrings.dark
import typings.twitchExt.twitchExtStrings.dashboard
import typings.twitchExt.twitchExtStrings.light
import typings.twitchExt.twitchExtStrings.remote
import typings.twitchExt.twitchExtStrings.video
import typings.twitchExt.twitchExtStrings.viewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var version: String
  }
  object Content {
    
    @scala.inline
    def apply(content: String, version: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedChannelId extends StObject {
    
    /**
      * Numeric ID of the channel being hosted by the currently visible channel
      */
    var hostedChannelId: String
    
    /**
      * Numeric ID of the host channel
      */
    var hostingChannelId: String
  }
  object HostedChannelId {
    
    @scala.inline
    def apply(hostedChannelId: String, hostingChannelId: String): HostedChannelId = {
      val __obj = js.Dynamic.literal(hostedChannelId = hostedChannelId.asInstanceOf[js.Any], hostingChannelId = hostingChannelId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedChannelId]
    }
    
    @scala.inline
    implicit class HostedChannelIdMutableBuilder[Self <: HostedChannelId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostedChannelId(value: String): Self = StObject.set(x, "hostedChannelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostingChannelId(value: String): Self = StObject.set(x, "hostingChannelId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<twitch-ext.Twitch.ext.Context> */
  trait PartialContext extends StObject {
    
    var arePlayerControlsVisible: js.UndefOr[Boolean] = js.undefined
    
    var bitrate: js.UndefOr[Double] = js.undefined
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var displayResolution: js.UndefOr[String] = js.undefined
    
    var game: js.UndefOr[String] = js.undefined
    
    var hlsLatencyBroadcaster: js.UndefOr[Double] = js.undefined
    
    var hostingInfo: js.UndefOr[HostedChannelId] = js.undefined
    
    var isFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var isMuted: js.UndefOr[Boolean] = js.undefined
    
    var isPaused: js.UndefOr[Boolean] = js.undefined
    
    var isTheatreMode: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[viewer | dashboard | config] = js.undefined
    
    var playbackMode: js.UndefOr[video | audio | remote | `chat-only`] = js.undefined
    
    var theme: js.UndefOr[light | dark] = js.undefined
    
    var videoResolution: js.UndefOr[String] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object PartialContext {
    
    @scala.inline
    def apply(): PartialContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContext]
    }
    
    @scala.inline
    implicit class PartialContextMutableBuilder[Self <: PartialContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArePlayerControlsVisible(value: Boolean): Self = StObject.set(x, "arePlayerControlsVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArePlayerControlsVisibleUndefined: Self = StObject.set(x, "arePlayerControlsVisible", js.undefined)
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setDisplayResolution(value: String): Self = StObject.set(x, "displayResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayResolutionUndefined: Self = StObject.set(x, "displayResolution", js.undefined)
      
      @scala.inline
      def setGame(value: String): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
      
      @scala.inline
      def setHlsLatencyBroadcaster(value: Double): Self = StObject.set(x, "hlsLatencyBroadcaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlsLatencyBroadcasterUndefined: Self = StObject.set(x, "hlsLatencyBroadcaster", js.undefined)
      
      @scala.inline
      def setHostingInfo(value: HostedChannelId): Self = StObject.set(x, "hostingInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostingInfoUndefined: Self = StObject.set(x, "hostingInfo", js.undefined)
      
      @scala.inline
      def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullScreenUndefined: Self = StObject.set(x, "isFullScreen", js.undefined)
      
      @scala.inline
      def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      @scala.inline
      def setIsTheatreMode(value: Boolean): Self = StObject.set(x, "isTheatreMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTheatreModeUndefined: Self = StObject.set(x, "isTheatreMode", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setMode(value: viewer | dashboard | config): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPlaybackMode(value: video | audio | remote | `chat-only`): Self = StObject.set(x, "playbackMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackModeUndefined: Self = StObject.set(x, "playbackMode", js.undefined)
      
      @scala.inline
      def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVideoResolution(value: String): Self = StObject.set(x, "videoResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoResolutionUndefined: Self = StObject.set(x, "videoResolution", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
