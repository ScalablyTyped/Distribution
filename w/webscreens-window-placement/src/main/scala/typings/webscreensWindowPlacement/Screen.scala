package typings.webscreensWindowPlacement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// enhance window.Screen with isExtended property
// enhance window.Screen with event handling
@js.native
trait Screen
  extends StObject
     with ScreenEventHandlers {
  
  var isExtended: Boolean = js.native
}
