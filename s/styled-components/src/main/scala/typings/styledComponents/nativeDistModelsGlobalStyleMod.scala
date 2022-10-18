package typings.styledComponents

import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.FlattenerResult
import typings.styledComponents.nativeDistTypesMod.RuleSet
import typings.styledComponents.nativeDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistModelsGlobalStyleMod {
  
  @JSImport("styled-components/native/dist/models/GlobalStyle", JSImport.Default)
  @js.native
  open class default[Props] protected ()
    extends StObject
       with GlobalStyle[Props] {
    def this(rules: RuleSet[Props], componentId: String) = this()
    
    /* CompleteClass */
    var componentId: String = js.native
    
    /* CompleteClass */
    override def createStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.nativeDistSheetMod.default,
      stylis: Stringifier
    ): Unit = js.native
    
    /* CompleteClass */
    var isStatic: Boolean = js.native
    
    /* CompleteClass */
    override def removeStyles(instance: Double, styleSheet: typings.styledComponents.nativeDistSheetMod.default): Unit = js.native
    
    /* CompleteClass */
    override def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.nativeDistSheetMod.default,
      stylis: Stringifier
    ): Unit = js.native
    
    /* CompleteClass */
    var rules: FlattenerResult[Props] = js.native
  }
  
  trait GlobalStyle[Props] extends StObject {
    
    var componentId: String
    
    def createStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.nativeDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var isStatic: Boolean
    
    def removeStyles(instance: Double, styleSheet: typings.styledComponents.nativeDistSheetMod.default): Unit
    
    def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.nativeDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var rules: FlattenerResult[Props]
  }
  object GlobalStyle {
    
    inline def apply[Props](
      componentId: String,
      createStyles: (Double, ExecutionContext & Props, typings.styledComponents.nativeDistSheetMod.default, Stringifier) => Unit,
      isStatic: Boolean,
      removeStyles: (Double, typings.styledComponents.nativeDistSheetMod.default) => Unit,
      renderStyles: (Double, ExecutionContext & Props, typings.styledComponents.nativeDistSheetMod.default, Stringifier) => Unit,
      rules: FlattenerResult[Props]
    ): GlobalStyle[Props] = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], createStyles = js.Any.fromFunction4(createStyles), isStatic = isStatic.asInstanceOf[js.Any], removeStyles = js.Any.fromFunction2(removeStyles), renderStyles = js.Any.fromFunction4(renderStyles), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalStyle[Props]]
    }
    
    extension [Self <: GlobalStyle[?], Props](x: Self & GlobalStyle[Props]) {
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setCreateStyles(
        value: (Double, ExecutionContext & Props, typings.styledComponents.nativeDistSheetMod.default, Stringifier) => Unit
      ): Self = StObject.set(x, "createStyles", js.Any.fromFunction4(value))
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setRemoveStyles(value: (Double, typings.styledComponents.nativeDistSheetMod.default) => Unit): Self = StObject.set(x, "removeStyles", js.Any.fromFunction2(value))
      
      inline def setRenderStyles(
        value: (Double, ExecutionContext & Props, typings.styledComponents.nativeDistSheetMod.default, Stringifier) => Unit
      ): Self = StObject.set(x, "renderStyles", js.Any.fromFunction4(value))
      
      inline def setRules(value: FlattenerResult[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
