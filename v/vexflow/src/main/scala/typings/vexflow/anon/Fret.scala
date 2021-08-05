package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fret extends StObject {
  
  var fret: Double
  
  var str: Double
}
object Fret {
  
  inline def apply(fret: Double, str: Double): Fret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fret]
  }
  
  extension [Self <: Fret](x: Self) {
    
    inline def setFret(value: Double): Self = StObject.set(x, "fret", value.asInstanceOf[js.Any])
    
    inline def setStr(value: Double): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
