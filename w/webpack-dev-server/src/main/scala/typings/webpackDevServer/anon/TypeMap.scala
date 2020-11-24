package typings.webpackDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeMap extends js.Object {
  
  var typeMap: js.UndefOr[Dictkey] = js.native
}
object TypeMap {
  
  @scala.inline
  def apply(): TypeMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeMap]
  }
  
  @scala.inline
  implicit class TypeMapOps[Self <: TypeMap] (val x: Self) extends AnyVal {
    
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
    def setTypeMap(value: Dictkey): Self = this.set("typeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeMap: Self = this.set("typeMap", js.undefined)
  }
}
