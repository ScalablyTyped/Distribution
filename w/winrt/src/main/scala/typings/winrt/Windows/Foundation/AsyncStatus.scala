package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AsyncStatus extends StObject
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends StObject {
  
  @js.native
  sealed trait canceled
    extends StObject
       with AsyncStatus
  
  @js.native
  sealed trait completed
    extends StObject
       with AsyncStatus
  
  @js.native
  sealed trait error
    extends StObject
       with AsyncStatus
  
  @js.native
  sealed trait started
    extends StObject
       with AsyncStatus
}
