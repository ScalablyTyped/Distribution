package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupFieldRef
  extends StObject
     with _Field {
  
  var group: Field
  
  var level: js.UndefOr[Double] = js.undefined
}
object GroupFieldRef {
  
  inline def apply(group: Field): GroupFieldRef = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFieldRef]
  }
  
  extension [Self <: GroupFieldRef](x: Self) {
    
    inline def setGroup(value: Field): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
