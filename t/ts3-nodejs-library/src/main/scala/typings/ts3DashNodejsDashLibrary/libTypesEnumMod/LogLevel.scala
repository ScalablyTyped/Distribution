package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "LogLevel")
@js.native
object LogLevel extends js.Object {
  /** output that might help find a problem */
  @js.native
  sealed trait DEBUG extends LogLevel
  
  /** everything that is really bad */
  @js.native
  sealed trait ERROR extends LogLevel
  
  /** informational output */
  @js.native
  sealed trait INFO extends LogLevel
  
  /** everything that might be bad */
  @js.native
  sealed trait WARNING extends LogLevel
  
  /* 3 */ val DEBUG: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.DEBUG with Double = js.native
  /* 1 */ val ERROR: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.ERROR with Double = js.native
  /* 4 */ val INFO: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.INFO with Double = js.native
  /* 2 */ val WARNING: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.WARNING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
}

