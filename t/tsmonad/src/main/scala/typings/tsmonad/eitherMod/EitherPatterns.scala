package typings.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EitherPatterns[L, R, T] extends js.Object {
  
  def left(l: L): T = js.native
  
  def right(r: R): T = js.native
}
object EitherPatterns {
  
  @scala.inline
  def apply[L, R, T](left: L => T, right: R => T): EitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
    __obj.asInstanceOf[EitherPatterns[L, R, T]]
  }
  
  @scala.inline
  implicit class EitherPatternsOps[Self <: EitherPatterns[_, _, _], L, R, T] (val x: Self with (EitherPatterns[L, R, T])) extends AnyVal {
    
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
    def setLeft(value: L => T): Self = this.set("left", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRight(value: R => T): Self = this.set("right", js.Any.fromFunction1(value))
  }
}
