package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatedOperation
  extends StObject
     with IActivatedOperation
object ActivatedOperation {
  
  inline def apply(getDeferral: () => ActivatedDeferral): ActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ActivatedOperation]
  }
}
