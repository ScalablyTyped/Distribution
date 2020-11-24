package typings.uglifyjsWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractCommentsOptions extends js.Object {
  
  var banner: js.UndefOr[Boolean | String | (js.Function1[/* fileName */ String, String])] = js.native
  
  var condition: js.UndefOr[RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])] = js.native
  
  var filename: js.UndefOr[String | (js.Function1[/* originalFileName */ String, String])] = js.native
}
object ExtractCommentsOptions {
  
  @scala.inline
  def apply(): ExtractCommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractCommentsOptions]
  }
  
  @scala.inline
  implicit class ExtractCommentsOptionsOps[Self <: ExtractCommentsOptions] (val x: Self) extends AnyVal {
    
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
    def setBannerFunction1(value: /* fileName */ String => String): Self = this.set("banner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBanner(value: Boolean | String | (js.Function1[/* fileName */ String, String])): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    
    @scala.inline
    def setConditionFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = this.set("condition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCondition(value: RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setFilenameFunction1(value: /* originalFileName */ String => String): Self = this.set("filename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilename(value: String | (js.Function1[/* originalFileName */ String, String])): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
}
