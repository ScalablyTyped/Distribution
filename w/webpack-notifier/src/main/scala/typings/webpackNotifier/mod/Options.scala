package typings.webpackNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var alwaysNotify: js.UndefOr[Boolean] = js.native
  
  var contentImage: js.UndefOr[String] = js.native
  
  /**
    * Use emoji in notifications
    * @default false
    */
  var emoji: js.UndefOr[Boolean] = js.native
  
  var excludeWarnings: js.UndefOr[Boolean] = js.native
  
  var skipFirstNotification: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAlwaysNotify(value: Boolean): Self = this.set("alwaysNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysNotify: Self = this.set("alwaysNotify", js.undefined)
    
    @scala.inline
    def setContentImage(value: String): Self = this.set("contentImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentImage: Self = this.set("contentImage", js.undefined)
    
    @scala.inline
    def setEmoji(value: Boolean): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    
    @scala.inline
    def setExcludeWarnings(value: Boolean): Self = this.set("excludeWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeWarnings: Self = this.set("excludeWarnings", js.undefined)
    
    @scala.inline
    def setSkipFirstNotification(value: Boolean): Self = this.set("skipFirstNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFirstNotification: Self = this.set("skipFirstNotification", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
