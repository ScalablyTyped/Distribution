package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.downshift.mod.UseSelectStateChange
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.wordpressComponents.customSelectControlMod.CustomSelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customSelectControlMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/custom-select-control", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object CustomSelectControl {
    
    trait Option extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var key: String
      
      var name: String
      
      var style: js.UndefOr[CSSProperties] = js.undefined
    }
    object Option {
      
      @scala.inline
      def apply(key: String, name: String): Option = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      @scala.inline
      implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Used to visually hide the label. It will always be visible to screen readers.
        *
        * @defaultValue false
        */
      var hideLabelFromVision: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The label for the control.
        */
      var label: String
      
      /**
        * Function called with the control's internal state changes. The `selectedItem` property contains the next selected item.
        */
      var onChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Option], Unit]] = js.undefined
      
      /**
        * The options that can be chosen from.
        */
      var options: js.Array[Option]
      
      /**
        * Can be used to externally control the value of the control.
        */
      var value: js.UndefOr[Option] = js.undefined
    }
    object Props {
      
      @scala.inline
      def apply(label: String, options: js.Array[Option]): Props = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setHideLabelFromVision(value: Boolean): Self = StObject.set(x, "hideLabelFromVision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideLabelFromVisionUndefined: Self = StObject.set(x, "hideLabelFromVision", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: /* changes */ UseSelectStateChange[Option] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
        
        @scala.inline
        def setValue(value: Option): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
