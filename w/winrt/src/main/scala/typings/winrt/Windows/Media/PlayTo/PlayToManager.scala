package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToManager
  extends StObject
     with IPlayToManager
object PlayToManager {
  
  inline def apply(defaultSourceSelection: Boolean, onsourcerequested: js.Any, onsourceselected: js.Any): PlayToManager = {
    val __obj = js.Dynamic.literal(defaultSourceSelection = defaultSourceSelection.asInstanceOf[js.Any], onsourcerequested = onsourcerequested.asInstanceOf[js.Any], onsourceselected = onsourceselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToManager]
  }
}
