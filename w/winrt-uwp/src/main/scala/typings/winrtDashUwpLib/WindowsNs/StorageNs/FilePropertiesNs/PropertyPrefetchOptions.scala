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
  
  val basicProperties: basicProperties with java.lang.String = js.native
  val documentProperties: documentProperties with java.lang.String = js.native
  val imageProperties: imageProperties with java.lang.String = js.native
  val musicProperties: musicProperties with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val videoProperties: videoProperties with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions with java.lang.String
  ] = js.native
}

