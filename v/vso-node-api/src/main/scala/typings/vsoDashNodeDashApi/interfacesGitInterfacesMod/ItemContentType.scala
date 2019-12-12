package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.ItemContentType.Base64Encoded
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.ItemContentType.RawText
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemContentType with Double] = js.native
  /* 1 */ @js.native
  object Base64Encoded extends TopLevel[Base64Encoded with Double]
  
  /* 0 */ @js.native
  object RawText extends TopLevel[RawText with Double]
  
}

