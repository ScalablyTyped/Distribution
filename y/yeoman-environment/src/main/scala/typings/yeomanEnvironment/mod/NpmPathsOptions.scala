package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the `getNpmPaths` method.
  */
@js.native
trait NpmPathsOptions extends LookupOptionBase {
  
  /**
    * A value indicating whether paths which don't end with a supported directory-name should be filtered (unless they are part of `NODE_PATH`).
    */
  var filterPaths: js.UndefOr[Boolean] = js.native
}
object NpmPathsOptions {
  
  @scala.inline
  def apply(): NpmPathsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NpmPathsOptions]
  }
  
  @scala.inline
  implicit class NpmPathsOptionsOps[Self <: NpmPathsOptions] (val x: Self) extends AnyVal {
    
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
    def setFilterPaths(value: Boolean): Self = this.set("filterPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPaths: Self = this.set("filterPaths", js.undefined)
  }
}
