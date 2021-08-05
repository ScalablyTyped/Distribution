package typings.typeorm.anon

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import typings.typeorm.typesColumnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsGenerated extends StObject {
  
  var generationStrategy: js.UndefOr[increment | uuid | rowid] = js.undefined
  
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var isGenerated: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double | String] = js.undefined
  
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ColumnType] = js.undefined
}
object IsGenerated {
  
  inline def apply(): IsGenerated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsGenerated]
  }
  
  extension [Self <: IsGenerated](x: Self) {
    
    inline def setGenerationStrategy(value: increment | uuid | rowid): Self = StObject.set(x, "generationStrategy", value.asInstanceOf[js.Any])
    
    inline def setGenerationStrategyUndefined: Self = StObject.set(x, "generationStrategy", js.undefined)
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    inline def setIsGenerated(value: Boolean): Self = StObject.set(x, "isGenerated", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratedUndefined: Self = StObject.set(x, "isGenerated", js.undefined)
    
    inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
