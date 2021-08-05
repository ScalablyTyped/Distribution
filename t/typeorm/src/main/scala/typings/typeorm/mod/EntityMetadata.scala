package typings.typeorm.mod

import typings.typeorm.anon.SkipNulls
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "EntityMetadata")
@js.native
class EntityMetadata protected ()
  extends typings.typeorm.metadataEntityMetadataMod.EntityMetadata {
  def this(options: typings.typeorm.anon.Connection) = this()
}
/* static members */
object EntityMetadata {
  
  @JSImport("typeorm", "EntityMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a property paths for a given entity.
    */
  inline def createPropertyPath(metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata, entity: ObjectLiteral): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropertyPath")(metadata.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def createPropertyPath(
    metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata,
    entity: ObjectLiteral,
    prefix: String
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropertyPath")(metadata.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * Finds difference between two entity id maps.
    * Returns items that exist in the first array and absent in the second array.
    */
  inline def difference(firstIdMaps: js.Array[ObjectLiteral], secondIdMaps: js.Array[ObjectLiteral]): js.Array[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(firstIdMaps.asInstanceOf[js.Any], secondIdMaps.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectLiteral]]
  
  /**
    * Creates value map from the given values and columns.
    * Examples of usages are primary columns map and join columns map.
    */
  inline def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata]): js.UndefOr[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueMap")(entity.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ObjectLiteral]]
  inline def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata], options: SkipNulls): js.UndefOr[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueMap")(entity.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ObjectLiteral]]
}
