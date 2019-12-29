package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailType extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends js.Object {
  @js.native
  sealed trait icon extends ThumbnailType
  
  @js.native
  sealed trait image extends ThumbnailType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailType with Double] = js.native
  /* 1 */ @js.native
  object icon extends TopLevel[icon with Double]
  
  /* 0 */ @js.native
  object image extends TopLevel[image with Double]
  
}

