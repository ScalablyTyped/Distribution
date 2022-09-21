package typings.torrentSearchApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("torrent-search-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addProvider(provider: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disableAllProviders(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAllProviders")().asInstanceOf[Unit]
  
  inline def disableProvider(providerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableProvider")(providerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def downloadTorrent(torrent: Torrent): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadTorrent")(torrent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def downloadTorrent(torrent: Torrent, filenamePath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadTorrent")(torrent.asInstanceOf[js.Any], filenamePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def enableProvider(providerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableProvider")(providerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableProvider(providerName: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableProvider")(List(providerName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def enableProvider(providerName: String, args: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableProvider")(providerName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enablePublicProviders(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePublicProviders")().asInstanceOf[Unit]
  
  inline def getActiveProviders(): js.Array[TorrentProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveProviders")().asInstanceOf[js.Array[TorrentProvider]]
  
  inline def getMagnet(torrent: Torrent): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMagnet")(torrent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getProvider(name: String, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")(name.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getProviders(): js.Array[TorrentProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviders")().asInstanceOf[js.Array[TorrentProvider]]
  
  inline def getTorrentDetails(torrent: Torrent): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorrentDetails")(torrent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def isProviderActive(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProviderActive")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadProvider(providerParam: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProvider")(providerParam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadProvider(providerParam: TorrentProvider): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProvider")(providerParam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def loadProviders(args: (String | TorrentProvider)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProviders")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def lodProvider(providerParam: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lodProvider")(providerParam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def overrideConfig(providerName: String, newConfig: TorrentProvider): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideConfig")(providerName.asInstanceOf[js.Any], newConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def removeProvider(providerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProvider")(providerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def search(providers: js.Array[String], query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(providers.asInstanceOf[js.Any], query.asInstanceOf[js.Any], category.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
  inline def search(query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], category.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
  
  trait Torrent extends StObject {
    
    var desc: String
    
    var magnet: String
    
    var provider: String
    
    var size: String
    
    var time: String
    
    var title: String
  }
  object Torrent {
    
    inline def apply(desc: String, magnet: String, provider: String, size: String, time: String, title: String): Torrent = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Torrent]
    }
    
    extension [Self <: Torrent](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TorrentProvider extends StObject {
    
    var autoFixUnstableUrl: Boolean
    
    var baseUrl: String
    
    var categories: Any
    
    // FIXME {key: [string]}
    var defaultCategory: String
    
    var enableCloudFareBypass: Boolean
    
    var headers: Any
    
    var itemSelectors: Any
    
    var itemsSelector: String
    
    var loginQueryString: String
    
    var loginUrl: String
    
    // FIXME {key:[string]}
    var magnetSelector: String
    
    var name: String
    
    // FIXME {key: [string]}
    var paginateSelector: String
    
    var requireAuthentification: Boolean
    
    var resultsPerPageCount: Double
    
    var searchUrl: String
    
    var supportCookiesAuthentification: Boolean
    
    var supportCredentialsAuthentification: Boolean
    
    var supportTokenAuthentification: Boolean
    
    var torrentDetailsSelector: String
  }
  object TorrentProvider {
    
    inline def apply(
      autoFixUnstableUrl: Boolean,
      baseUrl: String,
      categories: Any,
      defaultCategory: String,
      enableCloudFareBypass: Boolean,
      headers: Any,
      itemSelectors: Any,
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
    
    extension [Self <: TorrentProvider](x: Self) {
      
      inline def setAutoFixUnstableUrl(value: Boolean): Self = StObject.set(x, "autoFixUnstableUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
      
      inline def setEnableCloudFareBypass(value: Boolean): Self = StObject.set(x, "enableCloudFareBypass", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setItemSelectors(value: Any): Self = StObject.set(x, "itemSelectors", value.asInstanceOf[js.Any])
      
      inline def setItemsSelector(value: String): Self = StObject.set(x, "itemsSelector", value.asInstanceOf[js.Any])
      
      inline def setLoginQueryString(value: String): Self = StObject.set(x, "loginQueryString", value.asInstanceOf[js.Any])
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setMagnetSelector(value: String): Self = StObject.set(x, "magnetSelector", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPaginateSelector(value: String): Self = StObject.set(x, "paginateSelector", value.asInstanceOf[js.Any])
      
      inline def setRequireAuthentification(value: Boolean): Self = StObject.set(x, "requireAuthentification", value.asInstanceOf[js.Any])
      
      inline def setResultsPerPageCount(value: Double): Self = StObject.set(x, "resultsPerPageCount", value.asInstanceOf[js.Any])
      
      inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      inline def setSupportCookiesAuthentification(value: Boolean): Self = StObject.set(x, "supportCookiesAuthentification", value.asInstanceOf[js.Any])
      
      inline def setSupportCredentialsAuthentification(value: Boolean): Self = StObject.set(x, "supportCredentialsAuthentification", value.asInstanceOf[js.Any])
      
      inline def setSupportTokenAuthentification(value: Boolean): Self = StObject.set(x, "supportTokenAuthentification", value.asInstanceOf[js.Any])
      
      inline def setTorrentDetailsSelector(value: String): Self = StObject.set(x, "torrentDetailsSelector", value.asInstanceOf[js.Any])
    }
  }
}
