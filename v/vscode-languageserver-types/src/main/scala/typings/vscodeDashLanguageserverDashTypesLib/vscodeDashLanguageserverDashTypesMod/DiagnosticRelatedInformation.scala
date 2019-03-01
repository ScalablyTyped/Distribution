package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

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
  var message: java.lang.String
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(location: Location, message: java.lang.String): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

