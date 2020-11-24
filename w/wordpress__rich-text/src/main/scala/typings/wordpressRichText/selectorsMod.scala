package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/rich-text/store/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypes(): js.Array[NamedFormatConfiguration] = js.native
}
