package typings.tsutils

import typings.typescript.typescriptMod.ExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModuleReference extends js.Object {
  var moduleReference: ExternalModuleReference
}

object Anon_ModuleReference {
  @scala.inline
  def apply(moduleReference: ExternalModuleReference): Anon_ModuleReference = {
    val __obj = js.Dynamic.literal(moduleReference = moduleReference)
  
    __obj.asInstanceOf[Anon_ModuleReference]
  }
}

