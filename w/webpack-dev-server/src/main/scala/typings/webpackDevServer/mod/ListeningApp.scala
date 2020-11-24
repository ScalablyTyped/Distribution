package typings.webpackDevServer.mod

import typings.webpackDevServer.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListeningApp extends js.Object {
  
  def address(): Port = js.native
}
object ListeningApp {
  
  @scala.inline
  def apply(address: () => Port): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
    __obj.asInstanceOf[ListeningApp]
  }
  
  @scala.inline
  implicit class ListeningAppOps[Self <: ListeningApp] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: () => Port): Self = this.set("address", js.Any.fromFunction0(value))
  }
}
