package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  @js.native
  sealed trait file extends StorageItemTypes
  
  @js.native
  sealed trait folder extends StorageItemTypes
  
  @js.native
  sealed trait none extends StorageItemTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageItemTypes with Double] = js.native
  /* 1 */ @js.native
  object file extends TopLevel[file with Double]
  
  /* 2 */ @js.native
  object folder extends TopLevel[folder with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

