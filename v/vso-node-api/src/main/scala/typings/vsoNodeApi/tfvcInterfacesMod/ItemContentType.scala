package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemContentType extends js.Object
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "ItemContentType")
@js.native
object ItemContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemContentType with Double] = js.native
  
  @js.native
  sealed trait Base64Encoded extends ItemContentType
  /* 1 */ @js.native
  object Base64Encoded extends TopLevel[Base64Encoded with Double]
  
  @js.native
  sealed trait RawText extends ItemContentType
  /* 0 */ @js.native
  object RawText extends TopLevel[RawText with Double]
}
