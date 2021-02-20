package typings.webdriverManager

import org.scalablytyped.runtime.StringDictionary
import typings.webdriverManager.configSourceMod.ConfigSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
  @js.native
  abstract class Binary () extends StObject {
    def this(opt_alternativeCdn: String) = this()
    
    var alternativeDownloadUrl: String = js.native
    
    var cdn: String = js.native
    
    var configSource: ConfigSource = js.native
    
    /**
      * @param ostype The operating system.
      * @returns The file name for the executable.
      */
    def executableFilename(): String = js.native
    
    def executableSuffix(): String = js.native
    
    def filename(): String = js.native
    
    /**
      * Gets the url to download the file set by the version. This will use the XML if available.
      * If not, it will download from an existing url.
      *
      * @param {string} version The version we are looking for. This could also be 'latest'.
      */
    def getUrl(): js.Promise[BinaryUrl] = js.native
    def getUrl(version: String): js.Promise[BinaryUrl] = js.native
    
    /**
      * Gets the list of available versions available based on the xml. If no XML exists, return an
      * empty list.
      */
    def getVersionList(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Gets the id of the binary.
      */
    def id(): String = js.native
    
    var name: String = js.native
    
    var osarch: String = js.native
    
    var ostype: String = js.native
    
    def prefix(): String = js.native
    
    /**
      * Delete an instance of this binary from the file system
      */
    def remove(filename: String): Unit = js.native
    
    def suffix(): String = js.native
    
    def version(): String = js.native
    
    var versionCustom: String = js.native
    
    var versionDefault: String = js.native
    
    /**
      * @param ostype The operating system.
      * @returns The file name for the file inside the downloaded zip file
      */
    def zipContentName(): String = js.native
  }
  /* static members */
  object Binary {
    
    @JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries/binary", "Binary.os")
    @js.native
    def os: js.Array[OS] = js.native
    @scala.inline
    def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait OS extends StObject
  @JSImport("webdriver-manager/built/lib/binaries/binary", "OS")
  @js.native
  object OS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OS with Double] = js.native
    
    @js.native
    sealed trait Darwin extends OS
    /* 2 */ val Darwin: typings.webdriverManager.binaryMod.OS.Darwin with Double = js.native
    
    @js.native
    sealed trait Linux extends OS
    /* 1 */ val Linux: typings.webdriverManager.binaryMod.OS.Linux with Double = js.native
    
    @js.native
    sealed trait Windows_NT extends OS
    /* 0 */ val Windows_NT: typings.webdriverManager.binaryMod.OS.Windows_NT with Double = js.native
  }
  
  type BinaryMap[T /* <: Binary */] = StringDictionary[T]
  
  @js.native
  trait BinaryUrl extends StObject {
    
    var url: String = js.native
    
    var version: String = js.native
  }
  object BinaryUrl {
    
    @scala.inline
    def apply(url: String, version: String): BinaryUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryUrl]
    }
    
    @scala.inline
    implicit class BinaryUrlMutableBuilder[Self <: BinaryUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
