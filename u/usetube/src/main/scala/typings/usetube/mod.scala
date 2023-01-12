package typings.usetube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("usetube", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getChannelDesc(channel_id: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelDesc")(channel_id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getChannelVideos(channel_id: String): js.Promise[js.Array[Video]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelVideos")(channel_id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Video]]]
  
  inline def getPlaylistVideos(playlist_id: String): js.Promise[js.Array[Video]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlaylistVideos")(playlist_id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Video]]]
  
  inline def getVideoDate(video_id: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVideoDate")(video_id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getVideoDesc(video_id: String): js.Promise[VideoDesc] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVideoDesc")(video_id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoDesc]]
  
  inline def searchChannel(terms: String): js.Promise[ChannelResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchChannel")(terms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ChannelResults]]
  
  inline def searchVideo(terms: String): js.Promise[YouTubeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchVideo")(terms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[YouTubeResults]]
  
  trait Channel extends StObject {
    
    var channel_avatar_large: String
    
    var channel_avatar_medium: String
    
    var channel_avatar_small: String
    
    var channel_id: String
    
    var name: String
    
    var nb_subscriber: Double
    
    var nb_videos: Double
    
    var official: Boolean
  }
  object Channel {
    
    inline def apply(
      channel_avatar_large: String,
      channel_avatar_medium: String,
      channel_avatar_small: String,
      channel_id: String,
      name: String,
      nb_subscriber: Double,
      nb_videos: Double,
      official: Boolean
    ): Channel = {
      val __obj = js.Dynamic.literal(channel_avatar_large = channel_avatar_large.asInstanceOf[js.Any], channel_avatar_medium = channel_avatar_medium.asInstanceOf[js.Any], channel_avatar_small = channel_avatar_small.asInstanceOf[js.Any], channel_id = channel_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nb_subscriber = nb_subscriber.asInstanceOf[js.Any], nb_videos = nb_videos.asInstanceOf[js.Any], official = official.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      inline def setChannel_avatar_large(value: String): Self = StObject.set(x, "channel_avatar_large", value.asInstanceOf[js.Any])
      
      inline def setChannel_avatar_medium(value: String): Self = StObject.set(x, "channel_avatar_medium", value.asInstanceOf[js.Any])
      
      inline def setChannel_avatar_small(value: String): Self = StObject.set(x, "channel_avatar_small", value.asInstanceOf[js.Any])
      
      inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNb_subscriber(value: Double): Self = StObject.set(x, "nb_subscriber", value.asInstanceOf[js.Any])
      
      inline def setNb_videos(value: Double): Self = StObject.set(x, "nb_videos", value.asInstanceOf[js.Any])
      
      inline def setOfficial(value: Boolean): Self = StObject.set(x, "official", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelResults extends StObject {
    
    var apikey: String
    
    var channels: js.Array[Channel]
    
    var didyoumean: String
    
    var token: String
  }
  object ChannelResults {
    
    inline def apply(apikey: String, channels: js.Array[Channel], didyoumean: String, token: String): ChannelResults = {
      val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], didyoumean = didyoumean.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelResults] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setDidyoumean(value: String): Self = StObject.set(x, "didyoumean", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandMetadata extends StObject {
    
    var webCommandMetadata: WebCommandMetadata
  }
  object CommandMetadata {
    
    inline def apply(webCommandMetadata: WebCommandMetadata): CommandMetadata = {
      val __obj = js.Dynamic.literal(webCommandMetadata = webCommandMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandMetadata] (val x: Self) extends AnyVal {
      
      inline def setWebCommandMetadata(value: WebCommandMetadata): Self = StObject.set(x, "webCommandMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationEndpoint extends StObject {
    
    var clickTrackingParams: String
    
    var commandMetadata: CommandMetadata
    
    var urlEndpoint: URLEndpoint
  }
  object NavigationEndpoint {
    
    inline def apply(clickTrackingParams: String, commandMetadata: CommandMetadata, urlEndpoint: URLEndpoint): NavigationEndpoint = {
      val __obj = js.Dynamic.literal(clickTrackingParams = clickTrackingParams.asInstanceOf[js.Any], commandMetadata = commandMetadata.asInstanceOf[js.Any], urlEndpoint = urlEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationEndpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationEndpoint] (val x: Self) extends AnyVal {
      
      inline def setClickTrackingParams(value: String): Self = StObject.set(x, "clickTrackingParams", value.asInstanceOf[js.Any])
      
      inline def setCommandMetadata(value: CommandMetadata): Self = StObject.set(x, "commandMetadata", value.asInstanceOf[js.Any])
      
      inline def setUrlEndpoint(value: URLEndpoint): Self = StObject.set(x, "urlEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLEndpoint extends StObject {
    
    var nofollow: Boolean
    
    var target: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object URLEndpoint {
    
    inline def apply(nofollow: Boolean, url: String): URLEndpoint = {
      val __obj = js.Dynamic.literal(nofollow = nofollow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLEndpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLEndpoint] (val x: Self) extends AnyVal {
      
      inline def setNofollow(value: Boolean): Self = StObject.set(x, "nofollow", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Video extends StObject {
    
    var artist: String
    
    var duration: Double
    
    var id: String
    
    var original_title: String
    
    var publishedAt: String
    
    var title: String
  }
  object Video {
    
    inline def apply(
      artist: String,
      duration: Double,
      id: String,
      original_title: String,
      publishedAt: String,
      title: String
    ): Video = {
      val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOriginal_title(value: String): Self = StObject.set(x, "original_title", value.asInstanceOf[js.Any])
      
      inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoDesc extends StObject {
    
    var navigationEndpoint: js.UndefOr[NavigationEndpoint] = js.undefined
    
    var text: String
  }
  object VideoDesc {
    
    inline def apply(text: String): VideoDesc = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDesc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoDesc] (val x: Self) extends AnyVal {
      
      inline def setNavigationEndpoint(value: NavigationEndpoint): Self = StObject.set(x, "navigationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setNavigationEndpointUndefined: Self = StObject.set(x, "navigationEndpoint", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebCommandMetadata extends StObject {
    
    var rootVe: Double
    
    var url: String
    
    var webPageType: String
  }
  object WebCommandMetadata {
    
    inline def apply(rootVe: Double, url: String, webPageType: String): WebCommandMetadata = {
      val __obj = js.Dynamic.literal(rootVe = rootVe.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webPageType = webPageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebCommandMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebCommandMetadata] (val x: Self) extends AnyVal {
      
      inline def setRootVe(value: Double): Self = StObject.set(x, "rootVe", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebPageType(value: String): Self = StObject.set(x, "webPageType", value.asInstanceOf[js.Any])
    }
  }
  
  trait YouTubeResults extends StObject {
    
    var apikey: String
    
    var didyoumean: String
    
    var token: String
    
    var videos: js.Array[Video]
  }
  object YouTubeResults {
    
    inline def apply(apikey: String, didyoumean: String, token: String, videos: js.Array[Video]): YouTubeResults = {
      val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], didyoumean = didyoumean.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
      __obj.asInstanceOf[YouTubeResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YouTubeResults] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setDidyoumean(value: String): Self = StObject.set(x, "didyoumean", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setVideos(value: js.Array[Video]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
      
      inline def setVideosVarargs(value: Video*): Self = StObject.set(x, "videos", js.Array(value*))
    }
  }
}
