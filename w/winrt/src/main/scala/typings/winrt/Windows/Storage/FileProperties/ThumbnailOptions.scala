package typings.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
