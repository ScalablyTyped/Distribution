package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticRelatedInformation extends js.Object {
  /**
    * The location of this related diagnostic information.
    */
  var location: Location
  /**
    * The message of this related diagnostic information.
    */
  var message: String
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(location: Location, message: String): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(location = location, message = message)
  
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

