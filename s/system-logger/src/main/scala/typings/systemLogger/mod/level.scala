package typings.systemLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait level extends js.Object
@JSImport("system-logger", "level")
@js.native
object level extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[level with Double] = js.native
  
  @js.native
  sealed trait debug extends level
  /* 4 */ @js.native
  object debug extends TopLevel[debug with Double]
  
  @js.native
  sealed trait error extends level
  /* 0 */ @js.native
  object error extends TopLevel[error with Double]
  
  @js.native
  sealed trait info extends level
  /* 2 */ @js.native
  object info extends TopLevel[info with Double]
  
  @js.native
  sealed trait silly extends level
  /* 5 */ @js.native
  object silly extends TopLevel[silly with Double]
  
  @js.native
  sealed trait verbose extends level
  /* 3 */ @js.native
  object verbose extends TopLevel[verbose with Double]
  
  @js.native
  sealed trait warn extends level
  /* 1 */ @js.native
  object warn extends TopLevel[warn with Double]
}
