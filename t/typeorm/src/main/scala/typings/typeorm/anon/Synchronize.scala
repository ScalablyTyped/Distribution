package typings.typeorm.anon

import typings.typeorm.typeormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synchronize extends js.Object {
  
  var synchronize: `false` = js.native
}
object Synchronize {
  
  @scala.inline
  def apply(synchronize: `false`): Synchronize = {
    val __obj = js.Dynamic.literal(synchronize = synchronize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synchronize]
  }
  
  @scala.inline
  implicit class SynchronizeOps[Self <: Synchronize] (val x: Self) extends AnyVal {
    
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
    def setSynchronize(value: `false`): Self = this.set("synchronize", value.asInstanceOf[js.Any])
  }
}
