package typings.typeorm

import typings.typeorm.optionsValueTransformerMod.ValueTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilApplyValueTransformersMod {
  
  @JSImport("typeorm/util/ApplyValueTransformers", "ApplyValueTransformers")
  @js.native
  class ApplyValueTransformers () extends StObject
  /* static members */
  object ApplyValueTransformers {
    
    @JSImport("typeorm/util/ApplyValueTransformers", "ApplyValueTransformers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def transformFrom(transformer: js.Array[ValueTransformer], databaseValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFrom")(transformer.asInstanceOf[js.Any], databaseValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def transformFrom(transformer: ValueTransformer, databaseValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFrom")(transformer.asInstanceOf[js.Any], databaseValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def transformTo(transformer: js.Array[ValueTransformer], entityValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTo")(transformer.asInstanceOf[js.Any], entityValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def transformTo(transformer: ValueTransformer, entityValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTo")(transformer.asInstanceOf[js.Any], entityValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
