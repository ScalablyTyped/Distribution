package typings.winrtDashUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.none
import typings.winrtDashUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyPrefetchOptions with Double] = js.native
  /* 5 */ @js.native
  object basicProperties extends TopLevel[basicProperties with Double]
  
  /* 4 */ @js.native
  object documentProperties extends TopLevel[documentProperties with Double]
  
  /* 3 */ @js.native
  object imageProperties extends TopLevel[imageProperties with Double]
  
  /* 1 */ @js.native
  object musicProperties extends TopLevel[musicProperties with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object videoProperties extends TopLevel[videoProperties with Double]
  
}

