package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  /**
  	 * info about the asset
  	 */
  var info: AssetInfo
  
  /**
  	 * the filename of the asset
  	 */
  var name: String
  
  /**
  	 * source of the asset
  	 */
  var source: Source
}
object Asset {
  
  inline def apply(info: AssetInfo, name: String, source: Source): Asset = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
