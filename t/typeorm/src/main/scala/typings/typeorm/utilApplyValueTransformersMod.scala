package typings.typeorm

import typings.typeorm.optionsValueTransformerMod.ValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/util/ApplyValueTransformers", JSImport.Namespace)
@js.native
object utilApplyValueTransformersMod extends js.Object {
  
  @js.native
  class ApplyValueTransformers () extends js.Object
  /* static members */
  @js.native
  object ApplyValueTransformers extends js.Object {
    
    def transformFrom(transformer: js.Array[ValueTransformer], databaseValue: js.Any): js.Any = js.native
    def transformFrom(transformer: ValueTransformer, databaseValue: js.Any): js.Any = js.native
    
    def transformTo(transformer: js.Array[ValueTransformer], entityValue: js.Any): js.Any = js.native
    def transformTo(transformer: ValueTransformer, entityValue: js.Any): js.Any = js.native
  }
}
