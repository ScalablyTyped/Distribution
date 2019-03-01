package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var adjustFontSizeTo: js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], js.Object]
  var establishBaseline: js.Function0[BaseLine]
  var linesForFontSize: js.Function1[/* fontSize */ scala.Double, scala.Double]
  var options: TypographyOptions
  var rhythm: js.Function1[/* value */ scala.Double, java.lang.String]
  var scale: js.Function1[/* value */ scala.Double, BaseLine]
  def createStyles(): java.lang.String
  def injectStyles(): scala.Unit
  def toJSON(): js.Object
}

object Typography {
  @scala.inline
  def apply(
    adjustFontSizeTo: js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], js.Object],
    createStyles: js.Function0[java.lang.String],
    establishBaseline: js.Function0[BaseLine],
    injectStyles: js.Function0[scala.Unit],
    linesForFontSize: js.Function1[/* fontSize */ scala.Double, scala.Double],
    options: TypographyOptions,
    rhythm: js.Function1[/* value */ scala.Double, java.lang.String],
    scale: js.Function1[/* value */ scala.Double, BaseLine],
    toJSON: js.Function0[js.Object]
  ): Typography = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustFontSizeTo")(adjustFontSizeTo)
    __obj.updateDynamic("createStyles")(createStyles)
    __obj.updateDynamic("establishBaseline")(establishBaseline)
    __obj.updateDynamic("injectStyles")(injectStyles)
    __obj.updateDynamic("linesForFontSize")(linesForFontSize)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("rhythm")(rhythm)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Typography]
  }
}

