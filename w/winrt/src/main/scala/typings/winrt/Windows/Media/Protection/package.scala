package typings.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Protection {
  
  type ComponentLoadFailedEventHandler = js.Function2[
    /* sender */ typings.winrt.Windows.Media.Protection.MediaProtectionManager, 
    /* e */ typings.winrt.Windows.Media.Protection.ComponentLoadFailedEventArgs, 
    scala.Unit
  ]
  
  type RebootNeededEventHandler = js.Function1[
    /* sender */ typings.winrt.Windows.Media.Protection.MediaProtectionManager, 
    scala.Unit
  ]
  
  type ServiceRequestedEventHandler = js.Function2[
    /* sender */ typings.winrt.Windows.Media.Protection.MediaProtectionManager, 
    /* e */ typings.winrt.Windows.Media.Protection.ServiceRequestedEventArgs, 
    scala.Unit
  ]
}
