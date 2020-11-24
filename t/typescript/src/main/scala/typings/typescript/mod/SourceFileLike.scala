package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFileLike extends js.Object {
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
}
object SourceFileLike {
  
  @scala.inline
  def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
    __obj.asInstanceOf[SourceFileLike]
  }
  
  @scala.inline
  implicit class SourceFileLikeOps[Self <: SourceFileLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = this.set("getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
  }
}
