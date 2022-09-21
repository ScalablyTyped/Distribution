package typings.webpack.anon

import typings.webpack.mod.AssetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<webpack.webpack.Asset> */
trait ReadonlyAsset extends StObject {
  
  val info: AssetInfo
  
  val name: String
  
  val source: typings.webpack.mod.Source
}
object ReadonlyAsset {
  
  inline def apply(info: AssetInfo, name: String, source: typings.webpack.mod.Source): ReadonlyAsset = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyAsset]
  }
  
  extension [Self <: ReadonlyAsset](x: Self) {
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.webpack.mod.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
