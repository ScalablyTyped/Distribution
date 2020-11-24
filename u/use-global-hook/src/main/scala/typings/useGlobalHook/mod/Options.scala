package typings.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[S, A] extends js.Object {
  
  var Immer: js.UndefOr[IProduce] = js.native
  
  var initializer: js.UndefOr[InitializerFunction[S, A]] = js.native
}
object Options {
  
  @scala.inline
  def apply[S, A](): Options[S, A] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[S, A]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], S, A] (val x: Self with (Options[S, A])) extends AnyVal {
    
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
    def setImmer(value: IProduce): Self = this.set("Immer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmer: Self = this.set("Immer", js.undefined)
    
    @scala.inline
    def setInitializer(value: /* store */ Store[S, A] => Unit): Self = this.set("initializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitializer: Self = this.set("initializer", js.undefined)
  }
}
