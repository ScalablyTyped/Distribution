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
  
}

