package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "RequestReply")
@js.native
open class RequestReply () extends StObject {
  def this(data: Bundle) = this()
  def this(data: Null, code: Double) = this()
  def this(data: Bundle, code: Double) = this()
  
  /**
    * Response status code.
    */
  var code: Double = js.native
  
  /**
    * Response data bundle.
    */
  var data: Bundle | Null = js.native
}
