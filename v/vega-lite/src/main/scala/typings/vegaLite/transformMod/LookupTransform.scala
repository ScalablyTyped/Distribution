package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupTransform extends Transform {
  
  /**
    * The default value to use if lookup fails.
    *
    * __Default value:__ `null`
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    * The output fields on which to store the looked up data values.
    *
    * For data lookups, this property may be left blank if `from.fields`
    * has been specified (those field names will be used); if `from.fields`
    * has not been specified, `as` must be a string.
    *
    * For selection lookups, this property is optional: if unspecified,
    * looked up values will be stored under a property named for the selection;
    * and if specified, it must correspond to `from.fields`.
    */
  var as: js.UndefOr[FieldName | js.Array[FieldName]] = js.native
  
  /**
    * Data source or selection for secondary data reference.
    */
  var from: LookupData | LookupSelection = js.native
  
  /**
    * Key in primary data source.
    */
  var lookup: String = js.native
}
object LookupTransform {
  
  @scala.inline
  def apply(from: LookupData | LookupSelection, lookup: String): LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupTransform]
  }
  
  @scala.inline
  implicit class LookupTransformMutableBuilder[Self <: LookupTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName | js.Array[FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: FieldName*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setFrom(value: LookupData | LookupSelection): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookup(value: String): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
