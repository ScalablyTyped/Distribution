package typings.typeFest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opaque extends js.Object {
  
  val __opaque__ : js.Symbol = js.native
}
object Opaque {
  
  @scala.inline
  def apply(__opaque__ : js.Symbol): Opaque = {
    val __obj = js.Dynamic.literal(__opaque__ = __opaque__.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opaque]
  }
  
  @scala.inline
  implicit class OpaqueOps[Self <: Opaque] (val x: Self) extends AnyVal {
    
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
    def set__opaque__(value: js.Symbol): Self = this.set("__opaque__", value.asInstanceOf[js.Any])
  }
}
