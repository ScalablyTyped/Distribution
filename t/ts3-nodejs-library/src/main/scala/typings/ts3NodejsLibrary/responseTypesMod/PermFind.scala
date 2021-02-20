package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermFind extends ResponseEntry {
  
  var id1: Double = js.native
  
  var id2: Double = js.native
  
  var p: Double = js.native
  
  var t: Double = js.native
}
object PermFind {
  
  @scala.inline
  def apply(id1: Double, id2: Double, p: Double, t: Double): PermFind = {
    val __obj = js.Dynamic.literal(id1 = id1.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermFind]
  }
  
  @scala.inline
  implicit class PermFindMutableBuilder[Self <: PermFind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId1(value: Double): Self = StObject.set(x, "id1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId2(value: Double): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
