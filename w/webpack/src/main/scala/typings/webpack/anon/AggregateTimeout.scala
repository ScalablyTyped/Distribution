package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateTimeout extends StObject {
  
  /**
  		 * Delay the rebuilt after the first change. Value is a time in ms.
  		 */
  var aggregateTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Resolve symlinks and watch symlink and real file. This is usually not needed as webpack already resolves symlinks ('resolve.symlinks').
  		 */
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Ignore some files from watching (glob pattern or regexp).
  		 */
  var ignored: js.UndefOr[String | js.RegExp | js.Array[String]] = js.undefined
  
  /**
  		 * Enable polling mode for watching.
  		 */
  var poll: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
  		 * Stop watching when stdin stream has ended.
  		 */
  var stdin: js.UndefOr[Boolean] = js.undefined
}
object AggregateTimeout {
  
  inline def apply(): AggregateTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateTimeout] (val x: Self) extends AnyVal {
    
    inline def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
    
    inline def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
    
    inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
    
    inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
    
    inline def setIgnored(value: String | js.RegExp | js.Array[String]): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setIgnoredVarargs(value: String*): Self = StObject.set(x, "ignored", js.Array(value*))
    
    inline def setPoll(value: Double | Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
  }
}
