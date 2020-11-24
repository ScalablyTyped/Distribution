package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.anon.AttrParamMapper
import typings.tensorflowTfjsConverter.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", JSImport.Namespace)
@js.native
object opMapperSchemaMod extends js.Object {
  
  @js.native
  object json extends js.Object {
    
    @JSName("$schema")
    var $schema: String = js.native
    
    var definitions: AttrParamMapper = js.native
    
    var items: Ref = js.native
    
    var `type`: String = js.native
  }
}
