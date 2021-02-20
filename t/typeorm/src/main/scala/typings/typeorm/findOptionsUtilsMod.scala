package typings.typeorm

import typings.std.Partial
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.findManyOptionsMod.FindManyOptions
import typings.typeorm.findOneOptionsMod.FindOneOptions
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findOptionsUtilsMod {
  
  @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils")
  @js.native
  class FindOptionsUtils () extends StObject
  /* static members */
  object FindOptionsUtils {
    
    /**
      * Applies give find many options to the given query builder.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
    @js.native
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = js.native
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
    @js.native
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: Partial[T]): SelectQueryBuilder[T] = js.native
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
    @js.native
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = js.native
    
    /**
      * Applies give find options to the given query builder.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyOptionsToQueryBuilder")
    @js.native
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = js.native
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyOptionsToQueryBuilder")
    @js.native
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = js.native
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyOptionsToQueryBuilder")
    @js.native
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindOneOptions[T]): SelectQueryBuilder[T] = js.native
    
    /**
      * Adds joins for all relations and sub-relations of the given relations provided in the find options.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.applyRelationsRecursively")
    @js.native
    def applyRelationsRecursively(
      qb: SelectQueryBuilder[_],
      allRelations: js.Array[String],
      alias: String,
      metadata: EntityMetadata,
      prefix: String
    ): Unit = js.native
    
    /**
      * Checks if given object is really instance of FindOptions interface.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.extractFindManyOptionsAlias")
    @js.native
    def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = js.native
    
    /**
      * Checks if given object is really instance of FindManyOptions interface.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.isFindManyOptions")
    @js.native
    def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/browser/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = js.native
    
    /**
      * Checks if given object is really instance of FindOneOptions interface.
      */
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.isFindOneOptions")
    @js.native
    def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/browser/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = js.native
    
    @JSImport("typeorm/browser/find-options/FindOptionsUtils", "FindOptionsUtils.joinEagerRelations")
    @js.native
    def joinEagerRelations(qb: SelectQueryBuilder[_], alias: String, metadata: EntityMetadata): Unit = js.native
  }
}
