package typings.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyPrefetchOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends js.Object {
  @js.native
  sealed trait basicProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait documentProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait imageProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait musicProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait none extends PropertyPrefetchOptions
  
  @js.native
  sealed trait videoProperties extends PropertyPrefetchOptions
  
  /* 5 */ val basicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties with Double = js.native
  /* 4 */ val documentProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties with Double = js.native
  /* 3 */ val imageProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties with Double = js.native
  /* 1 */ val musicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.none with Double = js.native
  /* 2 */ val videoProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyPrefetchOptions with Double] = js.native
}

