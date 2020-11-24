package typings.webcola.powergraphMod

import typings.webcola.linklengthsMod.LinkAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkTypeAccessor[Link] extends LinkAccessor[Link] {
  
  def getType(l: Link): Double = js.native
}
object LinkTypeAccessor {
  
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, getType: Link => Double): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
  
  @scala.inline
  implicit class LinkTypeAccessorOps[Self <: LinkTypeAccessor[_], Link] (val x: Self with LinkTypeAccessor[Link]) extends AnyVal {
    
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
    def setGetType(value: Link => Double): Self = this.set("getType", js.Any.fromFunction1(value))
  }
}
