package typings.swaggerSailsHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _empty extends js.Object {
  
  /**
    * This route will match any routes that aren't bound in the app via a custom route configuration
    * or a blueprint.
    */
  @JSName("/*")
  def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any = js.native
}
object _empty {
  
  @scala.inline
  def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[_]) => js.Any): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    
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
    def setSlashAsterisk(value: (js.Any, js.Any, js.Function0[_]) => js.Any): Self = this.set("/*", js.Any.fromFunction3(value))
  }
}
