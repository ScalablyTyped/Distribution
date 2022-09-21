package typings.webscreensWindowPlacement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extend window.Screen
// This should ideally extend ScreenDetailsEventHandlers also, but TS doesn't like it.
@js.native
trait ScreenDetailed
  extends StObject
     with Screen {
  
  var devicePixelRatio: Double = js.native
  
  var isInternal: Boolean = js.native
  
  var isPrimary: Boolean = js.native
  
  var label: String = js.native
  
  var left: Double = js.native
  
  var top: Double = js.native
}
