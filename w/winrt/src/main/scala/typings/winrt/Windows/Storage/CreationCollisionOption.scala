package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CreationCollisionOption extends js.Object

@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends CreationCollisionOption
  
  @js.native
  sealed trait openIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait replaceExisting extends CreationCollisionOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CreationCollisionOption with Double] = js.native
  /* 2 */ @js.native
  object failIfExists extends TopLevel[failIfExists with Double]
  
  /* 0 */ @js.native
  object generateUniqueName extends TopLevel[generateUniqueName with Double]
  
  /* 3 */ @js.native
  object openIfExists extends TopLevel[openIfExists with Double]
  
  /* 1 */ @js.native
  object replaceExisting extends TopLevel[replaceExisting with Double]
  
}

