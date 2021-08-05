package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides string values for indexing names of common Windows file properties such as System.Title , and also references helper objects that provide indexing names for properties of specific file types (for example video files). */
@JSGlobal("Windows.Storage.SystemProperties")
@js.native
abstract class SystemProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.SystemProperties
object SystemProperties {
  
  @JSGlobal("Windows.Storage.SystemProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets an object that provides the indexing names of Windows file properties for System.Audio. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.audio")
  @js.native
  def audio: typings.winrtUwp.Windows.Storage.SystemAudioProperties = js.native
  inline def audio_=(x: typings.winrtUwp.Windows.Storage.SystemAudioProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audio")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.Author property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.author")
  @js.native
  def author: String = js.native
  inline def author_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("author")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.Comment property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.comment")
  @js.native
  def comment: String = js.native
  inline def comment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of Windows system file properties for System.GPS. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.gps")
  @js.native
  def gps: typings.winrtUwp.Windows.Storage.SystemGPSProperties = js.native
  inline def gps_=(x: typings.winrtUwp.Windows.Storage.SystemGPSProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gps")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of Windows file properties for System.Image. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.image")
  @js.native
  def image: typings.winrtUwp.Windows.Storage.SystemImageProperties = js.native
  inline def image_=(x: typings.winrtUwp.Windows.Storage.SystemImageProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.ItemNameDisplay property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.itemNameDisplay")
  @js.native
  def itemNameDisplay: String = js.native
  inline def itemNameDisplay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemNameDisplay")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.Keywords property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.keywords")
  @js.native
  def keywords: String = js.native
  inline def keywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keywords")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of system media file properties such as System.Duration . */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.media")
  @js.native
  def media: typings.winrtUwp.Windows.Storage.SystemMediaProperties = js.native
  inline def media_=(x: typings.winrtUwp.Windows.Storage.SystemMediaProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("media")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of Windows file properties for System.Music. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.music")
  @js.native
  def music: typings.winrtUwp.Windows.Storage.SystemMusicProperties = js.native
  inline def music_=(x: typings.winrtUwp.Windows.Storage.SystemMusicProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("music")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of Windows file properties for System.Photo. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.photo")
  @js.native
  def photo: typings.winrtUwp.Windows.Storage.SystemPhotoProperties = js.native
  inline def photo_=(x: typings.winrtUwp.Windows.Storage.SystemPhotoProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("photo")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.Rating property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.rating")
  @js.native
  def rating: String = js.native
  inline def rating_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rating")(x.asInstanceOf[js.Any])
  
  /** Gets the name of the System.Title property (one of the Windows file properties). */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.title")
  @js.native
  def title: String = js.native
  inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  
  /** Gets an object that provides the indexing names of Windows file properties for System.Video. */
  /* static member */
  @JSGlobal("Windows.Storage.SystemProperties.video")
  @js.native
  def video: typings.winrtUwp.Windows.Storage.SystemVideoProperties = js.native
  inline def video_=(x: typings.winrtUwp.Windows.Storage.SystemVideoProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("video")(x.asInstanceOf[js.Any])
}
