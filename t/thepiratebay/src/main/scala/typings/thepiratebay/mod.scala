package typings.thepiratebay

import typings.thepiratebay.anon.DictpropName
import typings.thepiratebay.anon.Verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("thepiratebay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCategories(): js.Promise[js.Array[CategoryGroup]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Promise[js.Array[CategoryGroup]]]
  
  inline def getComments(id: String): js.Promise[js.Array[Comment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComments")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Comment]]]
  inline def getComments(id: Double): js.Promise[js.Array[Comment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComments")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Comment]]]
  
  inline def getTorrent(id: String): js.Promise[TorrentDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorrent")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TorrentDetails]]
  inline def getTorrent(id: Double): js.Promise[TorrentDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorrent")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TorrentDetails]]
  inline def getTorrent(id: DictpropName): js.Promise[TorrentDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorrent")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TorrentDetails]]
  
  inline def getTvShow(id: String): js.Promise[js.Array[TVSeason]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTvShow")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TVSeason]]]
  inline def getTvShow(id: Double): js.Promise[js.Array[TVSeason]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTvShow")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TVSeason]]]
  
  inline def recentTorrents(): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("recentTorrents")().asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  
  inline def search(): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")().asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  inline def search(query: String): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  inline def search(query: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  inline def search(query: Unit, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  
  inline def topTorrents(): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("topTorrents")().asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  inline def topTorrents(category: Double): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("topTorrents")(category.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  
  inline def userTorrents(user: String): js.Promise[js.Array[TorrentSearchResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("userTorrents")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  inline def userTorrents(user: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("userTorrents")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TorrentSearchResult]]]
  
  trait Category extends StObject {
    
    var id: String
    
    var name: String
  }
  object Category {
    
    inline def apply(id: String, name: String): Category = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CategoryGroup
    extends StObject
       with Category {
    
    var subcategories: js.Array[Category]
  }
  object CategoryGroup {
    
    inline def apply(id: String, name: String, subcategories: js.Array[Category]): CategoryGroup = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subcategories = subcategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryGroup]
    }
    
    extension [Self <: CategoryGroup](x: Self) {
      
      inline def setSubcategories(value: js.Array[Category]): Self = StObject.set(x, "subcategories", value.asInstanceOf[js.Any])
      
      inline def setSubcategoriesVarargs(value: Category*): Self = StObject.set(x, "subcategories", js.Array(value*))
    }
  }
  
  trait Comment extends StObject {
    
    var comment: String
    
    var user: String
  }
  object Comment {
    
    inline def apply(comment: String, user: String): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchOptions extends StObject {
    
    var category: js.UndefOr[String | Double] = js.undefined
    
    var filter: js.UndefOr[Verified] = js.undefined
    
    var orderBy: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var sortBy: js.UndefOr[String] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setCategory(value: String | Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setFilter(value: Verified): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    }
  }
  
  trait TVSeason extends StObject {
    
    var title: String
    
    var torrents: js.Array[TVTorrent]
  }
  object TVSeason {
    
    inline def apply(title: String, torrents: js.Array[TVTorrent]): TVSeason = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
      __obj.asInstanceOf[TVSeason]
    }
    
    extension [Self <: TVSeason](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTorrents(value: js.Array[TVTorrent]): Self = StObject.set(x, "torrents", value.asInstanceOf[js.Any])
      
      inline def setTorrentsVarargs(value: TVTorrent*): Self = StObject.set(x, "torrents", js.Array(value*))
    }
  }
  
  trait TVTorrent extends StObject {
    
    var id: String
    
    var link: String
    
    var title: String
  }
  object TVTorrent {
    
    inline def apply(id: String, link: String, title: String): TVTorrent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TVTorrent]
    }
    
    extension [Self <: TVTorrent](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Torrent extends StObject {
    
    var id: String
    
    var leechers: String
    
    var link: String
    
    var magnetLink: String
    
    var name: String
    
    var seeders: String
    
    var size: String
    
    var uploadDate: String
    
    var uploader: String
    
    var uploaderLink: String
  }
  object Torrent {
    
    inline def apply(
      id: String,
      leechers: String,
      link: String,
      magnetLink: String,
      name: String,
      seeders: String,
      size: String,
      uploadDate: String,
      uploader: String,
      uploaderLink: String
    ): Torrent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[Torrent]
    }
    
    extension [Self <: Torrent](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLeechers(value: String): Self = StObject.set(x, "leechers", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMagnetLink(value: String): Self = StObject.set(x, "magnetLink", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSeeders(value: String): Self = StObject.set(x, "seeders", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
      
      inline def setUploader(value: String): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
      
      inline def setUploaderLink(value: String): Self = StObject.set(x, "uploaderLink", value.asInstanceOf[js.Any])
    }
  }
  
  trait TorrentDetails
    extends StObject
       with Torrent {
    
    var description: String
  }
  object TorrentDetails {
    
    inline def apply(
      description: String,
      id: String,
      leechers: String,
      link: String,
      magnetLink: String,
      name: String,
      seeders: String,
      size: String,
      uploadDate: String,
      uploader: String,
      uploaderLink: String
    ): TorrentDetails = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentDetails]
    }
    
    extension [Self <: TorrentDetails](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait TorrentSearchResult
    extends StObject
       with Torrent {
    
    var category: Category
    
    var subcategory: Category
    
    var verified: Boolean
  }
  object TorrentSearchResult {
    
    inline def apply(
      category: Category,
      id: String,
      leechers: String,
      link: String,
      magnetLink: String,
      name: String,
      seeders: String,
      size: String,
      subcategory: Category,
      uploadDate: String,
      uploader: String,
      uploaderLink: String,
      verified: Boolean
    ): TorrentSearchResult = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subcategory = subcategory.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentSearchResult]
    }
    
    extension [Self <: TorrentSearchResult](x: Self) {
      
      inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setSubcategory(value: Category): Self = StObject.set(x, "subcategory", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
