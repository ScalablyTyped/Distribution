package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for GPS file properties. */
trait SystemGPSProperties extends js.Object {
  /** Gets the name of the System.GPS.LatitudeDecimal property (one of the GPS file properties). */
  var latitudeDecimal: String
  /** Gets the name of the System.GPS.LongitudeDecimal property (one of the GPS file properties). */
  var longitudeDecimal: String
}

object SystemGPSProperties {
  @scala.inline
  def apply(latitudeDecimal: String, longitudeDecimal: String): SystemGPSProperties = {
    val __obj = js.Dynamic.literal(latitudeDecimal = latitudeDecimal.asInstanceOf[js.Any], longitudeDecimal = longitudeDecimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemGPSProperties]
  }
}

