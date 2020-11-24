package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
  
  def setLength(l: Link, value: Double): Unit = js.native
}
object LinkLengthAccessor {
  
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, setLength: (Link, Double) => Unit): LinkLengthAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2(setLength))
    __obj.asInstanceOf[LinkLengthAccessor[Link]]
  }
  
  @scala.inline
  implicit class LinkLengthAccessorOps[Self <: LinkLengthAccessor[_], Link] (val x: Self with LinkLengthAccessor[Link]) extends AnyVal {
    
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
    def setSetLength(value: (Link, Double) => Unit): Self = this.set("setLength", js.Any.fromFunction2(value))
  }
}
