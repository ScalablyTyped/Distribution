package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemContentType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "ItemContentType")
@js.native
object ItemContentType extends js.Object {
  @js.native
  sealed trait Base64Encoded extends ItemContentType
  
  @js.native
  sealed trait RawText extends ItemContentType
  
  /* 1 */ val Base64Encoded: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.ItemContentType.Base64Encoded with Double = js.native
  /* 0 */ val RawText: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.ItemContentType.RawText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemContentType with Double] = js.native
}

