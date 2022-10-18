package typings.webdriverManager

import typings.webdriverManager.builtLibBinariesMod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibFilesDownloadedBinaryMod {
  
  @JSImport("webdriver-manager/built/lib/files/downloaded_binary", "DownloadedBinary")
  @js.native
  open class DownloadedBinary protected () extends Binary {
    def this(binary: Binary) = this()
    
    var binary: Binary = js.native
    
    var versions: js.Array[String] = js.native
  }
}
