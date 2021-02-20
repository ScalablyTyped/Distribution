package typings.xterm

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cols extends StObject {
    
    var cols: Double = js.native
    
    var rows: Double = js.native
  }
  object Cols {
    
    @scala.inline
    def apply(cols: Double, rows: Double): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    @scala.inline
    implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomEvent extends StObject {
    
    var domEvent: KeyboardEvent = js.native
    
    var key: String = js.native
  }
  object DomEvent {
    
    @scala.inline
    def apply(domEvent: KeyboardEvent, key: String): DomEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEvent]
    }
    
    @scala.inline
    implicit class DomEventMutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: KeyboardEvent): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
