package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a Uri launch. */
@js.native
trait LaunchUriResult extends StObject {
  
  /** Gets the result of the Uri launch. */
  var result: ValueSet = js.native
  
  /** Gets the status of the Uri launch. */
  var status: LaunchUriStatus = js.native
}
object LaunchUriResult {
  
  @scala.inline
  def apply(result: ValueSet, status: LaunchUriStatus): LaunchUriResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchUriResult]
  }
  
  @scala.inline
  implicit class LaunchUriResultMutableBuilder[Self <: LaunchUriResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: ValueSet): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: LaunchUriStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
