package typings.twitter.mod

import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var consumer_key: String = js.native
  
  var consumer_secret: String = js.native
  
  var media_base: js.UndefOr[String] = js.native
  
  var request_options: js.UndefOr[CoreOptions] = js.native
  
  var rest_base: js.UndefOr[String] = js.native
  
  var site_stream_base: js.UndefOr[String] = js.native
  
  var stream_base: js.UndefOr[String] = js.native
  
  var user_stream_base: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConsumer_key(value: String): Self = this.set("consumer_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumer_secret(value: String): Self = this.set("consumer_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_base(value: String): Self = this.set("media_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_base: Self = this.set("media_base", js.undefined)
    
    @scala.inline
    def setRequest_options(value: CoreOptions): Self = this.set("request_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_options: Self = this.set("request_options", js.undefined)
    
    @scala.inline
    def setRest_base(value: String): Self = this.set("rest_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRest_base: Self = this.set("rest_base", js.undefined)
    
    @scala.inline
    def setSite_stream_base(value: String): Self = this.set("site_stream_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite_stream_base: Self = this.set("site_stream_base", js.undefined)
    
    @scala.inline
    def setStream_base(value: String): Self = this.set("stream_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream_base: Self = this.set("stream_base", js.undefined)
    
    @scala.inline
    def setUser_stream_base(value: String): Self = this.set("user_stream_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_stream_base: Self = this.set("user_stream_base", js.undefined)
  }
}
