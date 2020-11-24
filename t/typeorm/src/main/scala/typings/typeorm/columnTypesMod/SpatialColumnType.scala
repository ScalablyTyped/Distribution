package typings.typeorm.columnTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typeorm.typeormStrings.geometry
  - typings.typeorm.typeormStrings.geography
  - typings.typeorm.typeormStrings.st_geometry
  - typings.typeorm.typeormStrings.st_point
*/
trait SpatialColumnType extends _ColumnType
object SpatialColumnType {
  
  @scala.inline
  def geography: typings.typeorm.typeormStrings.geography = "geography".asInstanceOf[typings.typeorm.typeormStrings.geography]
  
  @scala.inline
  def geometry: typings.typeorm.typeormStrings.geometry = "geometry".asInstanceOf[typings.typeorm.typeormStrings.geometry]
  
  @scala.inline
  def st_geometry: typings.typeorm.typeormStrings.st_geometry = "st_geometry".asInstanceOf[typings.typeorm.typeormStrings.st_geometry]
  
  @scala.inline
  def st_point: typings.typeorm.typeormStrings.st_point = "st_point".asInstanceOf[typings.typeorm.typeormStrings.st_point]
}
