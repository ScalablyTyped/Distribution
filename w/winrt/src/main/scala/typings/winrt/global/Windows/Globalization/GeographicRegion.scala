package typings.winrt.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
class GeographicRegion ()
  extends typings.winrt.Windows.Globalization.GeographicRegion {
  def this(geographicRegionCode: String) = this()
}

/* static members */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
object GeographicRegion extends js.Object {
  def isSupported(geographicRegionCode: String): Boolean = js.native
}

