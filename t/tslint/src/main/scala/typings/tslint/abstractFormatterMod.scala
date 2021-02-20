package typings.tslint

import typings.tslint.formatterMod.IFormatter
import typings.tslint.formatterMod.IFormatterMetadata
import typings.tslint.ruleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractFormatterMod {
  
  @JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
  @js.native
  abstract class AbstractFormatter () extends IFormatter {
    
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
    @scala.inline
    def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
