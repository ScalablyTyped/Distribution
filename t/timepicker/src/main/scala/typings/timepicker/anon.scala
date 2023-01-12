package typings.timepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AM extends StObject {
    
    var AM: js.UndefOr[String] = js.undefined
    
    var PM: js.UndefOr[String] = js.undefined
    
    var am: js.UndefOr[String] = js.undefined
    
    var decimal: js.UndefOr[String] = js.undefined
    
    var hr: js.UndefOr[String] = js.undefined
    
    var hrs: js.UndefOr[String] = js.undefined
    
    var mins: js.UndefOr[String] = js.undefined
    
    var pm: js.UndefOr[String] = js.undefined
  }
  object AM {
    
    inline def apply(): AM = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AM]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AM] (val x: Self) extends AnyVal {
      
      inline def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setHr(value: String): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setHrs(value: String): Self = StObject.set(x, "hrs", value.asInstanceOf[js.Any])
      
      inline def setHrsUndefined: Self = StObject.set(x, "hrs", js.undefined)
      
      inline def setMins(value: String): Self = StObject.set(x, "mins", value.asInstanceOf[js.Any])
      
      inline def setMinsUndefined: Self = StObject.set(x, "mins", js.undefined)
      
      inline def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    inline def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
