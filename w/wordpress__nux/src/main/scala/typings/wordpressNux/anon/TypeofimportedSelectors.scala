package typings.wordpressNux.anon

import typings.wordpressNux.selectorsMod.GuideInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends js.Object {
  
  def areTipsEnabled(): Boolean = js.native
  
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo] = js.native
  
  def isTipVisible(tipId: String): Boolean = js.native
}
object TypeofimportedSelectors {
  
  @scala.inline
  def apply(
    areTipsEnabled: () => Boolean,
    getAssociatedGuide: String => js.UndefOr[GuideInfo],
    isTipVisible: String => Boolean
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
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
    def setAreTipsEnabled(value: () => Boolean): Self = this.set("areTipsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociatedGuide(value: String => js.UndefOr[GuideInfo]): Self = this.set("getAssociatedGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsTipVisible(value: String => Boolean): Self = this.set("isTipVisible", js.Any.fromFunction1(value))
  }
}
