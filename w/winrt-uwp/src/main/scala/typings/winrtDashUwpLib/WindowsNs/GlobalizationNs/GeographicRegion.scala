package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a region. This is usually a country, but may be a macroregion. */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
/** Creates a GeographicRegion object that defaults to the user's home region. */
class GeographicRegion () extends js.Object {
  /**
    * Creates a GeographicRegion object.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    */
  def this(geographicRegionCode: java.lang.String) = this()
  /** Gets the string that contains the best available identifier that represents the region. */
  var code: java.lang.String = js.native
  /** Gets the three-digit identifier for this region, as a string. */
  var codeThreeDigit: java.lang.String = js.native
  /** Gets the three-letter identifier for this region. */
  var codeThreeLetter: java.lang.String = js.native
  /** Gets the two-letter identifier for this region. */
  var codeTwoLetter: java.lang.String = js.native
  /** Gets the set of currencies in use in this region. */
  var currenciesInUse: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets a localized string that is suitable for display to the user for identifying the region. */
  var displayName: java.lang.String = js.native
  /** Gets the name of the region in the primary language spoken in this region. */
  var nativeName: java.lang.String = js.native
}

/** Describes a region. This is usually a country, but may be a macroregion. */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
object GeographicRegion extends js.Object {
  /**
    * Determines whether a geographic region identifier is supported.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    * @return True if the ID is known; otherwise, false. If this method returns true, an app can safely construct a region by using this region identifier. If it returns false, attempting to construct a region for the given code will throw an exception.
    */
  def isSupported(geographicRegionCode: java.lang.String): scala.Boolean = js.native
}

