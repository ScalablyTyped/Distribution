package typings.tslint

import typings.tslint.libLanguageFormatterFormatterMod.IFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageFormatterAbstractFormatterMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
  @js.native
  open class AbstractFormatter ()
    extends StObject
       with IFormatter {
    
    /* protected */ def sortFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
  }
  /* static members */
  object AbstractFormatter {
    
    @JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
