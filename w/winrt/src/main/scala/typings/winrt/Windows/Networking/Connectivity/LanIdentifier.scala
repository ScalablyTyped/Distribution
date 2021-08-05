package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanIdentifier
  extends StObject
     with ILanIdentifier
object LanIdentifier {
  
  inline def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): LanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifier]
  }
}
