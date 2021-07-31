package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreProcessEventsOption extends StObject
@JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
@js.native
object CoreProcessEventsOption extends StObject {
  
  @js.native
  sealed trait processAllIfPresent
    extends StObject
       with CoreProcessEventsOption
  
  @js.native
  sealed trait processOneAndAllPending
    extends StObject
       with CoreProcessEventsOption
  
  @js.native
  sealed trait processOneIfPresent
    extends StObject
       with CoreProcessEventsOption
  
  @js.native
  sealed trait processUntilQuit
    extends StObject
       with CoreProcessEventsOption
}
