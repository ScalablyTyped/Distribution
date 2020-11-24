package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the `findGeneratorsIn` method.
  */
@js.native
trait GeneratorsInOptions extends js.Object {
  
  /**
    * The package-patterns to look for.
    */
  var packagePatterns: js.UndefOr[js.Array[String]] = js.native
}
object GeneratorsInOptions {
  
  @scala.inline
  def apply(): GeneratorsInOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorsInOptions]
  }
  
  @scala.inline
  implicit class GeneratorsInOptionsOps[Self <: GeneratorsInOptions] (val x: Self) extends AnyVal {
    
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
    def setPackagePatternsVarargs(value: String*): Self = this.set("packagePatterns", js.Array(value :_*))
    
    @scala.inline
    def setPackagePatterns(value: js.Array[String]): Self = this.set("packagePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagePatterns: Self = this.set("packagePatterns", js.undefined)
  }
}
