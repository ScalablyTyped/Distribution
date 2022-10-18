package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentFieldRef
  extends StObject
     with _Field {
  
  var level: js.UndefOr[Double] = js.undefined
  
  var parent: Field
}
object ParentFieldRef {
  
  inline def apply(parent: Field): ParentFieldRef = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentFieldRef]
  }
  
  extension [Self <: ParentFieldRef](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setParent(value: Field): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
