package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbMod {
  
  @JSImport("wix-ui-core/dist/src/components/slider/Thumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/slider/Thumb", "Thumb")
  @js.native
  class Thumb protected ()
    extends Component[ThumbProps, js.Object, js.Any] {
    def this(props: ThumbProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThumbProps, context: js.Any) = this()
  }
  
  inline def getThumbSize(shape: String, rest: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getThumbSize")(shape.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait ThumbProps extends StObject {
    
    var onMouseEnter: js.Any
    
    var onMouseLeave: js.Any
    
    var shape: String
    
    var thumbPosition: CSSProperties
    
    var thumbSize: CSSProperties
  }
  object ThumbProps {
    
    inline def apply(
      onMouseEnter: js.Any,
      onMouseLeave: js.Any,
      shape: String,
      thumbPosition: CSSProperties,
      thumbSize: CSSProperties
    ): ThumbProps = {
      val __obj = js.Dynamic.literal(onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], thumbPosition = thumbPosition.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbProps]
    }
    
    extension [Self <: ThumbProps](x: Self) {
      
      inline def setOnMouseEnter(value: js.Any): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeave(value: js.Any): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setThumbPosition(value: CSSProperties): Self = StObject.set(x, "thumbPosition", value.asInstanceOf[js.Any])
      
      inline def setThumbSize(value: CSSProperties): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    }
  }
}
