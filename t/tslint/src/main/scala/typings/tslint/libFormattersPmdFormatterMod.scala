package typings.tslint

import typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersPmdFormatterMod {
  
  @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter")
  @js.native
  open class Formatter () extends AbstractFormatter
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
