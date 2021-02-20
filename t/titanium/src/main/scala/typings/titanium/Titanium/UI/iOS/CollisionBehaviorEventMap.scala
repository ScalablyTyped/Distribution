package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollisionBehaviorEventMap extends ProxyEventMap {
  
  var boundarycollision: CollisionBehaviorBoundarycollisionEvent = js.native
  
  var itemcollision: CollisionBehaviorItemcollisionEvent = js.native
}
object CollisionBehaviorEventMap {
  
  @scala.inline
  def apply(
    boundarycollision: CollisionBehaviorBoundarycollisionEvent,
    itemcollision: CollisionBehaviorItemcollisionEvent
  ): CollisionBehaviorEventMap = {
    val __obj = js.Dynamic.literal(boundarycollision = boundarycollision.asInstanceOf[js.Any], itemcollision = itemcollision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorEventMap]
  }
  
  @scala.inline
  implicit class CollisionBehaviorEventMapMutableBuilder[Self <: CollisionBehaviorEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundarycollision(value: CollisionBehaviorBoundarycollisionEvent): Self = StObject.set(x, "boundarycollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemcollision(value: CollisionBehaviorItemcollisionEvent): Self = StObject.set(x, "itemcollision", value.asInstanceOf[js.Any])
  }
}
