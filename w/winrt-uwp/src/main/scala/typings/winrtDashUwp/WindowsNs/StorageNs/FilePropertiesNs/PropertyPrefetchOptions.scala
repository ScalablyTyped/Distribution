package typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs

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
  sealed trait basicProperties extends PropertyPrefetchOptions
  
  /** A group of document-related properties that can be access through a DocumentProperties object. */
  @js.native
  sealed trait documentProperties extends PropertyPrefetchOptions
  
  /** A group of image-related properties that can be access through a ImageProperties object. */
  @js.native
  sealed trait imageProperties extends PropertyPrefetchOptions
  
  /** A group of music-related properties that can be access through a MusicProperties object. */
  @js.native
  sealed trait musicProperties extends PropertyPrefetchOptions
  
  /** No specific, system-defined property group. */
  @js.native
  sealed trait none extends PropertyPrefetchOptions
  
  /** A group of video-related properties that can be access through a VideoProperties object. */
  @js.native
  sealed trait videoProperties extends PropertyPrefetchOptions
  
  /* 5 */ val basicProperties: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.basicProperties with Double = js.native
  /* 4 */ val documentProperties: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.documentProperties with Double = js.native
  /* 3 */ val imageProperties: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.imageProperties with Double = js.native
  /* 1 */ val musicProperties: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.musicProperties with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.none with Double = js.native
  /* 2 */ val videoProperties: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions.videoProperties with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyPrefetchOptions with Double] = js.native
}

