package typings.waypoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Adapter extends StObject {
    
    var Adapter: WaypointAdapter
    
    var name: String
  }
  object Adapter {
    
    @scala.inline
    def apply(Adapter: WaypointAdapter, name: String): Adapter = {
      val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "Adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Horizontal extends StObject
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
