package typings.yeomanEnvironment.anon

import typings.yeomanEnvironment.mod.Options
import typings.yeomanEnvironment.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofutil extends js.Object {
  
  def duplicateEnv(initialEnv: ^[Options]): ^[Options] = js.native
}
object Typeofutil {
  
  @scala.inline
  def apply(duplicateEnv: ^[Options] => ^[Options]): Typeofutil = {
    val __obj = js.Dynamic.literal(duplicateEnv = js.Any.fromFunction1(duplicateEnv))
    __obj.asInstanceOf[Typeofutil]
  }
  
  @scala.inline
  implicit class TypeofutilOps[Self <: Typeofutil] (val x: Self) extends AnyVal {
    
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
    def setDuplicateEnv(value: ^[Options] => ^[Options]): Self = this.set("duplicateEnv", js.Any.fromFunction1(value))
  }
}
