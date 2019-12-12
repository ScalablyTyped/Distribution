package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.Regular
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.ServerQuery
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType with Double] = js.native
  /* 0 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
  /* 1 */ @js.native
  object ServerQuery extends TopLevel[ServerQuery with Double]
  
}

