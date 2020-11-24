package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAgeSeconds extends js.Object {
  
  /**
    * The `maxAgeSeconds` property to use when creating the
    * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The `maxEntries` property to use when creating the
    * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
    */
  var maxEntries: js.UndefOr[Double] = js.native
}
object MaxAgeSeconds {
  
  @scala.inline
  def apply(): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAgeSeconds]
  }
  
  @scala.inline
  implicit class MaxAgeSecondsOps[Self <: MaxAgeSeconds] (val x: Self) extends AnyVal {
    
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
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setMaxEntries(value: Double): Self = this.set("maxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEntries: Self = this.set("maxEntries", js.undefined)
  }
}
