package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileNameCasingRuleMod {
  
  @JSImport("tslint/lib/rules/fileNameCasingRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/fileNameCasingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/fileNameCasingRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: Any = js.native
    inline def FAILURE_STRING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/fileNameCasingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    inline def showWarning(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showWarning")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("tslint/lib/rules/fileNameCasingRule", "Rule.stylizedNameForCasing")
    @js.native
    def stylizedNameForCasing: Any = js.native
    inline def stylizedNameForCasing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stylizedNameForCasing")(x.asInstanceOf[js.Any])
  }
}
