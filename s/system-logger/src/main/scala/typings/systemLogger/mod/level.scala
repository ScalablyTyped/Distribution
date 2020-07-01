package typings.systemLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait level extends js.Object

@JSImport("system-logger", "level")
@js.native
object level extends js.Object {
  @js.native
  sealed trait debug extends level
  
  @js.native
  sealed trait error extends level
  
  @js.native
  sealed trait info extends level
  
  @js.native
  sealed trait silly extends level
  
  @js.native
  sealed trait verbose extends level
  
  @js.native
  sealed trait warn extends level
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[level with Double] = js.native
  /* 4 */ @js.native
  object debug extends TopLevel[debug with Double]
  
  /* 0 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 2 */ @js.native
  object info extends TopLevel[info with Double]
  
  /* 5 */ @js.native
  object silly extends TopLevel[silly with Double]
  
  /* 3 */ @js.native
  object verbose extends TopLevel[verbose with Double]
  
  /* 1 */ @js.native
  object warn extends TopLevel[warn with Double]
  
}

