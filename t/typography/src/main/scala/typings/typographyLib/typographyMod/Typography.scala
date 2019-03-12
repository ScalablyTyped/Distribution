package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typography extends js.Object {
  @JSName("adjustFontSizeTo")
  var adjustFontSizeTo_Original: js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], js.Object] = js.native
  @JSName("establishBaseline")
  var establishBaseline_Original: js.Function0[BaseLine] = js.native
  @JSName("linesForFontSize")
  var linesForFontSize_Original: js.Function1[/* fontSize */ scala.Double, scala.Double] = js.native
  var options: TypographyOptions = js.native
  @JSName("rhythm")
  var rhythm_Original: js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  @JSName("scale")
  var scale_Original: js.Function1[/* value */ scala.Double, BaseLine] = js.native
  def adjustFontSizeTo(): js.Object = js.native
  def adjustFontSizeTo(value: java.lang.String): js.Object = js.native
  def adjustFontSizeTo(value: scala.Double): js.Object = js.native
  def createStyles(): java.lang.String = js.native
  def establishBaseline(): BaseLine = js.native
  def injectStyles(): scala.Unit = js.native
  def linesForFontSize(fontSize: scala.Double): scala.Double = js.native
  def rhythm(value: scala.Double): java.lang.String = js.native
  def scale(value: scala.Double): BaseLine = js.native
  def toJSON(): js.Object = js.native
}

