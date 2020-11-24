package typings.webpack.bannerPluginMod

import typings.webpack.anon.Basename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerPluginOptions extends js.Object {
  
  /**
  	 * Specifies the banner
  	 */
  var banner: BannerFunction | String = js.native
  
  /**
  	 * If true, the banner will only be added to the entry chunks
  	 */
  var entryOnly: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Exclude all modules matching any of these conditions
  	 */
  var exclude: js.UndefOr[Rules] = js.native
  
  /**
  	 * Include all modules matching any of these conditions
  	 */
  var include: js.UndefOr[Rules] = js.native
  
  /**
  	 * If true, banner will not be wrapped in a comment
  	 */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Include all modules that pass test assertion
  	 */
  var test: js.UndefOr[Rules] = js.native
}
object BannerPluginOptions {
  
  @scala.inline
  def apply(banner: BannerFunction | String): BannerPluginOptions = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerPluginOptions]
  }
  
  @scala.inline
  implicit class BannerPluginOptionsOps[Self <: BannerPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setBannerFunction1(value: /* data */ Basename => String): Self = this.set("banner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBanner(value: BannerFunction | String): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryOnly(value: Boolean): Self = this.set("entryOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryOnly: Self = this.set("entryOnly", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Rule*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Rules): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Rule*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Rules): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: Rule*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Rules): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
