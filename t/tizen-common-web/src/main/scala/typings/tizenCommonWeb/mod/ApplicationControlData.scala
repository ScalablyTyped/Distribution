package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "ApplicationControlData")
@js.native
open class ApplicationControlData protected () extends StObject {
  def this(key: String, value: js.Array[String]) = this()
  
  /**
    * An attribute to store the name of a key.
    */
  var key: String = js.native
  
  /**
    * An attribute to store the value associated with a key.
    */
  var value: js.Array[String] = js.native
}
