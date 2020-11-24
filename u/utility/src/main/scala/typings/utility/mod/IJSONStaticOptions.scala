package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ----------------0_0-----------------------
  * @description Defines For JSON methods
  * @see https://github.com/node-modules/utility#json
  * -----------------0^0-----------------------
  */
@js.native
trait IJSONStaticOptions extends js.Object {
  
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  var space: js.UndefOr[Double | String] = js.native
}
object IJSONStaticOptions {
  
  @scala.inline
  def apply(): IJSONStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJSONStaticOptions]
  }
  
  @scala.inline
  implicit class IJSONStaticOptionsOps[Self <: IJSONStaticOptions] (val x: Self) extends AnyVal {
    
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
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
