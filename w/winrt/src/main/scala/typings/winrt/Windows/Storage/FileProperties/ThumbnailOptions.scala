package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
@js.native
object ThumbnailOptions extends js.Object {
  @js.native
  sealed trait none extends ThumbnailOptions
  
  @js.native
  sealed trait resizeThumbnail extends ThumbnailOptions
  
  @js.native
  sealed trait returnOnlyIfCached extends ThumbnailOptions
  
  @js.native
  sealed trait useCurrentScale extends ThumbnailOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object resizeThumbnail extends TopLevel[resizeThumbnail with Double]
  
  /* 1 */ @js.native
  object returnOnlyIfCached extends TopLevel[returnOnlyIfCached with Double]
  
  /* 3 */ @js.native
  object useCurrentScale extends TopLevel[useCurrentScale with Double]
  
}

