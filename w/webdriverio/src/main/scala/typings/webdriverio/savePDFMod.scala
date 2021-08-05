package typings.webdriverio

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object savePDFMod {
  
  @JSImport("webdriverio/build/commands/browser/savePDF", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def default(
    filepath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.PDFPrintOptions */ js.Any
  ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
}
