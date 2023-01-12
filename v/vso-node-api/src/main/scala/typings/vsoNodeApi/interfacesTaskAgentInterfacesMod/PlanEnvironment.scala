package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanEnvironment extends StObject {
  
  var mask: js.Array[MaskHint]
  
  var options: StringDictionary[JobOption]
  
  var variables: StringDictionary[String]
}
object PlanEnvironment {
  
  inline def apply(
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    variables: StringDictionary[String]
  ): PlanEnvironment = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanEnvironment] (val x: Self) extends AnyVal {
    
    inline def setMask(value: js.Array[MaskHint]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskVarargs(value: MaskHint*): Self = StObject.set(x, "mask", js.Array(value*))
    
    inline def setOptions(value: StringDictionary[JobOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
