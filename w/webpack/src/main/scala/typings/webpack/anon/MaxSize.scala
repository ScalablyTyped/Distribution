package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxSize extends StObject {
  
  /**
  		 * Sets the name delimiter for created chunks
  		 */
  var automaticNameDelimiter: js.UndefOr[String] = js.native
  
  /**
  		 * Maximal size hint for the created chunks
  		 */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
  		 * Minimal size for the created chunk
  		 */
  var minSize: js.UndefOr[Double] = js.native
}
object MaxSize {
  
  @scala.inline
  def apply(): MaxSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize]
  }
  
  @scala.inline
  implicit class MaxSizeMutableBuilder[Self <: MaxSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
