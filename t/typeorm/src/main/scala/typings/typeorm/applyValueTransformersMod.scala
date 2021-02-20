package typings.typeorm

import typings.typeorm.valueTransformerMod.ValueTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyValueTransformersMod {
  
  @JSImport("typeorm/browser/util/ApplyValueTransformers", "ApplyValueTransformers")
  @js.native
  class ApplyValueTransformers () extends StObject
  /* static members */
  object ApplyValueTransformers {
    
    @JSImport("typeorm/browser/util/ApplyValueTransformers", "ApplyValueTransformers.transformFrom")
    @js.native
    def transformFrom(transformer: js.Array[ValueTransformer], databaseValue: js.Any): js.Any = js.native
    @JSImport("typeorm/browser/util/ApplyValueTransformers", "ApplyValueTransformers.transformFrom")
    @js.native
    def transformFrom(transformer: ValueTransformer, databaseValue: js.Any): js.Any = js.native
    
    @JSImport("typeorm/browser/util/ApplyValueTransformers", "ApplyValueTransformers.transformTo")
    @js.native
    def transformTo(transformer: js.Array[ValueTransformer], entityValue: js.Any): js.Any = js.native
    @JSImport("typeorm/browser/util/ApplyValueTransformers", "ApplyValueTransformers.transformTo")
    @js.native
    def transformTo(transformer: ValueTransformer, entityValue: js.Any): js.Any = js.native
  }
}
