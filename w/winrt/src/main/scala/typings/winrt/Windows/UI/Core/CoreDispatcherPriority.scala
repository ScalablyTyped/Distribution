package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreDispatcherPriority extends StObject
@JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
@js.native
object CoreDispatcherPriority extends StObject {
  
  @js.native
  sealed trait high
    extends StObject
       with CoreDispatcherPriority
  
  @js.native
  sealed trait low
    extends StObject
       with CoreDispatcherPriority
  
  @js.native
  sealed trait normal
    extends StObject
       with CoreDispatcherPriority
}
