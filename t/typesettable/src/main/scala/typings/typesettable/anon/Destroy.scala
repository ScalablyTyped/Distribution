package typings.typesettable.anon

import typings.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destroy extends js.Object {
  
  def destroy(): Unit = js.native
  
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit = js.native
}
object Destroy {
  
  @scala.inline
  def apply(destroy: () => Unit, write: (String, Double, IXAlign, Double, Double) => Unit): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[Destroy]
  }
  
  @scala.inline
  implicit class DestroyOps[Self <: Destroy] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = this.set("write", js.Any.fromFunction5(value))
  }
}
