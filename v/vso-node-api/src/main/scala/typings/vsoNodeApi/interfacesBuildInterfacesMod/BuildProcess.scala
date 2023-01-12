package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildProcess extends StObject {
  
  /**
    * The type of the process.
    */
  var `type`: Double
}
object BuildProcess {
  
  inline def apply(`type`: Double): BuildProcess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildProcess] (val x: Self) extends AnyVal {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
