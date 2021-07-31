package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyclomaticComplexityRuleMod {
  
  @JSImport("tslint/lib/rules/cyclomaticComplexityRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ def threshold: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/cyclomaticComplexityRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/cyclomaticComplexityRule", "Rule.DEFAULT_THRESHOLD")
    @js.native
    def DEFAULT_THRESHOLD: Double = js.native
    @scala.inline
    def DEFAULT_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_THRESHOLD")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def FAILURE_STRING(expected: Double, actual: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def FAILURE_STRING(expected: Double, actual: Double, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/cyclomaticComplexityRule", "Rule.MINIMUM_THRESHOLD")
    @js.native
    def MINIMUM_THRESHOLD: Double = js.native
    @scala.inline
    def MINIMUM_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMUM_THRESHOLD")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/cyclomaticComplexityRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
