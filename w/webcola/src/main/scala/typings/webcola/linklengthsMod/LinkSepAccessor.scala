package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
  
  def getMinSeparation(l: Link): Double = js.native
}
object LinkSepAccessor {
  
  @scala.inline
  def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
  
  @scala.inline
  implicit class LinkSepAccessorOps[Self <: LinkSepAccessor[_], Link] (val x: Self with LinkSepAccessor[Link]) extends AnyVal {
    
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
    def setGetMinSeparation(value: Link => Double): Self = this.set("getMinSeparation", js.Any.fromFunction1(value))
  }
}
