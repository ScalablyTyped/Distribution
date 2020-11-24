package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for generator-lookups.
  */
@js.native
trait GeneratorLookupOptions extends LookupOptionBase {
  
  /**
    * A value indicating whether the path to the package should be returned instead of the path to the generator.
    */
  var packagePath: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether only one result should be returned.
    */
  var singleResult: js.UndefOr[Boolean] = js.native
}
object GeneratorLookupOptions {
  
  @scala.inline
  def apply(): GeneratorLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorLookupOptions]
  }
  
  @scala.inline
  implicit class GeneratorLookupOptionsOps[Self <: GeneratorLookupOptions] (val x: Self) extends AnyVal {
    
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
    def setPackagePath(value: Boolean): Self = this.set("packagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagePath: Self = this.set("packagePath", js.undefined)
    
    @scala.inline
    def setSingleResult(value: Boolean): Self = this.set("singleResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleResult: Self = this.set("singleResult", js.undefined)
  }
}
