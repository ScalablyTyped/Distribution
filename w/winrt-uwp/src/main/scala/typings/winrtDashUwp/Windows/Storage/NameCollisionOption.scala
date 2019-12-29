package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NameCollisionOption extends js.Object

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you copy, move, or rename a file or folder. */
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  /** Raise an exception of type System.Exception if the file or folder already exists. */
  @js.native
  sealed trait failIfExists extends NameCollisionOption
  
  /** Automatically append a number to the base of the specified name if the file or folder already exists. */
  @js.native
  sealed trait generateUniqueName extends NameCollisionOption
  
  /** Replace the existing item if the file or folder already exists. */
  @js.native
  sealed trait replaceExisting extends NameCollisionOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NameCollisionOption with Double] = js.native
  /* 2 */ @js.native
  object failIfExists extends TopLevel[failIfExists with Double]
  
  /* 0 */ @js.native
  object generateUniqueName extends TopLevel[generateUniqueName with Double]
  
  /* 1 */ @js.native
  object replaceExisting extends TopLevel[replaceExisting with Double]
  
}

