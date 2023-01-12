package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupData
  extends StObject
     with LookupBase {
  
  /**
    * Secondary data source to lookup in.
    */
  var data: Data
}
object LookupData {
  
  inline def apply(data: Data, key: FieldName): LookupData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupData] (val x: Self) extends AnyVal {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
