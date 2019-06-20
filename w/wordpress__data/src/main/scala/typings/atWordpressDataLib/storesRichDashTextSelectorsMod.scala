package typings
package atWordpressDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data/stores/rich-text/selectors", JSImport.Namespace)
@js.native
object storesRichDashTextSelectorsMod extends js.Object {
  def getFormatType(name: java.lang.String): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypeForClassName(elementClassName: java.lang.String): js.UndefOr[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
  def getFormatTypes(): js.Array[atWordpressRichDashTextLib.atWordpressRichDashTextMod.NamedFormatConfiguration] = js.native
}

