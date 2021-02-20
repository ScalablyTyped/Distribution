package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasCitextColumns extends StObject {
  
  var hasCitextColumns: Boolean = js.native
  
  var hasCubeColumns: Boolean = js.native
  
  var hasExclusionConstraints: Boolean = js.native
  
  var hasExtensions: Boolean = js.native
  
  var hasGeometryColumns: Boolean = js.native
  
  var hasHstoreColumns: Boolean = js.native
  
  var hasLtreeColumns: Boolean = js.native
  
  var hasUuidColumns: Boolean = js.native
}
object HasCitextColumns {
  
  @scala.inline
  def apply(
    hasCitextColumns: Boolean,
    hasCubeColumns: Boolean,
    hasExclusionConstraints: Boolean,
    hasExtensions: Boolean,
    hasGeometryColumns: Boolean,
    hasHstoreColumns: Boolean,
    hasLtreeColumns: Boolean,
    hasUuidColumns: Boolean
  ): HasCitextColumns = {
    val __obj = js.Dynamic.literal(hasCitextColumns = hasCitextColumns.asInstanceOf[js.Any], hasCubeColumns = hasCubeColumns.asInstanceOf[js.Any], hasExclusionConstraints = hasExclusionConstraints.asInstanceOf[js.Any], hasExtensions = hasExtensions.asInstanceOf[js.Any], hasGeometryColumns = hasGeometryColumns.asInstanceOf[js.Any], hasHstoreColumns = hasHstoreColumns.asInstanceOf[js.Any], hasLtreeColumns = hasLtreeColumns.asInstanceOf[js.Any], hasUuidColumns = hasUuidColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasCitextColumns]
  }
  
  @scala.inline
  implicit class HasCitextColumnsMutableBuilder[Self <: HasCitextColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasCitextColumns(value: Boolean): Self = StObject.set(x, "hasCitextColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCubeColumns(value: Boolean): Self = StObject.set(x, "hasCubeColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExclusionConstraints(value: Boolean): Self = StObject.set(x, "hasExclusionConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExtensions(value: Boolean): Self = StObject.set(x, "hasExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasGeometryColumns(value: Boolean): Self = StObject.set(x, "hasGeometryColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHstoreColumns(value: Boolean): Self = StObject.set(x, "hasHstoreColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLtreeColumns(value: Boolean): Self = StObject.set(x, "hasLtreeColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUuidColumns(value: Boolean): Self = StObject.set(x, "hasUuidColumns", value.asInstanceOf[js.Any])
  }
}
