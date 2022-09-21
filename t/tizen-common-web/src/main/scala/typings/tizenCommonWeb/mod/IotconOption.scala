package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "IotconOption")
@js.native
open class IotconOption protected () extends StObject {
  def this(id: Double, data: String) = this()
  
  /**
    * The string data to add. Length of data is less than or equal to 15.
    */
  var data: String = js.native
  
  /**
    * The ID of the option. id is always situated between 2048 and 3000.
    */
  var id: Double = js.native
}
