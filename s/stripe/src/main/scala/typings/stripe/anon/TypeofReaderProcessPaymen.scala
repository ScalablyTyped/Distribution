package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReaderProcessPaymen extends StObject {
  
  val ProcessConfig: Any
}
object TypeofReaderProcessPaymen {
  
  inline def apply(ProcessConfig: Any): TypeofReaderProcessPaymen = {
    val __obj = js.Dynamic.literal(ProcessConfig = ProcessConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReaderProcessPaymen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReaderProcessPaymen] (val x: Self) extends AnyVal {
    
    inline def setProcessConfig(value: Any): Self = StObject.set(x, "ProcessConfig", value.asInstanceOf[js.Any])
  }
}
