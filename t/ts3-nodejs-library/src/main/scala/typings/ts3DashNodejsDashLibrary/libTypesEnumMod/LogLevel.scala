package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  /* 3 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 4 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 2 */ @js.native
  object WARNING extends TopLevel[WARNING with Double]
  
}

