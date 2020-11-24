package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoInit :boolean,   getAutoInitModule :any | undefined,   globalInjection :(p : string): string | undefined}> */
@js.native
trait PartialautoInitbooleanget extends js.Object {
  
  var autoInit: js.UndefOr[Boolean] = js.native
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.native
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}
object PartialautoInitbooleanget {
  
  @scala.inline
  def apply(): PartialautoInitbooleanget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoInitbooleanget]
  }
  
  @scala.inline
  implicit class PartialautoInitbooleangetOps[Self <: PartialautoInitbooleanget] (val x: Self) extends AnyVal {
    
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
    def setAutoInit(value: Boolean): Self = this.set("autoInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInit: Self = this.set("autoInit", js.undefined)
    
    @scala.inline
    def setGetAutoInitModule(value: js.Any): Self = this.set("getAutoInitModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAutoInitModule: Self = this.set("getAutoInitModule", js.undefined)
    
    @scala.inline
    def setGlobalInjection(value: /* p */ String => String): Self = this.set("globalInjection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGlobalInjection: Self = this.set("globalInjection", js.undefined)
  }
}
