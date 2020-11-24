package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a generator.
  */
@js.native
trait LookupGeneratorMeta extends GeneratorMeta {
  
  /**
    * A value indicating whether the generator could be registered.
    */
  var registered: Boolean = js.native
}
object LookupGeneratorMeta {
  
  @scala.inline
  def apply(namespace: String, packagePath: String, registered: Boolean, resolved: String): LookupGeneratorMeta = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupGeneratorMeta]
  }
  
  @scala.inline
  implicit class LookupGeneratorMetaOps[Self <: LookupGeneratorMeta] (val x: Self) extends AnyVal {
    
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
    def setRegistered(value: Boolean): Self = this.set("registered", value.asInstanceOf[js.Any])
  }
}
