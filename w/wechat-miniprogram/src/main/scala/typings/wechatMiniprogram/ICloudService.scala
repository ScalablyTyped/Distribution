package typings.wechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudService extends StObject {
  
  def getAPIs(): StringDictionary[IAPIFunction[js.Any, js.Any]]
  
  var name: String
}
object ICloudService {
  
  @scala.inline
  def apply(getAPIs: () => StringDictionary[IAPIFunction[js.Any, js.Any]], name: String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  
  @scala.inline
  implicit class ICloudServiceMutableBuilder[Self <: ICloudService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAPIs(value: () => StringDictionary[IAPIFunction[js.Any, js.Any]]): Self = StObject.set(x, "getAPIs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
