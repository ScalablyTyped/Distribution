package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/rich-text/store/selectors", "getFormatType")
  @js.native
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  @JSImport("@wordpress/rich-text/store/selectors", "getFormatTypeForBareElement")
  @js.native
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration] = js.native
  
  @JSImport("@wordpress/rich-text/store/selectors", "getFormatTypeForClassName")
  @js.native
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  @JSImport("@wordpress/rich-text/store/selectors", "getFormatTypes")
  @js.native
  def getFormatTypes(): js.Array[NamedFormatConfiguration] = js.native
}
