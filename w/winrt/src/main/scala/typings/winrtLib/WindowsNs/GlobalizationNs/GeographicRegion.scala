package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
class GeographicRegion () extends IGeographicRegion {
  def this(geographicRegionCode: java.lang.String) = this()
  /* CompleteClass */
  override var code: java.lang.String = js.native
  /* CompleteClass */
  override var codeThreeDigit: java.lang.String = js.native
  /* CompleteClass */
  override var codeThreeLetter: java.lang.String = js.native
  /* CompleteClass */
  override var codeTwoLetter: java.lang.String = js.native
  /* CompleteClass */
  override var currenciesInUse: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var nativeName: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
object GeographicRegion extends js.Object {
  def isSupported(geographicRegionCode: java.lang.String): scala.Boolean = js.native
}

