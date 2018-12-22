package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typography", JSImport.Default)
@js.native
class default protected () extends Typography {
  def this(opts: TypographyOptions) = this()
  /* CompleteClass */
  override var adjustFontSizeTo: js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], js.Object] = js.native
  /* CompleteClass */
  override var establishBaseline: js.Function0[BaseLine] = js.native
  /* CompleteClass */
  override var linesForFontSize: js.Function1[/* fontSize */ scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var options: TypographyOptions = js.native
  /* CompleteClass */
  override var rhythm: js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  /* CompleteClass */
  override var scale: js.Function1[/* value */ scala.Double, BaseLine] = js.native
  /* CompleteClass */
  override def createStyles(): java.lang.String = js.native
  /* CompleteClass */
  override def injectStyles(): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Object = js.native
}

