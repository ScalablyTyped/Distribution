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
  
  /* 5 */ val basicProperties: basicProperties with scala.Double = js.native
  /* 4 */ val documentProperties: documentProperties with scala.Double = js.native
  /* 3 */ val imageProperties: imageProperties with scala.Double = js.native
  /* 1 */ val musicProperties: musicProperties with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val videoProperties: videoProperties with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions with scala.Double
  ] = js.native
}

