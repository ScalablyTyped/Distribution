package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkAccessor[Link] extends js.Object {
  
  def getSourceIndex(l: Link): Double = js.native
  
  def getTargetIndex(l: Link): Double = js.native
}
object LinkAccessor {
  
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
  
  @scala.inline
  implicit class LinkAccessorOps[Self <: LinkAccessor[_], Link] (val x: Self with LinkAccessor[Link]) extends AnyVal {
    
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
    def setGetSourceIndex(value: Link => Double): Self = this.set("getSourceIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTargetIndex(value: Link => Double): Self = this.set("getTargetIndex", js.Any.fromFunction1(value))
  }
}
