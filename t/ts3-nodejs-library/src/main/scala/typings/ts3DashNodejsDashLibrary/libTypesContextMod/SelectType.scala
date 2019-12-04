package typings.ts3DashNodejsDashLibrary.libTypesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

@JSImport("ts3-nodejs-library/lib/types/context", "SelectType")
@js.native
object SelectType extends js.Object {
  @js.native
  sealed trait NONE extends SelectType
  
  @js.native
  sealed trait PORT extends SelectType
  
  @js.native
  sealed trait SID extends SelectType
  
  /* 0 */ val NONE: typings.ts3DashNodejsDashLibrary.libTypesContextMod.SelectType.NONE with Double = js.native
  /* 2 */ val PORT: typings.ts3DashNodejsDashLibrary.libTypesContextMod.SelectType.PORT with Double = js.native
  /* 1 */ val SID: typings.ts3DashNodejsDashLibrary.libTypesContextMod.SelectType.SID with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
}

