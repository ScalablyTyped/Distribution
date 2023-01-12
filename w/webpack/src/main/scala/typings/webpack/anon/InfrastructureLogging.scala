package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfrastructureLogging extends StObject {
  
  /**
  		 * infrastructure logging options
  		 */
  var infrastructureLogging: typings.webpack.mod.InfrastructureLogging
}
object InfrastructureLogging {
  
  inline def apply(infrastructureLogging: typings.webpack.mod.InfrastructureLogging): InfrastructureLogging = {
    val __obj = js.Dynamic.literal(infrastructureLogging = infrastructureLogging.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfrastructureLogging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfrastructureLogging] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureLogging(value: typings.webpack.mod.InfrastructureLogging): Self = StObject.set(x, "infrastructureLogging", value.asInstanceOf[js.Any])
  }
}
