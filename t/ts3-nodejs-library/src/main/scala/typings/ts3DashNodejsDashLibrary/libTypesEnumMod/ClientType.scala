package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientType extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "ClientType")
@js.native
object ClientType extends js.Object {
  @js.native
  sealed trait Regular extends ClientType
  
  @js.native
  sealed trait ServerQuery extends ClientType
  
  /* 0 */ val Regular: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.Regular with Double = js.native
  /* 1 */ val ServerQuery: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.ServerQuery with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType with Double] = js.native
}

