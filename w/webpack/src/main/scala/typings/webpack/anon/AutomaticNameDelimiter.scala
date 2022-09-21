package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticNameDelimiter extends StObject {
  
  /**
  		 * Sets the name delimiter for created chunks.
  		 */
  var automaticNameDelimiter: js.UndefOr[String] = js.undefined
  
  /**
  		 * Select chunks for determining shared modules (defaults to "async", "initial" and "all" requires adding these chunks to the HTML).
  		 */
  var chunks: js.UndefOr[
    all | initial | async | (js.Function1[/* chunk */ typings.webpack.mod.Chunk, Boolean])
  ] = js.undefined
  
  /**
  		 * Maximal size hint for the on-demand chunks.
  		 */
  var maxAsyncSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  		 * Maximal size hint for the initial chunks.
  		 */
  var maxInitialSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  		 * Maximal size hint for the created chunks.
  		 */
  var maxSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  		 * Minimal size for the created chunk.
  		 */
  var minSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  		 * Minimum size reduction due to the created chunk.
  		 */
  var minSizeReduction: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
}
object AutomaticNameDelimiter {
  
  inline def apply(): AutomaticNameDelimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticNameDelimiter]
  }
  
  extension [Self <: AutomaticNameDelimiter](x: Self) {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    inline def setChunks(value: all | initial | async | (js.Function1[/* chunk */ typings.webpack.mod.Chunk, Boolean])): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksFunction1(value: /* chunk */ typings.webpack.mod.Chunk => Boolean): Self = StObject.set(x, "chunks", js.Any.fromFunction1(value))
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setMaxAsyncSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxAsyncSize", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncSizeUndefined: Self = StObject.set(x, "maxAsyncSize", js.undefined)
    
    inline def setMaxInitialSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxInitialSize", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialSizeUndefined: Self = StObject.set(x, "maxInitialSize", js.undefined)
    
    inline def setMaxSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeReduction(value: Double | StringDictionary[Double]): Self = StObject.set(x, "minSizeReduction", value.asInstanceOf[js.Any])
    
    inline def setMinSizeReductionUndefined: Self = StObject.set(x, "minSizeReduction", js.undefined)
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
