package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app activation operation. */
trait ActivatedOperation extends StObject {
  
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  def getDeferral(): ActivatedDeferral
}
object ActivatedOperation {
  
  @scala.inline
  def apply(getDeferral: () => ActivatedDeferral): ActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ActivatedOperation]
  }
  
  @scala.inline
  implicit class ActivatedOperationMutableBuilder[Self <: ActivatedOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => ActivatedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
