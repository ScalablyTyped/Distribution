package typings.tslint.mod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rules {
  
  /* note: abstract class */ @JSImport("tslint", "Rules.AbstractRule")
  @js.native
  open class AbstractRule protected ()
    extends typings.tslint.libRulesMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint", "Rules.AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint", "Rules.AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("tslint", "Rules.OptionallyTypedRule")
  @js.native
  open class OptionallyTypedRule protected ()
    extends typings.tslint.libRulesMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("tslint", "Rules.TypedRule")
  @js.native
  open class TypedRule protected ()
    extends typings.tslint.libRulesMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
