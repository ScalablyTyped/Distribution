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

