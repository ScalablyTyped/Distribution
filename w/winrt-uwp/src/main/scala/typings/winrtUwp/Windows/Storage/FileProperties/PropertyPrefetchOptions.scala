package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyPrefetchOptions extends StObject
/** Indicates a system-defined group of file properties. */
@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends StObject {
  
  /** A group of basic properties that can be access through a BasicProperties object. */
  @js.native
  sealed trait basicProperties
    extends StObject
       with PropertyPrefetchOptions
  
  /** A group of document-related properties that can be access through a DocumentProperties object. */
  @js.native
  sealed trait documentProperties
    extends StObject
       with PropertyPrefetchOptions
  
  /** A group of image-related properties that can be access through a ImageProperties object. */
  @js.native
  sealed trait imageProperties
    extends StObject
       with PropertyPrefetchOptions
  
  /** A group of music-related properties that can be access through a MusicProperties object. */
  @js.native
  sealed trait musicProperties
    extends StObject
       with PropertyPrefetchOptions
  
  /** No specific, system-defined property group. */
  @js.native
  sealed trait none
    extends StObject
       with PropertyPrefetchOptions
  
  /** A group of video-related properties that can be access through a VideoProperties object. */
  @js.native
  sealed trait videoProperties
    extends StObject
       with PropertyPrefetchOptions
}
