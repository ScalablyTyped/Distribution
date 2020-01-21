package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailType with Double] = js.native
  /* 1 */ @js.native
  object icon extends TopLevel[icon with Double]
  
  /* 0 */ @js.native
  object image extends TopLevel[image with Double]
  
}

