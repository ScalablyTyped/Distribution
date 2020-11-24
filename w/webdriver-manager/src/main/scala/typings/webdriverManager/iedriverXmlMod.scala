package typings.webdriverManager

import typings.webdriverManager.configSourceMod.XmlConfigSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/iedriver_xml", JSImport.Namespace)
@js.native
object iedriverXmlMod extends js.Object {
  
  @js.native
  class IEDriverXml () extends XmlConfigSource {
    
    /* private */ def getLatestIEDriverVersion(): js.Any = js.native
    
    /* private */ def getSpecificIEDriverVersion(inputVersion: js.Any): js.Any = js.native
  }
}
