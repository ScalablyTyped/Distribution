package typings.webdriverManager

import typings.webdriverManager.configSourceMod.XmlConfigSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeXmlMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/chrome_xml", "ChromeXml")
  @js.native
  class ChromeXml () extends XmlConfigSource {
    
    /**
      * Gets the latest item from the XML.
      */
    /* private */ def getLatestChromeDriverVersion(): js.Any = js.native
    
    /**
      * Helper method, gets the ostype and gets the name used by the XML
      */
    def getOsTypeName(): String = js.native
    
    /**
      * Gets a specific item from the XML.
      */
    /* private */ def getSpecificChromeDriverVersion(inputVersion: js.Any): js.Any = js.native
    
    var maxVersion: String = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/binaries/chrome_xml", "getValidSemver")
  @js.native
  def getValidSemver(version: String): String = js.native
}
