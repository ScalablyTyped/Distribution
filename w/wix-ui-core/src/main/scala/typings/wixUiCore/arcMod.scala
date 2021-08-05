package typings.wixUiCore

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcMod {
  
  @JSImport("wix-ui-core/dist/src/components/circular-progress-bar/Arc", "Arc")
  @js.native
  val Arc: FunctionComponent[ArcProps] = js.native
  
  trait ArcProps extends StObject {
    
    var className: String
    
    var size: Double
    
    var strokeWidth: Double
    
    var value: Double
  }
  object ArcProps {
    
    inline def apply(className: String, size: Double, strokeWidth: Double, value: Double): ArcProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcProps]
    }
    
    extension [Self <: ArcProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
