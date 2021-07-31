package typings.typeorm.anon

import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerationStrategy extends StObject {
  
  var generationStrategy: js.UndefOr[increment | uuid | rowid] = js.undefined
  
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var isGenerated: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double | String] = js.undefined
  
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ColumnType] = js.undefined
}
object GenerationStrategy {
  
  @scala.inline
  def apply(): GenerationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerationStrategy]
  }
  
  @scala.inline
  implicit class GenerationStrategyMutableBuilder[Self <: GenerationStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerationStrategy(value: increment | uuid | rowid): Self = StObject.set(x, "generationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationStrategyUndefined: Self = StObject.set(x, "generationStrategy", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    @scala.inline
    def setIsGenerated(value: Boolean): Self = StObject.set(x, "isGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGeneratedUndefined: Self = StObject.set(x, "isGenerated", js.undefined)
    
    @scala.inline
    def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
