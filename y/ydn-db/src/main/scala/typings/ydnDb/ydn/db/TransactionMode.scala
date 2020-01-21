package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionMode extends js.Object

@JSGlobal("ydn.db.TransactionMode")
@js.native
object TransactionMode extends js.Object {
  @js.native
  sealed trait readonly extends TransactionMode
  
  @js.native
  sealed trait readwrite extends TransactionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionMode with Double] = js.native
  /* 0 */ @js.native
  object readonly extends TopLevel[readonly with Double]
  
  /* 1 */ @js.native
  object readwrite extends TopLevel[readwrite with Double]
  
}

