package typings.victoryCore

import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.circle
    - typings.victoryCore.victoryCoreStrings.cross
    - typings.victoryCore.victoryCoreStrings.diamond
    - typings.victoryCore.victoryCoreStrings.plus
    - typings.victoryCore.victoryCoreStrings.minus
    - typings.victoryCore.victoryCoreStrings.square
    - typings.victoryCore.victoryCoreStrings.star
    - typings.victoryCore.victoryCoreStrings.triangleDown
    - typings.victoryCore.victoryCoreStrings.triangleUp
  */
  trait ScatterSymbolType extends StObject
  object ScatterSymbolType {
    
    inline def circle: typings.victoryCore.victoryCoreStrings.circle = "circle".asInstanceOf[typings.victoryCore.victoryCoreStrings.circle]
    
    inline def cross: typings.victoryCore.victoryCoreStrings.cross = "cross".asInstanceOf[typings.victoryCore.victoryCoreStrings.cross]
    
    inline def diamond: typings.victoryCore.victoryCoreStrings.diamond = "diamond".asInstanceOf[typings.victoryCore.victoryCoreStrings.diamond]
    
    inline def minus: typings.victoryCore.victoryCoreStrings.minus = "minus".asInstanceOf[typings.victoryCore.victoryCoreStrings.minus]
    
    inline def plus: typings.victoryCore.victoryCoreStrings.plus = "plus".asInstanceOf[typings.victoryCore.victoryCoreStrings.plus]
    
    inline def square: typings.victoryCore.victoryCoreStrings.square = "square".asInstanceOf[typings.victoryCore.victoryCoreStrings.square]
    
    inline def star: typings.victoryCore.victoryCoreStrings.star = "star".asInstanceOf[typings.victoryCore.victoryCoreStrings.star]
    
    inline def triangleDown: typings.victoryCore.victoryCoreStrings.triangleDown = "triangleDown".asInstanceOf[typings.victoryCore.victoryCoreStrings.triangleDown]
    
    inline def triangleUp: typings.victoryCore.victoryCoreStrings.triangleUp = "triangleUp".asInstanceOf[typings.victoryCore.victoryCoreStrings.triangleUp]
  }
  
  trait VictoryPrimitiveShapeProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    @JSName("desc")
    var desc_VictoryPrimitiveShapeProps: js.UndefOr[String] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
  }
  object VictoryPrimitiveShapeProps {
    
    inline def apply(): VictoryPrimitiveShapeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPrimitiveShapeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryPrimitiveShapeProps] (val x: Self) extends AnyVal {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
