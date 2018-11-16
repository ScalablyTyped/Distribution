package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemContentType extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "ItemContentType")
@js.native
object ItemContentType extends js.Object {
  @js.native
  sealed trait Base64Encoded
    extends vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.ItemContentType
  
  @js.native
  sealed trait RawText
    extends vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.ItemContentType
  
  /* 1 */ val Base64Encoded: Base64Encoded with scala.Double = js.native
  /* 0 */ val RawText: RawText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.ItemContentType with scala.Double
  ] = js.native
}

