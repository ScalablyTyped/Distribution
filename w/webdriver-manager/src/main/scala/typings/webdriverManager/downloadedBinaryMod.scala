package typings.webdriverManager

import typings.webdriverManager.mod.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/files/downloaded_binary", JSImport.Namespace)
@js.native
object downloadedBinaryMod extends js.Object {
  
  @js.native
  class DownloadedBinary protected () extends Binary {
    def this(binary: Binary) = this()
    
    var binary: Binary = js.native
    
    var versions: js.Array[String] = js.native
  }
}
