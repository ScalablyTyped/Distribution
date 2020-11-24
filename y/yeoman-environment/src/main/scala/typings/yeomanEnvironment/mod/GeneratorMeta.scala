package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a generator.
  */
@js.native
trait GeneratorMeta extends js.Object {
  
  /**
    * The namespace of the generator.
    */
  var namespace: String = js.native
  
  /**
    * The path to the package containing the generator.
    */
  var packagePath: String = js.native
  
  /**
    * The resolved path to the generator.
    */
  var resolved: String = js.native
}
object GeneratorMeta {
  
  @scala.inline
  def apply(namespace: String, packagePath: String, resolved: String): GeneratorMeta = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorMeta]
  }
  
  @scala.inline
  implicit class GeneratorMetaOps[Self <: GeneratorMeta] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagePath(value: String): Self = this.set("packagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolved(value: String): Self = this.set("resolved", value.asInstanceOf[js.Any])
  }
}
