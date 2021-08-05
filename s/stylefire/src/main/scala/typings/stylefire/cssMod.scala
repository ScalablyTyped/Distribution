package typings.stylefire

import typings.std.HTMLElement
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("stylefire/lib/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Styler]
  inline def default(element: HTMLElement, hasEnableHardwareAccelerationAllowTransformNoneProps: Props): Styler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], hasEnableHardwareAccelerationAllowTransformNoneProps.asInstanceOf[js.Any])).asInstanceOf[Styler]
  
  trait CssStylerOptions extends StObject {
    
    def buildStyles(state: State): ResolvedState
    
    var element: HTMLElement
    
    var hasCSSVariable: js.UndefOr[Boolean] = js.undefined
    
    var preparseOutput: Boolean
  }
  object CssStylerOptions {
    
    inline def apply(buildStyles: State => ResolvedState, element: HTMLElement, preparseOutput: Boolean): CssStylerOptions = {
      val __obj = js.Dynamic.literal(buildStyles = js.Any.fromFunction1(buildStyles), element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssStylerOptions]
    }
    
    extension [Self <: CssStylerOptions](x: Self) {
      
      inline def setBuildStyles(value: State => ResolvedState): Self = StObject.set(x, "buildStyles", js.Any.fromFunction1(value))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHasCSSVariable(value: Boolean): Self = StObject.set(x, "hasCSSVariable", value.asInstanceOf[js.Any])
      
      inline def setHasCSSVariableUndefined: Self = StObject.set(x, "hasCSSVariable", js.undefined)
      
      inline def setPreparseOutput(value: Boolean): Self = StObject.set(x, "preparseOutput", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var allowTransformNone: js.UndefOr[Boolean] = js.undefined
    
    var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
    
    var preparseOutput: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAllowTransformNone(value: Boolean): Self = StObject.set(x, "allowTransformNone", value.asInstanceOf[js.Any])
      
      inline def setAllowTransformNoneUndefined: Self = StObject.set(x, "allowTransformNone", js.undefined)
      
      inline def setEnableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "enableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      inline def setEnableHardwareAccelerationUndefined: Self = StObject.set(x, "enableHardwareAcceleration", js.undefined)
      
      inline def setPreparseOutput(value: Boolean): Self = StObject.set(x, "preparseOutput", value.asInstanceOf[js.Any])
      
      inline def setPreparseOutputUndefined: Self = StObject.set(x, "preparseOutput", js.undefined)
    }
  }
}
