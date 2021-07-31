package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThumbnailOptions extends StObject
@JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
@js.native
object ThumbnailOptions extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with ThumbnailOptions
  
  @js.native
  sealed trait resizeThumbnail
    extends StObject
       with ThumbnailOptions
  
  @js.native
  sealed trait returnOnlyIfCached
    extends StObject
       with ThumbnailOptions
  
  @js.native
  sealed trait useCurrentScale
    extends StObject
       with ThumbnailOptions
}
