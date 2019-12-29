package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NameCollisionOption extends js.Object

@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists extends NameCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends NameCollisionOption
  
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

