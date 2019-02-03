package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides string values for indexing names of common Windows file properties such as System.Title , and also references helper objects that provide indexing names for properties of specific file types (for example video files). */
@JSGlobal("Windows.Storage.SystemProperties")
@js.native
abstract class SystemProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.SystemProperties")
@js.native
object SystemProperties extends js.Object {
  /** Gets an object that provides the indexing names of Windows file properties for System.Audio. */
  var audio: winrtDashUwpLib.WindowsNs.StorageNs.SystemAudioProperties = js.native
  /** Gets the name of the System.Author property (one of the Windows file properties). */
  var author: java.lang.String = js.native
  /** Gets the name of the System.Comment property (one of the Windows file properties). */
  var comment: java.lang.String = js.native
  /** Gets an object that provides the indexing names of Windows system file properties for System.GPS. */
  var gps: winrtDashUwpLib.WindowsNs.StorageNs.SystemGPSProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Image. */
  var image: winrtDashUwpLib.WindowsNs.StorageNs.SystemImageProperties = js.native
  /** Gets the name of the System.ItemNameDisplay property (one of the Windows file properties). */
  var itemNameDisplay: java.lang.String = js.native
  /** Gets the name of the System.Keywords property (one of the Windows file properties). */
  var keywords: java.lang.String = js.native
  /** Gets an object that provides the indexing names of system media file properties such as System.Duration . */
  var media: winrtDashUwpLib.WindowsNs.StorageNs.SystemMediaProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Music. */
  var music: winrtDashUwpLib.WindowsNs.StorageNs.SystemMusicProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Photo. */
  var photo: winrtDashUwpLib.WindowsNs.StorageNs.SystemPhotoProperties = js.native
  /** Gets the name of the System.Rating property (one of the Windows file properties). */
  var rating: java.lang.String = js.native
  /** Gets the name of the System.Title property (one of the Windows file properties). */
  var title: java.lang.String = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Video. */
  var video: winrtDashUwpLib.WindowsNs.StorageNs.SystemVideoProperties = js.native
}

