package typings.uifabricUtilities.classNamesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassNamesFunctionOptions extends js.Object {
  
  /**
    * Size of the cache. It overwrites default cache size when defined.
    */
  var cacheSize: js.UndefOr[Double] = js.native
  
  /**
    * Disables class caching for scenarios where styleProp parts mutate frequently.
    */
  var disableCaching: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true if component base styles are implemented in scss instead of css-in-js.
    */
  var useStaticStyles: js.UndefOr[Boolean] = js.native
}
object IClassNamesFunctionOptions {
  
  @scala.inline
  def apply(): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
  
  @scala.inline
  implicit class IClassNamesFunctionOptionsOps[Self <: IClassNamesFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = this.set("disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCaching: Self = this.set("disableCaching", js.undefined)
    
    @scala.inline
    def setUseStaticStyles(value: Boolean): Self = this.set("useStaticStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStaticStyles: Self = this.set("useStaticStyles", js.undefined)
  }
}
