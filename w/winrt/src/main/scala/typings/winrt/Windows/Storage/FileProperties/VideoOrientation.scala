package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoOrientation extends StObject
@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends StObject {
  
  @js.native
  sealed trait normal
    extends StObject
       with VideoOrientation
  
  @js.native
  sealed trait rotate180
    extends StObject
       with VideoOrientation
  
  @js.native
  sealed trait rotate270
    extends StObject
       with VideoOrientation
  
  @js.native
  sealed trait rotate90
    extends StObject
       with VideoOrientation
}
