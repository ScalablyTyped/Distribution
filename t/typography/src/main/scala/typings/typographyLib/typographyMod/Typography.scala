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
    val __obj = js.Dynamic.literal(adjustFontSizeTo = adjustFontSizeTo, createStyles = createStyles, establishBaseline = establishBaseline, injectStyles = injectStyles, linesForFontSize = linesForFontSize, options = options, rhythm = rhythm, scale = scale, toJSON = toJSON)
  
    __obj.asInstanceOf[Typography]
  }
}

