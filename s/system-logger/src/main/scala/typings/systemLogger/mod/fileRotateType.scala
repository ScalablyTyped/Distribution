package typings.systemLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait fileRotateType extends js.Object
@JSImport("system-logger", "fileRotateType")
@js.native
object fileRotateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[fileRotateType with Double] = js.native
  
  @js.native
  sealed trait daily extends fileRotateType
  /* 2 */ @js.native
  object daily extends TopLevel[daily with Double]
  
  @js.native
  sealed trait hourly extends fileRotateType
  /* 3 */ @js.native
  object hourly extends TopLevel[hourly with Double]
  
  @js.native
  sealed trait minutely extends fileRotateType
  /* 4 */ @js.native
  object minutely extends TopLevel[minutely with Double]
  
  @js.native
  sealed trait monthly extends fileRotateType
  /* 0 */ @js.native
  object monthly extends TopLevel[monthly with Double]
  
  @js.native
  sealed trait weekly extends fileRotateType
  /* 1 */ @js.native
  object weekly extends TopLevel[weekly with Double]
}
