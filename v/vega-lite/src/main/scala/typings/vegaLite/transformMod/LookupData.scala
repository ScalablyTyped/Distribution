package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.srcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupData extends LookupBase {
  
  /**
    * Secondary data source to lookup in.
    */
  var data: Data = js.native
}
object LookupData {
  
  @scala.inline
  def apply(data: Data, key: FieldName): LookupData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupData]
  }
  
  @scala.inline
  implicit class LookupDataMutableBuilder[Self <: LookupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
