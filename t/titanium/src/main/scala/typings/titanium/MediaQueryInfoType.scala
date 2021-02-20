package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A full query descriptor for a filtering predicate.
  */
@js.native
trait MediaQueryInfoType extends StObject {
  
  /**
    * Whether or not the predicate is for an exact match.  The default is `true`.
    */
  var exact: js.UndefOr[Boolean] = js.native
  
  /**
    * The value for the given predicate. See the descriptions in <MediaQueryType> for information about which properties require which values.
    */
  var value: js.UndefOr[Double | String | Boolean] = js.native
}
object MediaQueryInfoType {
  
  @scala.inline
  def apply(): MediaQueryInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryInfoType]
  }
  
  @scala.inline
  implicit class MediaQueryInfoTypeMutableBuilder[Self <: MediaQueryInfoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
