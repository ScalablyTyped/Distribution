package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressActionOptions
  extends StObject
     with ActionOptions {
  
  /**
    * `true` to replace the pressed keys with a placeholder when sending action logs to a reporter.
    */
  var confidential: js.UndefOr[Boolean] = js.undefined
}
object PressActionOptions {
  
  inline def apply(): PressActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressActionOptions]
  }
  
  extension [Self <: PressActionOptions](x: Self) {
    
    inline def setConfidential(value: Boolean): Self = StObject.set(x, "confidential", value.asInstanceOf[js.Any])
    
    inline def setConfidentialUndefined: Self = StObject.set(x, "confidential", js.undefined)
  }
}
