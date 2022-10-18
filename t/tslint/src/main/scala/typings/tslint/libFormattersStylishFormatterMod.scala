package typings.tslint

import typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersStylishFormatterMod {
  
  @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter")
  @js.native
  open class Formatter () extends AbstractFormatter {
    
    /* private */ var getPositionMaxSize: Any = js.native
    
    /* private */ var getRuleMaxSize: Any = js.native
    
    /* private */ var mapToMessages: Any = js.native
    
    /* private */ var pad: Any = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
