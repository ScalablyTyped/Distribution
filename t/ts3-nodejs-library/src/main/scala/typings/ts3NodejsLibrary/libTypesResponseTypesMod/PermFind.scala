package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermFind
  extends StObject
     with ResponseEntry {
  
  var id1: Double
  
  var id2: Double
  
  var p: Double
  
  var t: Double
}
object PermFind {
  
  inline def apply(id1: Double, id2: Double, p: Double, t: Double): PermFind = {
    val __obj = js.Dynamic.literal(id1 = id1.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermFind]
  }
  
  extension [Self <: PermFind](x: Self) {
    
    inline def setId1(value: Double): Self = StObject.set(x, "id1", value.asInstanceOf[js.Any])
    
    inline def setId2(value: Double): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
