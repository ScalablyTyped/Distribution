package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyPrefetchOptions extends js.Object

/** Indicates a system-defined group of file properties. */
@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends js.Object {
  /** A group of basic properties that can be access through a BasicProperties object. */
  @js.native
  sealed trait basicProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /** A group of document-related properties that can be access through a DocumentProperties object. */
  @js.native
  sealed trait documentProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /** A group of image-related properties that can be access through a ImageProperties object. */
  @js.native
  sealed trait imageProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /** A group of music-related properties that can be access through a MusicProperties object. */
  @js.native
  sealed trait musicProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /** No specific, system-defined property group. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /** A group of video-related properties that can be access through a VideoProperties object. */
  @js.native
  sealed trait videoProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  /* 5 */ val basicProperties: basicProperties with scala.Double = js.native
  /* 4 */ val documentProperties: documentProperties with scala.Double = js.native
  /* 3 */ val imageProperties: imageProperties with scala.Double = js.native
  /* 1 */ val musicProperties: musicProperties with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val videoProperties: videoProperties with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions with scala.Double
  ] = js.native
}

