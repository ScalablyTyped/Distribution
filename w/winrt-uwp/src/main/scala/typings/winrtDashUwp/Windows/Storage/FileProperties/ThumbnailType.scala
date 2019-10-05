package typings.winrtDashUwp.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailType extends js.Object

/** Indicates whether the thumbnail is an icon or an image. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends js.Object {
  /** The thumbnail is an icon. */
  @js.native
  sealed trait icon extends ThumbnailType
  
  /** The thumbnail is an image. */
  @js.native
  sealed trait image extends ThumbnailType
  
  /* 1 */ val icon: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
  /* 0 */ val image: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailType with Double] = js.native
}

