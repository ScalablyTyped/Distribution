package typings.typeorm

import typings.typeorm.anon.Entity
import typings.typeorm.browserMod.Connection
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/RelationIdLoader", JSImport.Namespace)
@js.native
object queryBuilderRelationIdLoaderMod extends js.Object {
  
  @js.native
  class RelationIdLoader protected () extends js.Object {
    def this(connection: Connection) = this()
    
    var connection: js.Any = js.native
    
    def load(relation: RelationMetadata, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    def load(
      relation: RelationMetadata,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    def load(relation: RelationMetadata, entities: js.Array[ObjectLiteral], relatedEntities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    /**
      * Loads relation ids of the given entity or entities.
      */
    def load(relation: RelationMetadata, entities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    def load(relation: RelationMetadata, entities: ObjectLiteral, relatedEntities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    def load(relation: RelationMetadata, entities: ObjectLiteral, relatedEntities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    def load(target: String, relation: String, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    def load(
      target: String,
      relation: String,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    def load(
      target: String,
      relation: String,
      entities: js.Array[ObjectLiteral],
      relatedEntities: ObjectLiteral
    ): js.Promise[js.Array[_]] = js.native
    def load(target: String, relation: String, entities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    def load(
      target: String,
      relation: String,
      entities: ObjectLiteral,
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    def load(target: String, relation: String, entities: ObjectLiteral, relatedEntities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    def load(target: js.Function, relation: String, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    def load(
      target: js.Function,
      relation: String,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    def load(
      target: js.Function,
      relation: String,
      entities: js.Array[ObjectLiteral],
      relatedEntities: ObjectLiteral
    ): js.Promise[js.Array[_]] = js.native
    /**
      * Loads relation ids of the given entity or entities.
      */
    def load(target: js.Function, relation: String, entities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    def load(
      target: js.Function,
      relation: String,
      entities: ObjectLiteral,
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    def load(target: js.Function, relation: String, entities: ObjectLiteral, relatedEntities: ObjectLiteral): js.Promise[js.Array[_]] = js.native
    
    /**
      * Loads relation ids of the given entities and maps them into the given entity property.
      async loadManyToManyRelationIdsAndMap(
      relation: RelationMetadata,
      entityOrEntities: ObjectLiteral|ObjectLiteral[],
      mapToEntityOrEntities: ObjectLiteral|ObjectLiteral[],
      propertyName: string
      ): Promise<void> {
      const relationIds = await this.loadManyToManyRelationIds(relation, entityOrEntities, mapToEntityOrEntities);
      const mapToEntities = mapToEntityOrEntities instanceof Array ? mapToEntityOrEntities : [mapToEntityOrEntities];
      const junctionMetadata = relation.junctionEntityMetadata!;
      const mainAlias = junctionMetadata.name;
      const columns = relation.isOwning ? junctionMetadata.inverseColumns : junctionMetadata.ownerColumns;
      const inverseColumns = relation.isOwning ? junctionMetadata.ownerColumns : junctionMetadata.inverseColumns;
      mapToEntities.forEach(mapToEntity => {
      mapToEntity[propertyName] = [];
      relationIds.forEach(relationId => {
      const match = inverseColumns.every(column => {
      return column.referencedColumn!.getEntityValue(mapToEntity) === relationId[mainAlias + "_" + column.propertyName];
      });
      if (match) {
      if (columns.length === 1) {
      mapToEntity[propertyName].push(relationId[mainAlias + "_" + columns[0].propertyName]);
      } else {
      const value = {};
      columns.forEach(column => {
      column.referencedColumn!.setEntityValue(value, relationId[mainAlias + "_" + column.propertyName]);
      });
      mapToEntity[propertyName].push(value);
      }
      }
      });
      });
      }*/
    /**
      * Loads relation ids for the many-to-many relation.
      */
    /* protected */ def loadForManyToMany(relation: RelationMetadata, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    /* protected */ def loadForManyToMany(
      relation: RelationMetadata,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    
    /**
      * Loads relation ids for the many-to-one and one-to-one owner relations.
      */
    /* protected */ def loadForManyToOneAndOneToOneOwner(relation: RelationMetadata, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    /* protected */ def loadForManyToOneAndOneToOneOwner(
      relation: RelationMetadata,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    
    /**
      * Loads relation ids for the one-to-many and one-to-one not owner relations.
      */
    /* protected */ def loadForOneToManyAndOneToOneNotOwner(relation: RelationMetadata, entities: js.Array[ObjectLiteral]): js.Promise[js.Array[_]] = js.native
    /* protected */ def loadForOneToManyAndOneToOneNotOwner(
      relation: RelationMetadata,
      entities: js.Array[ObjectLiteral],
      relatedEntities: js.Array[ObjectLiteral]
    ): js.Promise[js.Array[_]] = js.native
    
    /**
      * Loads relation ids of the given entities and groups them into the object with parent and children.
      *
      * todo: extract this method?
      */
    def loadManyToManyRelationIdsAndGroup[E1, E2](relation: RelationMetadata, entitiesOrEntities: E1): js.Promise[js.Array[Entity[E1, E2]]] = js.native
    def loadManyToManyRelationIdsAndGroup[E1, E2](relation: RelationMetadata, entitiesOrEntities: E1, relatedEntityOrEntities: E2): js.Promise[js.Array[Entity[E1, E2]]] = js.native
    def loadManyToManyRelationIdsAndGroup[E1, E2](relation: RelationMetadata, entitiesOrEntities: E1, relatedEntityOrEntities: js.Array[E2]): js.Promise[js.Array[Entity[E1, E2]]] = js.native
    def loadManyToManyRelationIdsAndGroup[E1, E2](relation: RelationMetadata, entitiesOrEntities: js.Array[E1]): js.Promise[js.Array[Entity[E1, E2]]] = js.native
    def loadManyToManyRelationIdsAndGroup[E1, E2](relation: RelationMetadata, entitiesOrEntities: js.Array[E1], relatedEntityOrEntities: E2): js.Promise[js.Array[Entity[E1, E2]]] = js.native
    def loadManyToManyRelationIdsAndGroup[E1, E2](
      relation: RelationMetadata,
      entitiesOrEntities: js.Array[E1],
      relatedEntityOrEntities: js.Array[E2]
    ): js.Promise[js.Array[Entity[E1, E2]]] = js.native
  }
}
