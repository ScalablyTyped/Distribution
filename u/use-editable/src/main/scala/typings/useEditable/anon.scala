package typings.useEditable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var row: Double
  }
  object Column {
    
    inline def apply(column: Double, row: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current extends StObject {
    
    var current: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object Current {
    
    inline def apply(): Current = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: HTMLElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var position: typings.useEditable.distTypesUseEditableMod.Position
    
    var text: String
  }
  object Position {
    
    inline def apply(position: typings.useEditable.distTypesUseEditableMod.Position, text: String): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: typings.useEditable.distTypesUseEditableMod.Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
