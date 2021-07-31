package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnclosureLocation
  extends StObject
     with IEnclosureLocation
object EnclosureLocation {
  
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): EnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosureLocation]
  }
}
