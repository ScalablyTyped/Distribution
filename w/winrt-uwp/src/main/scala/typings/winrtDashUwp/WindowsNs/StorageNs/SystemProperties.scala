package typings.winrtDashUwp.WindowsNs.StorageNs

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
  var audio: SystemAudioProperties = js.native
  /** Gets the name of the System.Author property (one of the Windows file properties). */
  var author: String = js.native
  /** Gets the name of the System.Comment property (one of the Windows file properties). */
  var comment: String = js.native
  /** Gets an object that provides the indexing names of Windows system file properties for System.GPS. */
  var gps: SystemGPSProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Image. */
  var image: SystemImageProperties = js.native
  /** Gets the name of the System.ItemNameDisplay property (one of the Windows file properties). */
  var itemNameDisplay: String = js.native
  /** Gets the name of the System.Keywords property (one of the Windows file properties). */
  var keywords: String = js.native
  /** Gets an object that provides the indexing names of system media file properties such as System.Duration . */
  var media: SystemMediaProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Music. */
  var music: SystemMusicProperties = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Photo. */
  var photo: SystemPhotoProperties = js.native
  /** Gets the name of the System.Rating property (one of the Windows file properties). */
  var rating: String = js.native
  /** Gets the name of the System.Title property (one of the Windows file properties). */
  var title: String = js.native
  /** Gets an object that provides the indexing names of Windows file properties for System.Video. */
  var video: SystemVideoProperties = js.native
}

