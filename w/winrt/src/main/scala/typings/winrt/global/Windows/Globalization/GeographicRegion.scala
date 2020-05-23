package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
class GeographicRegion ()
  extends typings.winrt.Windows.Globalization.GeographicRegion {
  def this(geographicRegionCode: String) = this()
  /* CompleteClass */
  override var code: String = js.native
  /* CompleteClass */
  override var codeThreeDigit: String = js.native
  /* CompleteClass */
  override var codeThreeLetter: String = js.native
  /* CompleteClass */
  override var codeTwoLetter: String = js.native
  /* CompleteClass */
  override var currenciesInUse: IVectorView[String] = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var nativeName: String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.GeographicRegion")
@js.native
object GeographicRegion extends js.Object {
  def isSupported(geographicRegionCode: String): Boolean = js.native
}

