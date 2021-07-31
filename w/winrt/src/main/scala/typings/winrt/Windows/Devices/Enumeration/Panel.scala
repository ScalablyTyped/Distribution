package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Panel extends StObject
@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends StObject {
  
  @js.native
  sealed trait back
    extends StObject
       with Panel
  
  @js.native
  sealed trait bottom
    extends StObject
       with Panel
  
  @js.native
  sealed trait front
    extends StObject
       with Panel
  
  @js.native
  sealed trait left
    extends StObject
       with Panel
  
  @js.native
  sealed trait right
    extends StObject
       with Panel
  
  @js.native
  sealed trait top
    extends StObject
       with Panel
  
  @js.native
  sealed trait unknown
    extends StObject
       with Panel
}
