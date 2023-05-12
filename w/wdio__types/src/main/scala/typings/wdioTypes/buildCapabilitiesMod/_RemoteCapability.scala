package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RemoteCapability extends StObject
object _RemoteCapability {
  
  inline def DesiredCapabilities(Object: js.Object): typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.asInstanceOf[typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities]
  }
  
  inline def W3CCapabilities(alwaysMatch: Capabilities, firstMatch: js.Array[Capabilities]): typings.wdioTypes.buildCapabilitiesMod.W3CCapabilities = {
    val __obj = js.Dynamic.literal(alwaysMatch = alwaysMatch.asInstanceOf[js.Any], firstMatch = firstMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wdioTypes.buildCapabilitiesMod.W3CCapabilities]
  }
}
