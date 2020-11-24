package typings.webdriverManager

import typings.webdriverManager.configSourceMod.XmlConfigSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/chrome_xml", JSImport.Namespace)
@js.native
object chromeXmlMod extends js.Object {
  
  def getValidSemver(version: String): String = js.native
  
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
}
