package typings.webdriverManager

import typings.webdriverManager.builtLibBinariesBinaryMod.Binary
import typings.webdriverManager.builtLibBinariesBinaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibBinariesStandaloneMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone")
  @js.native
  open class Standalone () extends Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object Standalone {
    
    @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/standalone", "Standalone.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
