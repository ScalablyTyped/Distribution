package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreCursorFactory extends js.Object {
  
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor = js.native
}
object ICoreCursorFactory {
  
  @scala.inline
  def apply(createCursor: (CoreCursorType, Double) => CoreCursor): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = js.Any.fromFunction2(createCursor))
    __obj.asInstanceOf[ICoreCursorFactory]
  }
  
  @scala.inline
  implicit class ICoreCursorFactoryOps[Self <: ICoreCursorFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateCursor(value: (CoreCursorType, Double) => CoreCursor): Self = this.set("createCursor", js.Any.fromFunction2(value))
  }
}
