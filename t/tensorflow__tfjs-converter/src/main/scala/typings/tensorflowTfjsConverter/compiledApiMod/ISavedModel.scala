package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISavedModel extends StObject {
  
  /** SavedModel metaGraphs */
  var metaGraphs: js.UndefOr[js.Array[IMetaGraphDef] | Null] = js.undefined
  
  /** SavedModel savedModelSchemaVersion */
  var savedModelSchemaVersion: js.UndefOr[Double | String | Null] = js.undefined
}
object ISavedModel {
  
  @scala.inline
  def apply(): ISavedModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISavedModel]
  }
  
  @scala.inline
  implicit class ISavedModelMutableBuilder[Self <: ISavedModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetaGraphs(value: js.Array[IMetaGraphDef]): Self = StObject.set(x, "metaGraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaGraphsNull: Self = StObject.set(x, "metaGraphs", null)
    
    @scala.inline
    def setMetaGraphsUndefined: Self = StObject.set(x, "metaGraphs", js.undefined)
    
    @scala.inline
    def setMetaGraphsVarargs(value: IMetaGraphDef*): Self = StObject.set(x, "metaGraphs", js.Array(value :_*))
    
    @scala.inline
    def setSavedModelSchemaVersion(value: Double | String): Self = StObject.set(x, "savedModelSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedModelSchemaVersionNull: Self = StObject.set(x, "savedModelSchemaVersion", null)
    
    @scala.inline
    def setSavedModelSchemaVersionUndefined: Self = StObject.set(x, "savedModelSchemaVersion", js.undefined)
  }
}
