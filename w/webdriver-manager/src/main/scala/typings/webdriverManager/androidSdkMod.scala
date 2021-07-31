package typings.webdriverManager

import org.scalablytyped.runtime.NumberDictionary
import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidSdkMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK")
  @js.native
  class AndroidSDK () extends Binary {
    def this(alternateCDN: String) = this()
    
    def url(ostype: String): String = js.native
  }
  /* static members */
  object AndroidSDK {
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.DEFAULT_API_LEVELS")
    @js.native
    def DEFAULT_API_LEVELS: String = js.native
    @scala.inline
    def DEFAULT_API_LEVELS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_API_LEVELS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.DEFAULT_ARCHITECTURES")
    @js.native
    def DEFAULT_ARCHITECTURES: String = js.native
    @scala.inline
    def DEFAULT_ARCHITECTURES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ARCHITECTURES")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.DEFAULT_PLATFORMS")
    @js.native
    def DEFAULT_PLATFORMS: String = js.native
    @scala.inline
    def DEFAULT_PLATFORMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PLATFORMS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.VERSIONS")
    @js.native
    def VERSIONS: NumberDictionary[String] = js.native
    @scala.inline
    def VERSIONS_=(x: NumberDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    @scala.inline
    def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.os")
    @js.native
    def os: js.Array[OS] = js.native
    @scala.inline
    def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries/android_sdk", "AndroidSDK.versionDefault")
    @js.native
    def versionDefault: String = js.native
    @scala.inline
    def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
