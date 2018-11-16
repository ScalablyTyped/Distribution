package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyPrefetchOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends js.Object {
  @js.native
  sealed trait basicProperties
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  @js.native
  sealed trait documentProperties
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  @js.native
  sealed trait imageProperties
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  @js.native
  sealed trait musicProperties
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  @js.native
  sealed trait videoProperties
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
  
  val basicProperties: basicProperties with java.lang.String = js.native
  val documentProperties: documentProperties with java.lang.String = js.native
  val imageProperties: imageProperties with java.lang.String = js.native
  val musicProperties: musicProperties with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val videoProperties: videoProperties with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions with java.lang.String
  ] = js.native
}

