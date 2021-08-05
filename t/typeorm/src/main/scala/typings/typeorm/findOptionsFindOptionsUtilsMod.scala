package typings.typeorm

import typings.std.Partial
import typings.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typings.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findOptionsFindOptionsUtilsMod {
  
  @JSImport("typeorm/find-options/FindOptionsUtils", "FindOptionsUtils")
  @js.native
  class FindOptionsUtils () extends StObject
  /* static members */
  object FindOptionsUtils {
    
    @JSImport("typeorm/find-options/FindOptionsUtils", "FindOptionsUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Applies give find many options to the given query builder.
      */
    inline def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any]).asInstanceOf[SelectQueryBuilder[T]]
    inline def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: Partial[T]): SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectQueryBuilder[T]]
    inline def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectQueryBuilder[T]]
    
    /**
      * Applies give find options to the given query builder.
      */
    inline def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any]).asInstanceOf[SelectQueryBuilder[T]]
    inline def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectQueryBuilder[T]]
    inline def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindOneOptions[T]): SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectQueryBuilder[T]]
    
    /**
      * Adds joins for all relations and sub-relations of the given relations provided in the find options.
      */
    inline def applyRelationsRecursively(
      qb: SelectQueryBuilder[js.Any],
      allRelations: js.Array[String],
      alias: String,
      metadata: EntityMetadata,
      prefix: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRelationsRecursively")(qb.asInstanceOf[js.Any], allRelations.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Checks if given object is really instance of FindOptions interface.
      */
    inline def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFindManyOptionsAlias")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /**
      * Checks if given object is really instance of FindManyOptions interface.
      */
    inline def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFindManyOptions")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean]
    
    /**
      * Checks if given object is really instance of FindOneOptions interface.
      */
    inline def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFindOneOptions")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean]
    
    inline def joinEagerRelations(qb: SelectQueryBuilder[js.Any], alias: String, metadata: EntityMetadata): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("joinEagerRelations")(qb.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
