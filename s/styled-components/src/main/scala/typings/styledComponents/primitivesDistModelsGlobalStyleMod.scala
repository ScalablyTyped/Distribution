package typings.styledComponents

import typings.styledComponents.primitivesDistTypesMod.ExecutionContext
import typings.styledComponents.primitivesDistTypesMod.FlattenerResult
import typings.styledComponents.primitivesDistTypesMod.RuleSet
import typings.styledComponents.primitivesDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistModelsGlobalStyleMod {
  
  @JSImport("styled-components/primitives/dist/models/GlobalStyle", JSImport.Default)
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
      styleSheet: typings.styledComponents.primitivesDistSheetMod.default,
      stylis: Stringifier
    ): Unit = js.native
    
    /* CompleteClass */
    var isStatic: Boolean = js.native
    
    /* CompleteClass */
    override def removeStyles(instance: Double, styleSheet: typings.styledComponents.primitivesDistSheetMod.default): Unit = js.native
    
    /* CompleteClass */
    override def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.primitivesDistSheetMod.default,
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
      styleSheet: typings.styledComponents.primitivesDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var isStatic: Boolean
    
    def removeStyles(instance: Double, styleSheet: typings.styledComponents.primitivesDistSheetMod.default): Unit
    
    def renderStyles(
      instance: Double,
      executionContext: ExecutionContext & Props,
      styleSheet: typings.styledComponents.primitivesDistSheetMod.default,
      stylis: Stringifier
    ): Unit
    
    var rules: FlattenerResult[Props]
  }
  object GlobalStyle {
    
    inline def apply[Props](
      componentId: String,
      createStyles: (Double, ExecutionContext & Props, typings.styledComponents.primitivesDistSheetMod.default, Stringifier) => Unit,
      isStatic: Boolean,
      removeStyles: (Double, typings.styledComponents.primitivesDistSheetMod.default) => Unit,
      renderStyles: (Double, ExecutionContext & Props, typings.styledComponents.primitivesDistSheetMod.default, Stringifier) => Unit,
      rules: FlattenerResult[Props]
    ): GlobalStyle[Props] = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], createStyles = js.Any.fromFunction4(createStyles), isStatic = isStatic.asInstanceOf[js.Any], removeStyles = js.Any.fromFunction2(removeStyles), renderStyles = js.Any.fromFunction4(renderStyles), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalStyle[Props]]
    }
    
    extension [Self <: GlobalStyle[?], Props](x: Self & GlobalStyle[Props]) {
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setCreateStyles(
        value: (Double, ExecutionContext & Props, typings.styledComponents.primitivesDistSheetMod.default, Stringifier) => Unit
      ): Self = StObject.set(x, "createStyles", js.Any.fromFunction4(value))
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setRemoveStyles(value: (Double, typings.styledComponents.primitivesDistSheetMod.default) => Unit): Self = StObject.set(x, "removeStyles", js.Any.fromFunction2(value))
      
      inline def setRenderStyles(
        value: (Double, ExecutionContext & Props, typings.styledComponents.primitivesDistSheetMod.default, Stringifier) => Unit
      ): Self = StObject.set(x, "renderStyles", js.Any.fromFunction4(value))
      
      inline def setRules(value: FlattenerResult[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
