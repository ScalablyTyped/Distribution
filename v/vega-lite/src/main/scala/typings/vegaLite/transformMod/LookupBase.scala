package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupBase extends StObject {
  
  /**
    * Fields in foreign data or selection to lookup.
    * If not specified, the entire object is queried.
    */
  var fields: js.UndefOr[js.Array[FieldName]] = js.native
  
  /**
    * Key in data to lookup.
    */
  var key: FieldName = js.native
}
object LookupBase {
  
  @scala.inline
  def apply(key: FieldName): LookupBase = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupBase]
  }
  
  @scala.inline
  implicit class LookupBaseMutableBuilder[Self <: LookupBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: FieldName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
