package typings.typeorm.browserMod

import typings.typeorm.anon.Args
import typings.typeorm.anon.SkipNulls
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntityMetadata")
@js.native
class EntityMetadata protected ()
  extends typings.typeorm.entityMetadataMod.EntityMetadata {
  def this(options: Args) = this()
}
/* static members */
@JSImport("typeorm/browser", "EntityMetadata")
@js.native
object EntityMetadata extends js.Object {
  
  /**
    * Creates a property paths for a given entity.
    */
  def createPropertyPath(metadata: typings.typeorm.entityMetadataMod.EntityMetadata, entity: ObjectLiteral): js.Array[String] = js.native
  def createPropertyPath(metadata: typings.typeorm.entityMetadataMod.EntityMetadata, entity: ObjectLiteral, prefix: String): js.Array[String] = js.native
  
  /**
    * Finds difference between two entity id maps.
    * Returns items that exist in the first array and absent in the second array.
    */
  def difference(firstIdMaps: js.Array[ObjectLiteral], secondIdMaps: js.Array[ObjectLiteral]): js.Array[ObjectLiteral] = js.native
  
  /**
    * Creates value map from the given values and columns.
    * Examples of usages are primary columns map and join columns map.
    */
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata]): js.UndefOr[ObjectLiteral] = js.native
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata], options: SkipNulls): js.UndefOr[ObjectLiteral] = js.native
}
