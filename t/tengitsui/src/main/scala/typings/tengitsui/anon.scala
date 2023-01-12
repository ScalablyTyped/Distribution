package typings.tengitsui

import typings.tengitsui.mod.AdvancedSchema
import typings.tengitsui.mod.Api
import typings.tengitsui.mod.RangePickerProps
import typings.tengitsui.mod.actionGen
import typings.tengitsui.mod.clickFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action
    extends StObject
       with Api {
    
    var action: js.UndefOr[actionGen] = js.undefined
    
    var confirm: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onClick: js.UndefOr[clickFn] = js.undefined
    
    var readonly: js.UndefOr[String] = js.undefined
    
    var reorganizeSchema: js.UndefOr[js.Function1[/* schema */ AdvancedSchema, AdvancedSchema]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Action {
    
    inline def apply(name: String): Action = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* record */ js.Object => Boolean): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* record */ js.Object, /* params */ js.Object) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setReadonly(value: String): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setReorganizeSchema(value: /* schema */ AdvancedSchema => AdvancedSchema): Self = StObject.set(x, "reorganizeSchema", js.Any.fromFunction1(value))
      
      inline def setReorganizeSchemaUndefined: Self = StObject.set(x, "reorganizeSchema", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: typings.tengitsui.mod.Fields
  }
  object Fields {
    
    inline def apply(fields: typings.tengitsui.mod.Fields): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setFields(value: typings.tengitsui.mod.Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value
    extends StObject
       with RangePickerProps {
    
    var value: js.UndefOr[Null | (js.Array[Null | String])] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[Null | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Null | String)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
