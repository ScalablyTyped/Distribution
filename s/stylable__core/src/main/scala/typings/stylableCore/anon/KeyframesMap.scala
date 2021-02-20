package typings.stylableCore.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframesMap extends StObject {
  
  var keyframesMap: Record[String, String] = js.native
  
  var namedMap: Record[String, String] = js.native
}
object KeyframesMap {
  
  @scala.inline
  def apply(keyframesMap: Record[String, String], namedMap: Record[String, String]): KeyframesMap = {
    val __obj = js.Dynamic.literal(keyframesMap = keyframesMap.asInstanceOf[js.Any], namedMap = namedMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesMap]
  }
  
  @scala.inline
  implicit class KeyframesMapMutableBuilder[Self <: KeyframesMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyframesMap(value: Record[String, String]): Self = StObject.set(x, "keyframesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedMap(value: Record[String, String]): Self = StObject.set(x, "namedMap", value.asInstanceOf[js.Any])
  }
}
