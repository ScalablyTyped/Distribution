package typings.yLeveldb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clock extends StObject {
    
    var clock: Double
    
    var name: String
    
    var sv: js.typedarray.Uint8Array
  }
  object Clock {
    
    inline def apply(clock: Double, name: String, sv: js.typedarray.Uint8Array): Clock = {
      val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clock] (val x: Self) extends AnyVal {
      
      inline def setClock(value: Double): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: js.UndefOr[Any] = js.undefined
    
    var levelOptions: js.UndefOr[js.Object] = js.undefined
  }
  object Level {
    
    inline def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Any): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelOptions(value: js.Object): Self = StObject.set(x, "levelOptions", value.asInstanceOf[js.Any])
      
      inline def setLevelOptionsUndefined: Self = StObject.set(x, "levelOptions", js.undefined)
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
