package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SATransport extends StObject
@JSGlobal("SATransport")
@js.native
object SATransport extends StObject {
  
  @js.native
  sealed trait TRANSPORT_BLE
    extends StObject
       with SATransport
  
  @js.native
  sealed trait TRANSPORT_BT
    extends StObject
       with SATransport
  
  @js.native
  sealed trait TRANSPORT_MOBILE
    extends StObject
       with SATransport
  
  @js.native
  sealed trait TRANSPORT_USB
    extends StObject
       with SATransport
  
  @js.native
  sealed trait TRANSPORT_WIFI
    extends StObject
       with SATransport
}
