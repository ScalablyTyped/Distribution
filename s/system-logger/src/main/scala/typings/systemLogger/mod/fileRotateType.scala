package typings.systemLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fileRotateType extends js.Object

@JSImport("system-logger", "fileRotateType")
@js.native
object fileRotateType extends js.Object {
  @js.native
  sealed trait daily extends fileRotateType
  
  @js.native
  sealed trait hourly extends fileRotateType
  
  @js.native
  sealed trait minutely extends fileRotateType
  
  @js.native
  sealed trait monthly extends fileRotateType
  
  @js.native
  sealed trait weekly extends fileRotateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[fileRotateType with Double] = js.native
  /* 2 */ @js.native
  object daily extends TopLevel[daily with Double]
  
  /* 3 */ @js.native
  object hourly extends TopLevel[hourly with Double]
  
  /* 4 */ @js.native
  object minutely extends TopLevel[minutely with Double]
  
  /* 0 */ @js.native
  object monthly extends TopLevel[monthly with Double]
  
  /* 1 */ @js.native
  object weekly extends TopLevel[weekly with Double]
  
}

