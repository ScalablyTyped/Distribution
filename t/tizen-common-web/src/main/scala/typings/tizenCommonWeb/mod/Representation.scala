package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "Representation")
@js.native
open class Representation protected () extends StObject {
  def this(uriPath: String) = this()
  
  /**
    * A lists of attribute in this resource.
    */
  var attributes: Any = js.native
  
  /**
    * Representations belonging to this representation.
    */
  var children: js.Array[Representation] | Null = js.native
  
  /**
    * A list of interfaces in the resource.
    */
  var resourceInterfaces: js.Array[ResourceInterface] = js.native
  
  /**
    * A list of types in this resource
    */
  var resourceTypes: js.Array[ResourceType] = js.native
  
  /**
    * The resource URI.
    */
  var uriPath: String = js.native
}
