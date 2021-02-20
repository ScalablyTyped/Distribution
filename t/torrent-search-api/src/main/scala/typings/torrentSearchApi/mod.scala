package typings.torrentSearchApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("torrent-search-api", "addProvider")
  @js.native
  def addProvider(provider: String): Unit = js.native
  
  @JSImport("torrent-search-api", "disableAllProviders")
  @js.native
  def disableAllProviders(): Unit = js.native
  
  @JSImport("torrent-search-api", "disableProvider")
  @js.native
  def disableProvider(providerName: String): Unit = js.native
  
  @JSImport("torrent-search-api", "downloadTorrent")
  @js.native
  def downloadTorrent(torrent: Torrent): js.Promise[String] = js.native
  @JSImport("torrent-search-api", "downloadTorrent")
  @js.native
  def downloadTorrent(torrent: Torrent, filenamePath: String): js.Promise[String] = js.native
  
  @JSImport("torrent-search-api", "enableProvider")
  @js.native
  def enableProvider(providerName: String): Unit = js.native
  @JSImport("torrent-search-api", "enableProvider")
  @js.native
  def enableProvider(providerName: String, args: String*): Unit = js.native
  @JSImport("torrent-search-api", "enableProvider")
  @js.native
  def enableProvider(providerName: String, args: js.Array[String]): Unit = js.native
  
  @JSImport("torrent-search-api", "enablePublicProviders")
  @js.native
  def enablePublicProviders(): Unit = js.native
  
  @JSImport("torrent-search-api", "getActiveProviders")
  @js.native
  def getActiveProviders(): js.Array[TorrentProvider] = js.native
  
  @JSImport("torrent-search-api", "getMagnet")
  @js.native
  def getMagnet(torrent: Torrent): js.Promise[String] = js.native
  
  @JSImport("torrent-search-api", "getProvider")
  @js.native
  def getProvider(name: String, throwOnError: Boolean): String = js.native
  
  @JSImport("torrent-search-api", "getProviders")
  @js.native
  def getProviders(): js.Array[TorrentProvider] = js.native
  
  @JSImport("torrent-search-api", "getTorrentDetails")
  @js.native
  def getTorrentDetails(torrent: Torrent): js.Promise[String] = js.native
  
  @JSImport("torrent-search-api", "isProviderActive")
  @js.native
  def isProviderActive(name: String): Boolean = js.native
  
  @JSImport("torrent-search-api", "loadProvider")
  @js.native
  def loadProvider(providerParam: String): Unit = js.native
  @JSImport("torrent-search-api", "loadProvider")
  @js.native
  def loadProvider(providerParam: TorrentProvider): Unit = js.native
  
  @JSImport("torrent-search-api", "loadProviders")
  @js.native
  def loadProviders(args: (String | TorrentProvider)*): Unit = js.native
  
  @JSImport("torrent-search-api", "lodProvider")
  @js.native
  def lodProvider(providerParam: String): Unit = js.native
  
  @JSImport("torrent-search-api", "overrideConfig")
  @js.native
  def overrideConfig(providerName: String, newConfig: TorrentProvider): js.Promise[String] = js.native
  
  @JSImport("torrent-search-api", "removeProvider")
  @js.native
  def removeProvider(providerName: String): Unit = js.native
  
  @JSImport("torrent-search-api", "search")
  @js.native
  def search(providers: js.Array[String], query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
  @JSImport("torrent-search-api", "search")
  @js.native
  def search(query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
  
  @js.native
  trait Torrent extends StObject {
    
    var desc: String = js.native
    
    var magnet: String = js.native
    
    var provider: String = js.native
    
    var size: String = js.native
    
    var time: String = js.native
    
    var title: String = js.native
  }
  object Torrent {
    
    @scala.inline
    def apply(desc: String, magnet: String, provider: String, size: String, time: String, title: String): Torrent = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Torrent]
    }
    
    @scala.inline
    implicit class TorrentMutableBuilder[Self <: Torrent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TorrentProvider extends StObject {
    
    var autoFixUnstableUrl: Boolean = js.native
    
    var baseUrl: String = js.native
    
    var categories: js.Any = js.native
    
    // FIXME {key: [string]}
    var defaultCategory: String = js.native
    
    var enableCloudFareBypass: Boolean = js.native
    
    var headers: js.Any = js.native
    
    var itemSelectors: js.Any = js.native
    
    var itemsSelector: String = js.native
    
    var loginQueryString: String = js.native
    
    var loginUrl: String = js.native
    
    // FIXME {key:[string]}
    var magnetSelector: String = js.native
    
    var name: String = js.native
    
    // FIXME {key: [string]}
    var paginateSelector: String = js.native
    
    var requireAuthentification: Boolean = js.native
    
    var resultsPerPageCount: Double = js.native
    
    var searchUrl: String = js.native
    
    var supportCookiesAuthentification: Boolean = js.native
    
    var supportCredentialsAuthentification: Boolean = js.native
    
    var supportTokenAuthentification: Boolean = js.native
    
    var torrentDetailsSelector: String = js.native
  }
  object TorrentProvider {
    
    @scala.inline
    def apply(
      autoFixUnstableUrl: Boolean,
      baseUrl: String,
      categories: js.Any,
      defaultCategory: String,
      enableCloudFareBypass: Boolean,
      headers: js.Any,
      itemSelectors: js.Any,
      itemsSelector: String,
      loginQueryString: String,
      loginUrl: String,
      magnetSelector: String,
      name: String,
      paginateSelector: String,
      requireAuthentification: Boolean,
      resultsPerPageCount: Double,
      searchUrl: String,
      supportCookiesAuthentification: Boolean,
      supportCredentialsAuthentification: Boolean,
      supportTokenAuthentification: Boolean,
      torrentDetailsSelector: String
    ): TorrentProvider = {
      val __obj = js.Dynamic.literal(autoFixUnstableUrl = autoFixUnstableUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], enableCloudFareBypass = enableCloudFareBypass.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], itemSelectors = itemSelectors.asInstanceOf[js.Any], itemsSelector = itemsSelector.asInstanceOf[js.Any], loginQueryString = loginQueryString.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any], magnetSelector = magnetSelector.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paginateSelector = paginateSelector.asInstanceOf[js.Any], requireAuthentification = requireAuthentification.asInstanceOf[js.Any], resultsPerPageCount = resultsPerPageCount.asInstanceOf[js.Any], searchUrl = searchUrl.asInstanceOf[js.Any], supportCookiesAuthentification = supportCookiesAuthentification.asInstanceOf[js.Any], supportCredentialsAuthentification = supportCredentialsAuthentification.asInstanceOf[js.Any], supportTokenAuthentification = supportTokenAuthentification.asInstanceOf[js.Any], torrentDetailsSelector = torrentDetailsSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentProvider]
    }
    
    @scala.inline
    implicit class TorrentProviderMutableBuilder[Self <: TorrentProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFixUnstableUrl(value: Boolean): Self = StObject.set(x, "autoFixUnstableUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCloudFareBypass(value: Boolean): Self = StObject.set(x, "enableCloudFareBypass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectors(value: js.Any): Self = StObject.set(x, "itemSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsSelector(value: String): Self = StObject.set(x, "itemsSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginQueryString(value: String): Self = StObject.set(x, "loginQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnetSelector(value: String): Self = StObject.set(x, "magnetSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginateSelector(value: String): Self = StObject.set(x, "paginateSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireAuthentification(value: Boolean): Self = StObject.set(x, "requireAuthentification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsPerPageCount(value: Double): Self = StObject.set(x, "resultsPerPageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportCookiesAuthentification(value: Boolean): Self = StObject.set(x, "supportCookiesAuthentification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportCredentialsAuthentification(value: Boolean): Self = StObject.set(x, "supportCredentialsAuthentification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportTokenAuthentification(value: Boolean): Self = StObject.set(x, "supportTokenAuthentification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTorrentDetailsSelector(value: String): Self = StObject.set(x, "torrentDetailsSelector", value.asInstanceOf[js.Any])
    }
  }
}
