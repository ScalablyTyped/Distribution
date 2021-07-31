package typings.tslint

import typings.tslint.abstractFormatterMod.AbstractFormatter
import typings.tslint.formatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pmdFormatterMod {
  
  @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter")
  @js.native
  class Formatter () extends AbstractFormatter
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/pmdFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    @scala.inline
    def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
