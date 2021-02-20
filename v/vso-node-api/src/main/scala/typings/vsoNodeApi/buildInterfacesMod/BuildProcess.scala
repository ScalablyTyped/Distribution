package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildProcess extends StObject {
  
  /**
    * The type of the process.
    */
  var `type`: Double = js.native
}
object BuildProcess {
  
  @scala.inline
  def apply(`type`: Double): BuildProcess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcess]
  }
  
  @scala.inline
  implicit class BuildProcessMutableBuilder[Self <: BuildProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
