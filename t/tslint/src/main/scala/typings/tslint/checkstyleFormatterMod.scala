package typings.tslint

import typings.tslint.abstractFormatterMod.AbstractFormatter
import typings.tslint.formatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkstyleFormatterMod {
  
  @JSImport("tslint/lib/formatters/checkstyleFormatter", "Formatter")
  @js.native
  class Formatter () extends AbstractFormatter {
    
    var escapeXml: js.Any = js.native
    
    var formatFailure: js.Any = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/checkstyleFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/checkstyleFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    @scala.inline
    def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
