package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermOverviewEntry
  extends StObject
     with ResponseEntry {
  
  var id: Double
  
  var id2: Double
  
  /** negate */
  var n: Double
  
  /** perm */
  var p: Double
  
  /** skip */
  var s: Double
  
  var t: Double
  
  /** value */
  var v: Double
}
object PermOverviewEntry {
  
  inline def apply(id: Double, id2: Double, n: Double, p: Double, s: Double, t: Double, v: Double): PermOverviewEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermOverviewEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermOverviewEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId2(value: Double): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
