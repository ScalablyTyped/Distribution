package typings.typescriptOptional.typesMod

import typings.typescriptOptional.typescriptOptionalStrings.empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Empty[T] extends Option[T] {
  
  var kind: empty = js.native
}
object Empty {
  
  @scala.inline
  def apply[T](kind: empty): Empty[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Empty[T]]
  }
  
  @scala.inline
  implicit class EmptyOps[Self <: Empty[_], T] (val x: Self with Empty[T]) extends AnyVal {
    
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
    def setKind(value: empty): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
