package typings.webdriverManager

import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appiumMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium")
  @js.native
  class Appium () extends Binary {
    def this(alternateCDN: String) = this()
  }
  /* static members */
  object Appium {
    
    @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/appium", "Appium.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
