package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a region. This is usually a country, but may be a macroregion. */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
/** Creates a GeographicRegion object that defaults to the user's home region. */
class GeographicRegion ()
  extends StObject
     with typings.winrtUwp.Windows.Globalization.GeographicRegion {
  /**
    * Creates a GeographicRegion object.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    */
  def this(geographicRegionCode: String) = this()
  
  /** Gets the string that contains the best available identifier that represents the region. */
  /* CompleteClass */
  var code: String = js.native
  
  /** Gets the three-digit identifier for this region, as a string. */
  /* CompleteClass */
  var codeThreeDigit: String = js.native
  
  /** Gets the three-letter identifier for this region. */
  /* CompleteClass */
  var codeThreeLetter: String = js.native
  
  /** Gets the two-letter identifier for this region. */
  /* CompleteClass */
  var codeTwoLetter: String = js.native
  
  /** Gets the set of currencies in use in this region. */
  /* CompleteClass */
  var currenciesInUse: IVectorView[String] = js.native
  
  /** Gets a localized string that is suitable for display to the user for identifying the region. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /** Gets the name of the region in the primary language spoken in this region. */
  /* CompleteClass */
  var nativeName: String = js.native
}
object GeographicRegion {
  
  @JSGlobal("Windows.Globalization.GeographicRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determines whether a geographic region identifier is supported.
    * @param geographicRegionCode One of the ISO 3166-1 two-letter or three-letter codes that identify the country, or one of the three-digit UN-M49 codes that identify the geographical region.
    * @return True if the ID is known; otherwise, false. If this method returns true, an app can safely construct a region by using this region identifier. If it returns false, attempting to construct a region for the given code will throw an exception.
    */
  /* static member */
  @scala.inline
  def isSupported(geographicRegionCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(geographicRegionCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
