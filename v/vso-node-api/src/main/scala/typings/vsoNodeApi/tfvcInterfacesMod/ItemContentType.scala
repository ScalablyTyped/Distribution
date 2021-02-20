package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemContentType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "ItemContentType")
@js.native
object ItemContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemContentType with Double] = js.native
  
  @js.native
  sealed trait Base64Encoded extends ItemContentType
  /* 1 */ val Base64Encoded: typings.vsoNodeApi.tfvcInterfacesMod.ItemContentType.Base64Encoded with Double = js.native
  
  @js.native
  sealed trait RawText extends ItemContentType
  /* 0 */ val RawText: typings.vsoNodeApi.tfvcInterfacesMod.ItemContentType.RawText with Double = js.native
}
