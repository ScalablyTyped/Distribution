package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateTimeout extends StObject {
  
  /**
  		 * Delay the rebuilt after the first change. Value is a time in ms.
  		 */
  var aggregateTimeout: js.UndefOr[Double] = js.native
  
  /**
  		 * Ignore some files from watching
  		 */
  var ignored: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  		 * Enable polling mode for watching
  		 */
  var poll: js.UndefOr[Boolean | Double] = js.native
  
  /**
  		 * Stop watching when stdin stream has ended
  		 */
  var stdin: js.UndefOr[Boolean] = js.native
}
object AggregateTimeout {
  
  @scala.inline
  def apply(): AggregateTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateTimeout]
  }
  
  @scala.inline
  implicit class AggregateTimeoutMutableBuilder[Self <: AggregateTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
    
    @scala.inline
    def setIgnored(value: StringDictionary[js.Any]): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    @scala.inline
    def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
  }
}
