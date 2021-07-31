package typings.typeorm.browserMod

import typings.typeorm.anon.Args
import typings.typeorm.anon.SkipNulls
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntityMetadata")
@js.native
class EntityMetadata protected ()
  extends typings.typeorm.entityMetadataMod.EntityMetadata {
  def this(options: Args) = this()
}
/* static members */
object EntityMetadata {
  
  @JSImport("typeorm/browser", "EntityMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a property paths for a given entity.
    */
  @scala.inline
  def createPropertyPath(metadata: typings.typeorm.entityMetadataMod.EntityMetadata, entity: ObjectLiteral): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropertyPath")(metadata.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def createPropertyPath(metadata: typings.typeorm.entityMetadataMod.EntityMetadata, entity: ObjectLiteral, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropertyPath")(metadata.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * Finds difference between two entity id maps.
    * Returns items that exist in the first array and absent in the second array.
    */
  @scala.inline
  def difference(firstIdMaps: js.Array[ObjectLiteral], secondIdMaps: js.Array[ObjectLiteral]): js.Array[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(firstIdMaps.asInstanceOf[js.Any], secondIdMaps.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectLiteral]]
  
  /**
    * Creates value map from the given values and columns.
    * Examples of usages are primary columns map and join columns map.
    */
  @scala.inline
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata]): js.UndefOr[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueMap")(entity.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ObjectLiteral]]
  @scala.inline
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata], options: SkipNulls): js.UndefOr[ObjectLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueMap")(entity.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ObjectLiteral]]
}
