package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the `lookup` method.
  */
@js.native
trait LookupOptions extends LookupOptionBase {
  
  /**
    * The file-patterns to look for.
    */
  var filePatterns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The `deep` option to pass to `globby`.
    */
  var globbyDeep: js.UndefOr[Double] = js.native
  
  /**
    * The repüository paths to look for generator packages.
    */
  var npmPaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The paths to look for generators.
    */
  var packagePaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The package patterns to look for.
    */
  var packagePatterns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A value indicating whether the lookup should be stopped after finding the first result.
    */
  var singleResult: js.UndefOr[Boolean] = js.native
}
object LookupOptions {
  
  @scala.inline
  def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
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
    def setFilePatternsVarargs(value: String*): Self = this.set("filePatterns", js.Array(value :_*))
    
    @scala.inline
    def setFilePatterns(value: js.Array[String]): Self = this.set("filePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePatterns: Self = this.set("filePatterns", js.undefined)
    
    @scala.inline
    def setGlobbyDeep(value: Double): Self = this.set("globbyDeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobbyDeep: Self = this.set("globbyDeep", js.undefined)
    
    @scala.inline
    def setNpmPathsVarargs(value: String*): Self = this.set("npmPaths", js.Array(value :_*))
    
    @scala.inline
    def setNpmPaths(value: js.Array[String]): Self = this.set("npmPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpmPaths: Self = this.set("npmPaths", js.undefined)
    
    @scala.inline
    def setPackagePathsVarargs(value: String*): Self = this.set("packagePaths", js.Array(value :_*))
    
    @scala.inline
    def setPackagePaths(value: js.Array[String]): Self = this.set("packagePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagePaths: Self = this.set("packagePaths", js.undefined)
    
    @scala.inline
    def setPackagePatternsVarargs(value: String*): Self = this.set("packagePatterns", js.Array(value :_*))
    
    @scala.inline
    def setPackagePatterns(value: js.Array[String]): Self = this.set("packagePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagePatterns: Self = this.set("packagePatterns", js.undefined)
    
    @scala.inline
    def setSingleResult(value: Boolean): Self = this.set("singleResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleResult: Self = this.set("singleResult", js.undefined)
  }
}
