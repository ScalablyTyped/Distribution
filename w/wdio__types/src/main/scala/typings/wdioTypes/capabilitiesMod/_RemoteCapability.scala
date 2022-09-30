package typings.wdioTypes.capabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RemoteCapability extends StObject
object _RemoteCapability {
  
  inline def DesiredCapabilities(): typings.wdioTypes.capabilitiesMod.DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.wdioTypes.capabilitiesMod.DesiredCapabilities]
  }
  
  inline def W3CCapabilities(alwaysMatch: Capabilities, firstMatch: js.Array[Capabilities]): typings.wdioTypes.capabilitiesMod.W3CCapabilities = {
    val __obj = js.Dynamic.literal(alwaysMatch = alwaysMatch.asInstanceOf[js.Any], firstMatch = firstMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wdioTypes.capabilitiesMod.W3CCapabilities]
  }
}
