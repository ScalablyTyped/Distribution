package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.anon.AttrParamMapper
import typings.tensorflowTfjsConverter.anon.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opMapperSchemaMod {
  
  object json {
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", "json")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", "json.definitions")
    @js.native
    def definitions: AttrParamMapper = js.native
    @scala.inline
    def definitions_=(x: AttrParamMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", "json.items")
    @js.native
    def items: Ref = js.native
    @scala.inline
    def items_=(x: Ref): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", "json.$schema")
    @js.native
    def schema: String = js.native
    
    @scala.inline
    def schema_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$schema")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/op_mapper_schema", "json.type")
    @js.native
    val `type`: String = js.native
  }
}
