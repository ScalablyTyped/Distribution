package typings.webdriverManager

import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geckoDriverMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver")
  @js.native
  class GeckoDriver () extends Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object GeckoDriver {
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    @scala.inline
    def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver.os")
    @js.native
    def os: js.Array[OS] = js.native
    @scala.inline
    def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver.suffixes")
    @js.native
    def suffixes: js.Any = js.native
    @scala.inline
    def suffixes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffixes")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/gecko_driver", "GeckoDriver.versionDefault")
    @js.native
    def versionDefault: String = js.native
    @scala.inline
    def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
