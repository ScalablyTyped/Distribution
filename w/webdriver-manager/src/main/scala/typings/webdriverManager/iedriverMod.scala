package typings.webdriverManager

import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iedriverMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver")
  @js.native
  class IEDriver () extends Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object IEDriver {
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver.isDefault32")
    @js.native
    def isDefault32: Boolean = js.native
    @scala.inline
    def isDefault32_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault32")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver.isDefault64")
    @js.native
    def isDefault64: Boolean = js.native
    @scala.inline
    def isDefault64_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault64")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver.os")
    @js.native
    def os: js.Array[OS] = js.native
    @scala.inline
    def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/iedriver", "IEDriver.versionDefault")
    @js.native
    def versionDefault: String = js.native
    @scala.inline
    def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
