package typings.tizenAccessory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SATransport extends js.Object
@JSGlobal("SATransport")
@js.native
object SATransport extends js.Object {
  
  @js.native
  sealed trait TRANSPORT_BLE extends SATransport
  
  @js.native
  sealed trait TRANSPORT_BT extends SATransport
  
  @js.native
  sealed trait TRANSPORT_MOBILE extends SATransport
  
  @js.native
  sealed trait TRANSPORT_USB extends SATransport
  
  @js.native
  sealed trait TRANSPORT_WIFI extends SATransport
}
