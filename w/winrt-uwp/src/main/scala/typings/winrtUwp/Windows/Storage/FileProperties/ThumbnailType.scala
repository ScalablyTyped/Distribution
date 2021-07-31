package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThumbnailType extends StObject
/** Indicates whether the thumbnail is an icon or an image. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends StObject {
  
  /** The thumbnail is an icon. */
  @js.native
  sealed trait icon
    extends StObject
       with ThumbnailType
  
  /** The thumbnail is an image. */
  @js.native
  sealed trait image
    extends StObject
       with ThumbnailType
}
