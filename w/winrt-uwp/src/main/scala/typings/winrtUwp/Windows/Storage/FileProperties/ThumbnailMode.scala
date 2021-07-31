package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThumbnailMode extends StObject
/** Describes the purpose of the thumbnail to determine how to adjust the thumbnail image to retrieve. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends StObject {
  
  /** To display previews of document files. */
  @js.native
  sealed trait documentsView
    extends StObject
       with ThumbnailMode
  
  /** To display previews of files (or other items) in a list. */
  @js.native
  sealed trait listView
    extends StObject
       with ThumbnailMode
  
  /** To display previews of music files. */
  @js.native
  sealed trait musicView
    extends StObject
       with ThumbnailMode
  
  /** To display previews of picture files. */
  @js.native
  sealed trait picturesView
    extends StObject
       with ThumbnailMode
  
  /** To display a preview of any single item (like a file, folder, or file group). */
  @js.native
  sealed trait singleItem
    extends StObject
       with ThumbnailMode
  
  /** To display previews of video files. */
  @js.native
  sealed trait videosView
    extends StObject
       with ThumbnailMode
}
