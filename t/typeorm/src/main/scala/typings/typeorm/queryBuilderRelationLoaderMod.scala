package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.mod.Connection
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderRelationLoaderMod {
  
  @JSImport("typeorm/query-builder/RelationLoader", "RelationLoader")
  @js.native
  class RelationLoader protected () extends StObject {
    def this(connection: Connection) = this()
    
    var connection: js.Any = js.native
    
    /**
      * Wraps given entity and creates getters/setters for its given relation
      * to be able to lazily load data when accessing this relation.
      */
    def enableLazyLoad(relation: RelationMetadata, entity: ObjectLiteral): Unit = js.native
    def enableLazyLoad(relation: RelationMetadata, entity: ObjectLiteral, queryRunner: QueryRunner): Unit = js.native
    
    def load(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral]): js.Promise[js.Array[js.Any]] = js.native
    def load(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral], queryRunner: QueryRunner): js.Promise[js.Array[js.Any]] = js.native
    /**
      * Loads relation data for the given entity and its relation.
      */
    def load(relation: RelationMetadata, entityOrEntities: ObjectLiteral): js.Promise[js.Array[js.Any]] = js.native
    def load(relation: RelationMetadata, entityOrEntities: ObjectLiteral, queryRunner: QueryRunner): js.Promise[js.Array[js.Any]] = js.native
    
    def loadManyToManyNotOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral]): js.Promise[js.Any] = js.native
    def loadManyToManyNotOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral], queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    /**
      * Loads data for many-to-many not owner relations.
      *
      * SELECT post
      * FROM post post
      * INNER JOIN post_categories post_categories
      * ON post_categories.postId = post.id
      * AND post_categories.categoryId = post_categories.categoryId
      */
    def loadManyToManyNotOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral): js.Promise[js.Any] = js.native
    def loadManyToManyNotOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral, queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    
    def loadManyToManyOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral]): js.Promise[js.Any] = js.native
    def loadManyToManyOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral], queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    /**
      * Loads data for many-to-many owner relations.
      *
      * SELECT category
      * FROM category category
      * INNER JOIN post_categories post_categories
      * ON post_categories.postId = :postId
      * AND post_categories.categoryId = category.id
      */
    def loadManyToManyOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral): js.Promise[js.Any] = js.native
    def loadManyToManyOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral, queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    
    def loadManyToOneOrOneToOneOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral]): js.Promise[js.Any] = js.native
    def loadManyToOneOrOneToOneOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral], queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    /**
      * Loads data for many-to-one and one-to-one owner relations.
      *
      * (ow) post.category<=>category.post
      * loaded: category from post
      * example: SELECT category.id AS category_id, category.name AS category_name FROM category category
      *              INNER JOIN post Post ON Post.category=category.id WHERE Post.id=1
      */
    def loadManyToOneOrOneToOneOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral): js.Promise[js.Any] = js.native
    def loadManyToOneOrOneToOneOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral, queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    
    def loadOneToManyOrOneToOneNotOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral]): js.Promise[js.Any] = js.native
    def loadOneToManyOrOneToOneNotOwner(relation: RelationMetadata, entityOrEntities: js.Array[ObjectLiteral], queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    /**
      * Loads data for one-to-many and one-to-one not owner relations.
      *
      * SELECT post
      * FROM post post
      * WHERE post.[joinColumn.name] = entity[joinColumn.referencedColumn]
      */
    def loadOneToManyOrOneToOneNotOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral): js.Promise[js.Any] = js.native
    def loadOneToManyOrOneToOneNotOwner(relation: RelationMetadata, entityOrEntities: ObjectLiteral, queryRunner: QueryRunner): js.Promise[js.Any] = js.native
  }
}
