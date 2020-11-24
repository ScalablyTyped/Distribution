package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  /** output that might help find a problem */
  @js.native
  sealed trait DEBUG extends LogLevel
  /* 3 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /** everything that is really bad */
  @js.native
  sealed trait ERROR extends LogLevel
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /** informational output */
  @js.native
  sealed trait INFO extends LogLevel
  /* 4 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /** everything that might be bad */
  @js.native
  sealed trait WARNING extends LogLevel
  /* 2 */ @js.native
  object WARNING extends TopLevel[WARNING with Double]
}
