package typings.wordpressRichText.anon

import typings.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends js.Object {
  
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  def getFormatTypes(): js.Array[NamedFormatConfiguration] = js.native
}
object TypeofimportedSelectors {
  
  @scala.inline
  def apply(
    getFormatType: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForClassName: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypes: () => js.Array[NamedFormatConfiguration]
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(getFormatType = js.Any.fromFunction1(getFormatType), getFormatTypeForBareElement = js.Any.fromFunction1(getFormatTypeForBareElement), getFormatTypeForClassName = js.Any.fromFunction1(getFormatTypeForClassName), getFormatTypes = js.Any.fromFunction0(getFormatTypes))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
  
  @scala.inline
  implicit class TypeofimportedSelectorsOps[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetFormatType(value: String => js.UndefOr[NamedFormatConfiguration]): Self = this.set("getFormatType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormatTypeForBareElement(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration]
    ): Self = this.set("getFormatTypeForBareElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormatTypeForClassName(value: String => js.UndefOr[NamedFormatConfiguration]): Self = this.set("getFormatTypeForClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormatTypes(value: () => js.Array[NamedFormatConfiguration]): Self = this.set("getFormatTypes", js.Any.fromFunction0(value))
  }
}
