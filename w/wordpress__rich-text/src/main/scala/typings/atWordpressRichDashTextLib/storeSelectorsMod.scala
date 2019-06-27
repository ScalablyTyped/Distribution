package typings
package atWordpressRichDashTextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/rich-text/store/selectors", JSImport.Namespace)
@js.native
object storeSelectorsMod extends js.Object {
  def getFormatType(name: java.lang.String): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypeForClassName(elementClassName: java.lang.String): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypes(): js.Array[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
}

