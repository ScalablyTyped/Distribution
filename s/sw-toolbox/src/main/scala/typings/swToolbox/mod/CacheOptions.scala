package typings.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheOptions extends js.Object {
  
  var maxAgeSeconds: Double = js.native
  
  var maxEntries: Double = js.native
  
  var name: String = js.native
}
object CacheOptions {
  
  @scala.inline
  def apply(maxAgeSeconds: Double, maxEntries: Double, name: String): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds.asInstanceOf[js.Any], maxEntries = maxEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
  
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxAgeSeconds(value: Double): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEntries(value: Double): Self = this.set("maxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
