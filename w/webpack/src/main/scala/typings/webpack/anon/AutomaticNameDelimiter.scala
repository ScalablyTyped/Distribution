package typings.webpack.anon

import typings.std.RegExp
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticNameDelimiter extends js.Object {
  
  /**
  					 * Sets the name delimiter for created chunks
  					 */
  var automaticNameDelimiter: js.UndefOr[String] = js.native
  
  /**
  					 * Sets the max length for the name of a created chunk
  					 */
  var automaticNameMaxLength: js.UndefOr[Double] = js.native
  
  /**
  					 * Sets the name prefix for created chunks
  					 */
  var automaticNamePrefix: js.UndefOr[String] = js.native
  
  /**
  					 * Select chunks for determining cache group content (defaults to "initial", "initial" and "all" requires adding these chunks to the HTML)
  					 */
  var chunks: js.UndefOr[initial | async | all | js.Function] = js.native
  
  /**
  					 * Ignore minimum size, minimum chunks and maximum requests and always create chunks for this cache group
  					 */
  var enforce: js.UndefOr[Boolean] = js.native
  
  /**
  					 * Size threshold at which splitting is enforced and other restrictions (maxAsyncRequests, maxInitialRequests) are ignored.
  					 */
  var enforceSizeThreshold: js.UndefOr[Double] = js.native
  
  /**
  					 * Sets the template for the filename for created chunks (Only works for initial chunks)
  					 */
  var filename: js.UndefOr[String] = js.native
  
  /**
  					 * Maximum number of requests which are accepted for on-demand loading
  					 */
  var maxAsyncRequests: js.UndefOr[Double] = js.native
  
  /**
  					 * Maximum number of initial chunks which are accepted for an entry point
  					 */
  var maxInitialRequests: js.UndefOr[Double] = js.native
  
  /**
  					 * Maximal size hint for the created chunks
  					 */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
  					 * Minimum number of times a module has to be duplicated until it's considered for splitting
  					 */
  var minChunks: js.UndefOr[Double] = js.native
  
  /**
  					 * Minimal size for the created chunk
  					 */
  var minSize: js.UndefOr[Double] = js.native
  
  /**
  					 * Give chunks for this cache group a name (chunks with equal name are merged)
  					 */
  var name: js.UndefOr[Boolean | js.Function | String] = js.native
  
  /**
  					 * Priority of this cache group
  					 */
  var priority: js.UndefOr[Double] = js.native
  
  /**
  					 * Try to reuse existing chunk (with name) when it has matching modules
  					 */
  var reuseExistingChunk: js.UndefOr[Boolean] = js.native
  
  /**
  					 * Assign modules to a cache group
  					 */
  var test: js.UndefOr[js.Function | String | RegExp] = js.native
}
object AutomaticNameDelimiter {
  
  @scala.inline
  def apply(): AutomaticNameDelimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticNameDelimiter]
  }
  
  @scala.inline
  implicit class AutomaticNameDelimiterOps[Self <: AutomaticNameDelimiter] (val x: Self) extends AnyVal {
    
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
    def setAutomaticNameDelimiter(value: String): Self = this.set("automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticNameDelimiter: Self = this.set("automaticNameDelimiter", js.undefined)
    
    @scala.inline
    def setAutomaticNameMaxLength(value: Double): Self = this.set("automaticNameMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticNameMaxLength: Self = this.set("automaticNameMaxLength", js.undefined)
    
    @scala.inline
    def setAutomaticNamePrefix(value: String): Self = this.set("automaticNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticNamePrefix: Self = this.set("automaticNamePrefix", js.undefined)
    
    @scala.inline
    def setChunks(value: initial | async | all | js.Function): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
    
    @scala.inline
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setEnforceSizeThreshold(value: Double): Self = this.set("enforceSizeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceSizeThreshold: Self = this.set("enforceSizeThreshold", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMaxAsyncRequests(value: Double): Self = this.set("maxAsyncRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAsyncRequests: Self = this.set("maxAsyncRequests", js.undefined)
    
    @scala.inline
    def setMaxInitialRequests(value: Double): Self = this.set("maxInitialRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInitialRequests: Self = this.set("maxInitialRequests", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinChunks(value: Double): Self = this.set("minChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChunks: Self = this.set("minChunks", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setName(value: Boolean | js.Function | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReuseExistingChunk(value: Boolean): Self = this.set("reuseExistingChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseExistingChunk: Self = this.set("reuseExistingChunk", js.undefined)
    
    @scala.inline
    def setTest(value: js.Function | String | RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
