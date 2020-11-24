package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/MetadataWithSuchNameAlreadyExistsError", JSImport.Namespace)
@js.native
object errorMetadataWithSuchNameAlreadyExistsErrorMod extends js.Object {
  
  @js.native
  class MetadataWithSuchNameAlreadyExistsError protected () extends Error {
    def this(metadataType: String, name: String) = this()
  }
}
