package typings.through2Concurrent.mod

import typings.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Through2ConcurrentOptions extends DuplexOptions {
  
  var maxConcurrency: js.UndefOr[Double] = js.native
}
object Through2ConcurrentOptions {
  
  @scala.inline
  def apply(): Through2ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Through2ConcurrentOptions]
  }
  
  @scala.inline
  implicit class Through2ConcurrentOptionsOps[Self <: Through2ConcurrentOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
  }
}
