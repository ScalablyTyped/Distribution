package typings.winrtUwp.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a region. This is usually a country, but may be a macroregion. */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
/** Creates a GeographicRegion object that defaults to the user's home region. */
class GeographicRegion ()
  extends typings.winrtUwp.Windows.Globalization.GeographicRegion {
  /**
    * Creates a GeographicRegion object.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    */
  def this(geographicRegionCode: String) = this()
}

/* static members */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
object GeographicRegion extends js.Object {
  /**
    * Determines whether a geographic region identifier is supported.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    * @return True if the ID is known; otherwise, false. If this method returns true, an app can safely construct a region by using this region identifier. If it returns false, attempting to construct a region for the given code will throw an exception.
    */
  def isSupported(geographicRegionCode: String): Boolean = js.native
}

