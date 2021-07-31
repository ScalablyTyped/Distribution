package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIStatus extends StObject
@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends StObject {
  
  @js.native
  sealed trait complete
    extends StObject
       with UIStatus
  
  @js.native
  sealed trait hidden
    extends StObject
       with UIStatus
  
  @js.native
  sealed trait unavailable
    extends StObject
       with UIStatus
  
  @js.native
  sealed trait visible
    extends StObject
       with UIStatus
}
