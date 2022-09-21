package typings.webpack.anon

import typings.webpack.mod.AssetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var info: AssetInfo
  
  var source: typings.webpack.mod.Source
}
object Source {
  
  inline def apply(info: AssetInfo, source: typings.webpack.mod.Source): Source = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.webpack.mod.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
