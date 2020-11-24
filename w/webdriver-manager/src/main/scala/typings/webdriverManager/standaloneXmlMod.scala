package typings.webdriverManager

import typings.webdriverManager.configSourceMod.XmlConfigSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/standalone_xml", JSImport.Namespace)
@js.native
object standaloneXmlMod extends js.Object {
  
  @js.native
  class StandaloneXml () extends XmlConfigSource {
    
    /* private */ def getLatestStandaloneVersion(): js.Any = js.native
    
    /* private */ def getSpecificStandaloneVersion(inputVersion: js.Any): js.Any = js.native
  }
}
