package typings.typeorm.anon

import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerationStrategy extends js.Object {
  
  var generationStrategy: js.UndefOr[increment | uuid | rowid] = js.native
  
  var isArray: js.UndefOr[Boolean] = js.native
  
  var isGenerated: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double | String] = js.native
  
  var precision: js.UndefOr[Double | Null] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[ColumnType] = js.native
}
object GenerationStrategy {
  
  @scala.inline
  def apply(): GenerationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerationStrategy]
  }
  
  @scala.inline
  implicit class GenerationStrategyOps[Self <: GenerationStrategy] (val x: Self) extends AnyVal {
    
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
    def setGenerationStrategy(value: increment | uuid | rowid): Self = this.set("generationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationStrategy: Self = this.set("generationStrategy", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    
    @scala.inline
    def setIsGenerated(value: Boolean): Self = this.set("isGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGenerated: Self = this.set("isGenerated", js.undefined)
    
    @scala.inline
    def setLength(value: Double | String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
