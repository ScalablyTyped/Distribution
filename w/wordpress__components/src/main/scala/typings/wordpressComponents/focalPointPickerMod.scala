package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typings.wordpressComponents.focalPointPickerMod.FocalPointPicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focalPointPickerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/focal-point-picker", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FocalPointPicker {
    
    @js.native
    trait FocalPoint extends StObject {
      
      /**
        * Fractional percent from LTR of image (Range 0 to 1).
        */
      var x: Double = js.native
      
      /**
        * Fractional percent from TTB of image (Range 0 to 1).
        */
      var y: Double = js.native
    }
    object FocalPoint {
      
      @scala.inline
      def apply(x: Double, y: Double): FocalPoint = {
        val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[FocalPoint]
      }
      
      @scala.inline
      implicit class FocalPointMutableBuilder[Self <: FocalPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props extends ControlProps {
      
      /**
        * Callback which is called when the focal point changes.
        */
      def onChange(value: FocalPoint): Unit = js.native
      
      /**
        * URL of the image to be displayed.
        */
      var url: String = js.native
      
      /**
        * The focal point.
        */
      var value: FocalPoint = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: FocalPoint => Unit, url: String, value: FocalPoint): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnChange(value: FocalPoint => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: FocalPoint): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
