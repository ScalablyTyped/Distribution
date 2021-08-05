package typings.tslint

import typings.tslint.abstractFormatterMod.AbstractFormatter
import typings.tslint.formatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verboseFormatterMod {
  
  @JSImport("tslint/lib/formatters/verboseFormatter", "Formatter")
  @js.native
  class Formatter () extends AbstractFormatter {
    
    /* private */ var mapToMessages: js.Any = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/verboseFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/verboseFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
