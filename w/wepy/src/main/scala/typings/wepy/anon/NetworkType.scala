package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkType extends StObject {
  
  var networkType: String = js.native
}
object NetworkType {
  
  @scala.inline
  def apply(networkType: String): NetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkType]
  }
  
  @scala.inline
  implicit class NetworkTypeMutableBuilder[Self <: NetworkType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
