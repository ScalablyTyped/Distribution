package typings.xterm

import typings.std.KeyboardEvent
import typings.xterm.mod.IDecorationOverviewRulerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cols extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object Cols {
    
    inline def apply(cols: Double, rows: Double): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomEvent extends StObject {
    
    var domEvent: KeyboardEvent
    
    var key: String
  }
  object DomEvent {
    
    inline def apply(domEvent: KeyboardEvent, key: String): DomEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
      
      inline def setDomEvent(value: KeyboardEvent): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<xterm.xterm.IDecorationOptions, 'overviewRulerOptions'> */
  trait PickIDecorationOptionsove extends StObject {
    
    var overviewRulerOptions: js.UndefOr[IDecorationOverviewRulerOptions] = js.undefined
  }
  object PickIDecorationOptionsove {
    
    inline def apply(): PickIDecorationOptionsove = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickIDecorationOptionsove]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickIDecorationOptionsove] (val x: Self) extends AnyVal {
      
      inline def setOverviewRulerOptions(value: IDecorationOverviewRulerOptions): Self = StObject.set(x, "overviewRulerOptions", value.asInstanceOf[js.Any])
      
      inline def setOverviewRulerOptionsUndefined: Self = StObject.set(x, "overviewRulerOptions", js.undefined)
    }
  }
}
