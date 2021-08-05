package typings.stylableCore.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframesMap extends StObject {
  
  var keyframesMap: Record[String, String]
  
  var namedMap: Record[String, String]
}
object KeyframesMap {
  
  inline def apply(keyframesMap: Record[String, String], namedMap: Record[String, String]): KeyframesMap = {
    val __obj = js.Dynamic.literal(keyframesMap = keyframesMap.asInstanceOf[js.Any], namedMap = namedMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesMap]
  }
  
  extension [Self <: KeyframesMap](x: Self) {
    
    inline def setKeyframesMap(value: Record[String, String]): Self = StObject.set(x, "keyframesMap", value.asInstanceOf[js.Any])
    
    inline def setNamedMap(value: Record[String, String]): Self = StObject.set(x, "namedMap", value.asInstanceOf[js.Any])
  }
}
