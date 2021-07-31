package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintManager
  extends StObject
     with IPrintManager
object PrintManager {
  
  @scala.inline
  def apply(onprinttaskrequested: js.Any): PrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintManager]
  }
}
