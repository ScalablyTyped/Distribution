package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasCitextColumns extends js.Object {
  
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
  implicit class HasCitextColumnsOps[Self <: HasCitextColumns] (val x: Self) extends AnyVal {
    
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
    def setHasCitextColumns(value: Boolean): Self = this.set("hasCitextColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCubeColumns(value: Boolean): Self = this.set("hasCubeColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExclusionConstraints(value: Boolean): Self = this.set("hasExclusionConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExtensions(value: Boolean): Self = this.set("hasExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasGeometryColumns(value: Boolean): Self = this.set("hasGeometryColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHstoreColumns(value: Boolean): Self = this.set("hasHstoreColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLtreeColumns(value: Boolean): Self = this.set("hasLtreeColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUuidColumns(value: Boolean): Self = this.set("hasUuidColumns", value.asInstanceOf[js.Any])
  }
}
