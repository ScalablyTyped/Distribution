package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintStrings.`Shorthand method assignments have been disallowedDot`
import typings.tslint.tslintStrings.`Shorthand property and method assignments have been disallowedDot`
import typings.tslint.tslintStrings.`Shorthand property assignments have been disallowedDot`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectLiteralShorthandRuleMod {
  
  @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var parseOptions: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule.LONGHAND_METHOD")
    @js.native
    def LONGHAND_METHOD: String = js.native
    inline def LONGHAND_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONGHAND_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule.LONGHAND_PROPERTY")
    @js.native
    def LONGHAND_PROPERTY: String = js.native
    inline def LONGHAND_PROPERTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONGHAND_PROPERTY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule.SHORTHAND_ASSIGNMENT")
    @js.native
    def SHORTHAND_ASSIGNMENT: String = js.native
    inline def SHORTHAND_ASSIGNMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORTHAND_ASSIGNMENT")(x.asInstanceOf[js.Any])
    
    inline def getDisallowedShorthandErrorMessage(options: Options): (`Shorthand property assignments have been disallowedDot`) | (`Shorthand method assignments have been disallowedDot`) | (`Shorthand property and method assignments have been disallowedDot`) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisallowedShorthandErrorMessage")(options.asInstanceOf[js.Any]).asInstanceOf[(`Shorthand property assignments have been disallowedDot`) | (`Shorthand method assignments have been disallowedDot`) | (`Shorthand property and method assignments have been disallowedDot`)]
    
    inline def getLonghandMethodErrorMessage(nodeText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLonghandMethodErrorMessage")(nodeText.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getLonghandPropertyErrorMessage(nodeText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLonghandPropertyErrorMessage")(nodeText.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var enforceShorthandMethods: Boolean
    
    var enforceShorthandProperties: Boolean
  }
  object Options {
    
    inline def apply(enforceShorthandMethods: Boolean, enforceShorthandProperties: Boolean): Options = {
      val __obj = js.Dynamic.literal(enforceShorthandMethods = enforceShorthandMethods.asInstanceOf[js.Any], enforceShorthandProperties = enforceShorthandProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnforceShorthandMethods(value: Boolean): Self = StObject.set(x, "enforceShorthandMethods", value.asInstanceOf[js.Any])
      
      inline def setEnforceShorthandProperties(value: Boolean): Self = StObject.set(x, "enforceShorthandProperties", value.asInstanceOf[js.Any])
    }
  }
}
