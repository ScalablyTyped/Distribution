package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportAndroidIosWindows extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[Description]
  
  var ref: String
  
  var support: AndroidIosWindows
}
object SupportAndroidIosWindows {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[Description],
    ref: String,
    support: AndroidIosWindows
  ): SupportAndroidIosWindows = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportAndroidIosWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportAndroidIosWindows] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: AndroidIosWindows): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
