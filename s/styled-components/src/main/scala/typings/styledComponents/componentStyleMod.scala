package typings.styledComponents

import typings.styledComponents.distTypesMod.RuleSet
import typings.styledComponents.distTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentStyleMod {
  
  @JSImport("styled-components/native/dist/dist/models/ComponentStyle", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentStyle {
    def this(rules: RuleSet[Any], componentId: String) = this()
    def this(rules: RuleSet[Any], componentId: String, baseStyle: ComponentStyle) = this()
    
    /* CompleteClass */
    var baseHash: Double = js.native
    
    /* CompleteClass */
    var componentId: String = js.native
    
    /* CompleteClass */
    override def generateAndInjectStyles(
      executionContext: js.Object,
      styleSheet: typings.styledComponents.sheetMod.default,
      stylis: Stringifier
    ): String = js.native
    
    /* CompleteClass */
    var isStatic: Boolean = js.native
    
    /* CompleteClass */
    var rules: RuleSet[Any] = js.native
    
    /* CompleteClass */
    var staticRulesId: String = js.native
  }
  
  trait ComponentStyle extends StObject {
    
    var baseHash: Double
    
    var baseStyle: js.UndefOr[ComponentStyle | Null] = js.undefined
    
    var componentId: String
    
    def generateAndInjectStyles(
      executionContext: js.Object,
      styleSheet: typings.styledComponents.sheetMod.default,
      stylis: Stringifier
    ): String
    
    var isStatic: Boolean
    
    var rules: RuleSet[Any]
    
    var staticRulesId: String
  }
  object ComponentStyle {
    
    inline def apply(
      baseHash: Double,
      componentId: String,
      generateAndInjectStyles: (js.Object, typings.styledComponents.sheetMod.default, Stringifier) => String,
      isStatic: Boolean,
      rules: RuleSet[Any],
      staticRulesId: String
    ): ComponentStyle = {
      val __obj = js.Dynamic.literal(baseHash = baseHash.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any], generateAndInjectStyles = js.Any.fromFunction3(generateAndInjectStyles), isStatic = isStatic.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], staticRulesId = staticRulesId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentStyle]
    }
    
    extension [Self <: ComponentStyle](x: Self) {
      
      inline def setBaseHash(value: Double): Self = StObject.set(x, "baseHash", value.asInstanceOf[js.Any])
      
      inline def setBaseStyle(value: ComponentStyle): Self = StObject.set(x, "baseStyle", value.asInstanceOf[js.Any])
      
      inline def setBaseStyleNull: Self = StObject.set(x, "baseStyle", null)
      
      inline def setBaseStyleUndefined: Self = StObject.set(x, "baseStyle", js.undefined)
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setGenerateAndInjectStyles(value: (js.Object, typings.styledComponents.sheetMod.default, Stringifier) => String): Self = StObject.set(x, "generateAndInjectStyles", js.Any.fromFunction3(value))
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setRules(value: RuleSet[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setStaticRulesId(value: String): Self = StObject.set(x, "staticRulesId", value.asInstanceOf[js.Any])
    }
  }
}
