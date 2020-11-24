package typings.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiblingOptions[T /* <: js.Object */] extends js.Object {
  
  /**
    * Used to constrain the operation to a subtree.
    *
    * When `null`, the whole tree is walked to the real root.
    *
    * @default null
    */
  var root: js.UndefOr[T | Null] = js.native
  
  /**
    * If set, ignore the children of `object`
    *
    * @default false
    */
  var skipChildren: js.UndefOr[Boolean] = js.native
}
object SiblingOptions {
  
  @scala.inline
  def apply[T /* <: js.Object */](): SiblingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiblingOptions[T]]
  }
  
  @scala.inline
  implicit class SiblingOptionsOps[Self <: SiblingOptions[_], T /* <: js.Object */] (val x: Self with SiblingOptions[T]) extends AnyVal {
    
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
    def setRoot(value: T): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSkipChildren(value: Boolean): Self = this.set("skipChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipChildren: Self = this.set("skipChildren", js.undefined)
  }
}
