package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermOverviewEntry extends ResponseEntry {
  
  var id: Double = js.native
  
  var id2: Double = js.native
  
  /** negate */
  var n: Double = js.native
  
  /** perm */
  var p: Double = js.native
  
  /** skip */
  var s: Double = js.native
  
  var t: Double = js.native
  
  /** value */
  var v: Double = js.native
}
object PermOverviewEntry {
  
  @scala.inline
  def apply(id: Double, id2: Double, n: Double, p: Double, s: Double, t: Double, v: Double): PermOverviewEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermOverviewEntry]
  }
  
  @scala.inline
  implicit class PermOverviewEntryMutableBuilder[Self <: PermOverviewEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId2(value: Double): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
