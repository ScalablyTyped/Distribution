package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailMode extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends js.Object {
  @js.native
  sealed trait documentsView extends ThumbnailMode
  
  @js.native
  sealed trait listView extends ThumbnailMode
  
  @js.native
  sealed trait musicView extends ThumbnailMode
  
  @js.native
  sealed trait picturesView extends ThumbnailMode
  
  @js.native
  sealed trait singleItem extends ThumbnailMode
  
  @js.native
  sealed trait videosView extends ThumbnailMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailMode with Double] = js.native
  /* 3 */ @js.native
  object documentsView extends TopLevel[documentsView with Double]
  
  /* 4 */ @js.native
  object listView extends TopLevel[listView with Double]
  
  /* 2 */ @js.native
  object musicView extends TopLevel[musicView with Double]
  
  /* 0 */ @js.native
  object picturesView extends TopLevel[picturesView with Double]
  
  /* 5 */ @js.native
  object singleItem extends TopLevel[singleItem with Double]
  
  /* 1 */ @js.native
  object videosView extends TopLevel[videosView with Double]
  
}

