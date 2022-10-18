package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemContentType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "ItemContentType")
@js.native
object ItemContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemContentType & Double] = js.native
  
  @js.native
  sealed trait Base64Encoded
    extends StObject
       with ItemContentType
  /* 1 */ val Base64Encoded: typings.vsoNodeApi.interfacesTfvcInterfacesMod.ItemContentType.Base64Encoded & Double = js.native
  
  @js.native
  sealed trait RawText
    extends StObject
       with ItemContentType
  /* 0 */ val RawText: typings.vsoNodeApi.interfacesTfvcInterfacesMod.ItemContentType.RawText & Double = js.native
}
