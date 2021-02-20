package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThumbnailMode extends StObject
@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends StObject {
  
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
}
