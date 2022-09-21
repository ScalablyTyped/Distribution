package typings.websiteScraper

import org.scalablytyped.runtime.Shortcut
import typings.request.mod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("website-scraper", JSImport.Namespace)
  @js.native
  val ^ : Scrape = js.native
  
  type Callback = js.Function2[/* error */ Any | Null, /* result */ js.Array[Resource] | Null, Unit]
  
  trait Options extends StObject {
    
    var defaultFilename: js.UndefOr[String] = js.undefined
    
    var directory: String
    
    var filenameGenerator: js.UndefOr[String] = js.undefined
    
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var maxRecursiveDepth: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var prettifyUrls: js.UndefOr[Boolean] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestOptions] = js.undefined
    
    var requestConcurrency: js.UndefOr[Double] = js.undefined
    
    var sources: js.UndefOr[js.Array[Source]] = js.undefined
    
    var subdirectories: js.UndefOr[js.Array[SubDirectory] | Null] = js.undefined
    
    var urlFilter: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
    
    var urls: js.Array[String | Url]
  }
  object Options {
    
    inline def apply(directory: String, urls: js.Array[String | Url]): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultFilename(value: String): Self = StObject.set(x, "defaultFilename", value.asInstanceOf[js.Any])
      
      inline def setDefaultFilenameUndefined: Self = StObject.set(x, "defaultFilename", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFilenameGenerator(value: String): Self = StObject.set(x, "filenameGenerator", value.asInstanceOf[js.Any])
      
      inline def setFilenameGeneratorUndefined: Self = StObject.set(x, "filenameGenerator", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setMaxRecursiveDepth(value: Double): Self = StObject.set(x, "maxRecursiveDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxRecursiveDepthUndefined: Self = StObject.set(x, "maxRecursiveDepth", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPrettifyUrls(value: Boolean): Self = StObject.set(x, "prettifyUrls", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUrlsUndefined: Self = StObject.set(x, "prettifyUrls", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestConcurrency(value: Double): Self = StObject.set(x, "requestConcurrency", value.asInstanceOf[js.Any])
      
      inline def setRequestConcurrencyUndefined: Self = StObject.set(x, "requestConcurrency", js.undefined)
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setSubdirectories(value: js.Array[SubDirectory]): Self = StObject.set(x, "subdirectories", value.asInstanceOf[js.Any])
      
      inline def setSubdirectoriesNull: Self = StObject.set(x, "subdirectories", null)
      
      inline def setSubdirectoriesUndefined: Self = StObject.set(x, "subdirectories", js.undefined)
      
      inline def setSubdirectoriesVarargs(value: SubDirectory*): Self = StObject.set(x, "subdirectories", js.Array(value*))
      
      inline def setUrlFilter(value: /* url */ String => Boolean): Self = StObject.set(x, "urlFilter", js.Any.fromFunction1(value))
      
      inline def setUrlFilterUndefined: Self = StObject.set(x, "urlFilter", js.undefined)
      
      inline def setUrls(value: js.Array[String | Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: (String | Url)*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait RequestOptions extends StObject {
    
    var headers: Headers
  }
  object RequestOptions {
    
    inline def apply(headers: Headers): RequestOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var assets: js.Array[Resource]
    
    var filename: String
    
    var url: String
  }
  object Resource {
    
    inline def apply(assets: js.Array[Resource], filename: String, url: String): Resource = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setAssets(value: js.Array[Resource]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Resource*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scrape extends StObject {
    
    def apply(options: Options): js.Promise[js.Array[Resource]] = js.native
    def apply(options: Options, callback: Callback): Unit = js.native
  }
  
  trait Source extends StObject {
    
    var attr: js.UndefOr[String] = js.undefined
    
    var selector: String
  }
  object Source {
    
    inline def apply(selector: String): Source = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubDirectory extends StObject {
    
    var directory: String
    
    var extensions: js.Array[String]
  }
  object SubDirectory {
    
    inline def apply(directory: String, extensions: js.Array[String]): SubDirectory = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubDirectory]
    }
    
    extension [Self <: SubDirectory](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  trait Url extends StObject {
    
    var filename: String
    
    var url: String
  }
  object Url {
    
    inline def apply(filename: String, url: String): Url = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Scrape
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Scrape = ^
}
