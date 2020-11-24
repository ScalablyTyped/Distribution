package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazyOptions extends js.Object {
  
  var elementClass: js.UndefOr[String] = js.native
  
  var loadOnTransitionStart: js.UndefOr[Boolean] = js.native
  
  var loadPrevNext: js.UndefOr[Boolean] = js.native
  
  var loadPrevNextAmount: js.UndefOr[Double] = js.native
  
  var loadedClass: js.UndefOr[String] = js.native
  
  var loadingClass: js.UndefOr[String] = js.native
  
  var preloaderClass: js.UndefOr[String] = js.native
}
object LazyOptions {
  
  @scala.inline
  def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  
  @scala.inline
  implicit class LazyOptionsOps[Self <: LazyOptions] (val x: Self) extends AnyVal {
    
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
    def setElementClass(value: String): Self = this.set("elementClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementClass: Self = this.set("elementClass", js.undefined)
    
    @scala.inline
    def setLoadOnTransitionStart(value: Boolean): Self = this.set("loadOnTransitionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnTransitionStart: Self = this.set("loadOnTransitionStart", js.undefined)
    
    @scala.inline
    def setLoadPrevNext(value: Boolean): Self = this.set("loadPrevNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPrevNext: Self = this.set("loadPrevNext", js.undefined)
    
    @scala.inline
    def setLoadPrevNextAmount(value: Double): Self = this.set("loadPrevNextAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPrevNextAmount: Self = this.set("loadPrevNextAmount", js.undefined)
    
    @scala.inline
    def setLoadedClass(value: String): Self = this.set("loadedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedClass: Self = this.set("loadedClass", js.undefined)
    
    @scala.inline
    def setLoadingClass(value: String): Self = this.set("loadingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingClass: Self = this.set("loadingClass", js.undefined)
    
    @scala.inline
    def setPreloaderClass(value: String): Self = this.set("preloaderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloaderClass: Self = this.set("preloaderClass", js.undefined)
  }
}
