package typings.three.anon

import typings.three.srcConstantsMod.MOUSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  LEFT :three.three/src/Three.MOUSE,   MIDDLE :three.three/src/Three.MOUSE,   RIGHT :three.three/src/Three.MOUSE}> */
trait PartialLEFTMOUSEMIDDLEMOU extends StObject {
  
  var LEFT: js.UndefOr[MOUSE] = js.undefined
  
  var MIDDLE: js.UndefOr[MOUSE] = js.undefined
  
  var RIGHT: js.UndefOr[MOUSE] = js.undefined
}
object PartialLEFTMOUSEMIDDLEMOU {
  
  inline def apply(): PartialLEFTMOUSEMIDDLEMOU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLEFTMOUSEMIDDLEMOU]
  }
  
  extension [Self <: PartialLEFTMOUSEMIDDLEMOU](x: Self) {
    
    inline def setLEFT(value: MOUSE): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setLEFTUndefined: Self = StObject.set(x, "LEFT", js.undefined)
    
    inline def setMIDDLE(value: MOUSE): Self = StObject.set(x, "MIDDLE", value.asInstanceOf[js.Any])
    
    inline def setMIDDLEUndefined: Self = StObject.set(x, "MIDDLE", js.undefined)
    
    inline def setRIGHT(value: MOUSE): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setRIGHTUndefined: Self = StObject.set(x, "RIGHT", js.undefined)
  }
}
