package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoOrientation extends StObject
@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends StObject {
  
  @js.native
  sealed trait flipHorizontal
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait flipVertical
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait normal
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait rotate180
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait rotate270
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait rotate90
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait transpose
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait transverse
    extends StObject
       with PhotoOrientation
  
  @js.native
  sealed trait unspecified
    extends StObject
       with PhotoOrientation
}
