package typings.stylefire

import typings.std.HTMLElement
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("stylefire/lib/css", JSImport.Default)
  @js.native
  def default(element: HTMLElement): Styler = js.native
  @JSImport("stylefire/lib/css", JSImport.Default)
  @js.native
  def default(element: HTMLElement, hasEnableHardwareAccelerationAllowTransformNoneProps: Props): Styler = js.native
  
  @js.native
  trait CssStylerOptions extends StObject {
    
    def buildStyles(state: State): ResolvedState = js.native
    
    var element: HTMLElement = js.native
    
    var hasCSSVariable: js.UndefOr[Boolean] = js.native
    
    var preparseOutput: Boolean = js.native
  }
  object CssStylerOptions {
    
    @scala.inline
    def apply(buildStyles: State => ResolvedState, element: HTMLElement, preparseOutput: Boolean): CssStylerOptions = {
      val __obj = js.Dynamic.literal(buildStyles = js.Any.fromFunction1(buildStyles), element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssStylerOptions]
    }
    
    @scala.inline
    implicit class CssStylerOptionsMutableBuilder[Self <: CssStylerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildStyles(value: State => ResolvedState): Self = StObject.set(x, "buildStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCSSVariable(value: Boolean): Self = StObject.set(x, "hasCSSVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCSSVariableUndefined: Self = StObject.set(x, "hasCSSVariable", js.undefined)
      
      @scala.inline
      def setPreparseOutput(value: Boolean): Self = StObject.set(x, "preparseOutput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    var allowTransformNone: js.UndefOr[Boolean] = js.native
    
    var enableHardwareAcceleration: js.UndefOr[Boolean] = js.native
    
    var preparseOutput: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTransformNone(value: Boolean): Self = StObject.set(x, "allowTransformNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransformNoneUndefined: Self = StObject.set(x, "allowTransformNone", js.undefined)
      
      @scala.inline
      def setEnableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "enableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHardwareAccelerationUndefined: Self = StObject.set(x, "enableHardwareAcceleration", js.undefined)
      
      @scala.inline
      def setPreparseOutput(value: Boolean): Self = StObject.set(x, "preparseOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreparseOutputUndefined: Self = StObject.set(x, "preparseOutput", js.undefined)
    }
  }
}
