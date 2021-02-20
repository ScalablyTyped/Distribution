package typings.websiteScraper

import org.scalablytyped.runtime.Shortcut
import typings.request.mod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("website-scraper", JSImport.Namespace)
  @js.native
  val ^ : Scrape = js.native
  
  type Callback = js.Function2[/* error */ js.Any | Null, /* result */ js.Array[Resource] | Null, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var defaultFilename: js.UndefOr[String] = js.native
    
    var directory: String = js.native
    
    var filenameGenerator: js.UndefOr[String] = js.native
    
    var ignoreErrors: js.UndefOr[Boolean] = js.native
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var maxRecursiveDepth: js.UndefOr[Double] = js.native
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.native
    
    var prettifyUrls: js.UndefOr[Boolean] = js.native
    
    var recursive: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[RequestOptions] = js.native
    
    var requestConcurrency: js.UndefOr[Double] = js.native
    
    var sources: js.UndefOr[js.Array[Source]] = js.native
    
    var subdirectories: js.UndefOr[js.Array[SubDirectory] | Null] = js.native
    
    var urlFilter: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.native
    
    var urls: js.Array[String | Url] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(directory: String, urls: js.Array[String | Url]): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFilename(value: String): Self = StObject.set(x, "defaultFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFilenameUndefined: Self = StObject.set(x, "defaultFilename", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameGenerator(value: String): Self = StObject.set(x, "filenameGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameGeneratorUndefined: Self = StObject.set(x, "filenameGenerator", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setMaxRecursiveDepth(value: Double): Self = StObject.set(x, "maxRecursiveDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRecursiveDepthUndefined: Self = StObject.set(x, "maxRecursiveDepth", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPrettifyUrls(value: Boolean): Self = StObject.set(x, "prettifyUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifyUrlsUndefined: Self = StObject.set(x, "prettifyUrls", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestConcurrency(value: Double): Self = StObject.set(x, "requestConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestConcurrencyUndefined: Self = StObject.set(x, "requestConcurrency", js.undefined)
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setSubdirectories(value: js.Array[SubDirectory]): Self = StObject.set(x, "subdirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectoriesNull: Self = StObject.set(x, "subdirectories", null)
      
      @scala.inline
      def setSubdirectoriesUndefined: Self = StObject.set(x, "subdirectories", js.undefined)
      
      @scala.inline
      def setSubdirectoriesVarargs(value: SubDirectory*): Self = StObject.set(x, "subdirectories", js.Array(value :_*))
      
      @scala.inline
      def setUrlFilter(value: /* url */ String => Boolean): Self = StObject.set(x, "urlFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlFilterUndefined: Self = StObject.set(x, "urlFilter", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String | Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsVarargs(value: (String | Url)*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var headers: Headers = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(headers: Headers): RequestOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Resource extends StObject {
    
    var assets: js.Array[Resource] = js.native
    
    var filename: String = js.native
    
    var url: String = js.native
  }
  object Resource {
    
    @scala.inline
    def apply(assets: js.Array[Resource], filename: String, url: String): Resource = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[Resource]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: Resource*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scrape extends StObject {
    
    def apply(options: Options): js.Promise[js.Array[Resource]] = js.native
    def apply(options: Options, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait Source extends StObject {
    
    var attr: js.UndefOr[String] = js.native
    
    var selector: String = js.native
  }
  object Source {
    
    @scala.inline
    def apply(selector: String): Source = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubDirectory extends StObject {
    
    var directory: String = js.native
    
    var extensions: js.Array[String] = js.native
  }
  object SubDirectory {
    
    @scala.inline
    def apply(directory: String, extensions: js.Array[String]): SubDirectory = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubDirectory]
    }
    
    @scala.inline
    implicit class SubDirectoryMutableBuilder[Self <: SubDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var filename: String = js.native
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(filename: String, url: String): Url = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Scrape
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Scrape = ^
}
