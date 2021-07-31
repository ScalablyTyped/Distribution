package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyPrefetchOptions extends StObject
@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends StObject {
  
  @js.native
  sealed trait basicProperties
    extends StObject
       with PropertyPrefetchOptions
  
  @js.native
  sealed trait documentProperties
    extends StObject
       with PropertyPrefetchOptions
  
  @js.native
  sealed trait imageProperties
    extends StObject
       with PropertyPrefetchOptions
  
  @js.native
  sealed trait musicProperties
    extends StObject
       with PropertyPrefetchOptions
  
  @js.native
  sealed trait none
    extends StObject
       with PropertyPrefetchOptions
  
  @js.native
  sealed trait videoProperties
    extends StObject
       with PropertyPrefetchOptions
}
