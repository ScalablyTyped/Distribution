package typings.websiteScraper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: (String | Url)*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String | Url]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFilename(value: String): Self = this.set("defaultFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFilename: Self = this.set("defaultFilename", js.undefined)
    
    @scala.inline
    def setFilenameGenerator(value: String): Self = this.set("filenameGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilenameGenerator: Self = this.set("filenameGenerator", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMaxRecursiveDepth(value: Double): Self = this.set("maxRecursiveDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecursiveDepth: Self = this.set("maxRecursiveDepth", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Object*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[js.Object]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPrettifyUrls(value: Boolean): Self = this.set("prettifyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettifyUrls: Self = this.set("prettifyUrls", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRequestConcurrency(value: Double): Self = this.set("requestConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestConcurrency: Self = this.set("requestConcurrency", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setSubdirectoriesVarargs(value: SubDirectory*): Self = this.set("subdirectories", js.Array(value :_*))
    
    @scala.inline
    def setSubdirectories(value: js.Array[SubDirectory]): Self = this.set("subdirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdirectories: Self = this.set("subdirectories", js.undefined)
    
    @scala.inline
    def setSubdirectoriesNull: Self = this.set("subdirectories", null)
    
    @scala.inline
    def setUrlFilter(value: /* url */ String => Boolean): Self = this.set("urlFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUrlFilter: Self = this.set("urlFilter", js.undefined)
  }
}
