package typings.webpack.anon

import typings.std.RegExp
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticNameDelimiter extends StObject {
  
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
  implicit class AutomaticNameDelimiterMutableBuilder[Self <: AutomaticNameDelimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    @scala.inline
    def setAutomaticNameMaxLength(value: Double): Self = StObject.set(x, "automaticNameMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticNameMaxLengthUndefined: Self = StObject.set(x, "automaticNameMaxLength", js.undefined)
    
    @scala.inline
    def setAutomaticNamePrefix(value: String): Self = StObject.set(x, "automaticNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticNamePrefixUndefined: Self = StObject.set(x, "automaticNamePrefix", js.undefined)
    
    @scala.inline
    def setChunks(value: initial | async | all | js.Function): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    @scala.inline
    def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSizeThreshold(value: Double): Self = StObject.set(x, "enforceSizeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSizeThresholdUndefined: Self = StObject.set(x, "enforceSizeThreshold", js.undefined)
    
    @scala.inline
    def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    @scala.inline
    def setMaxInitialRequests(value: Double): Self = StObject.set(x, "maxInitialRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInitialRequestsUndefined: Self = StObject.set(x, "maxInitialRequests", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinChunks(value: Double): Self = StObject.set(x, "minChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChunksUndefined: Self = StObject.set(x, "minChunks", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setName(value: Boolean | js.Function | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReuseExistingChunk(value: Boolean): Self = StObject.set(x, "reuseExistingChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReuseExistingChunkUndefined: Self = StObject.set(x, "reuseExistingChunk", js.undefined)
    
    @scala.inline
    def setTest(value: js.Function | String | RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
