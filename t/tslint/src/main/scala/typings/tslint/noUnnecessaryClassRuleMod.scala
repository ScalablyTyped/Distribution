package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noUnnecessaryClassRuleMod {
  
  @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule.FAILURE_CONSTRUCTOR_ONLY")
    @js.native
    def FAILURE_CONSTRUCTOR_ONLY: String = js.native
    @scala.inline
    def FAILURE_CONSTRUCTOR_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_CONSTRUCTOR_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule.FAILURE_EMPTY_CLASS")
    @js.native
    def FAILURE_EMPTY_CLASS: String = js.native
    @scala.inline
    def FAILURE_EMPTY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_EMPTY_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule.FAILURE_STATIC_ONLY")
    @js.native
    def FAILURE_STATIC_ONLY: String = js.native
    @scala.inline
    def FAILURE_STATIC_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STATIC_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noUnnecessaryClassRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
