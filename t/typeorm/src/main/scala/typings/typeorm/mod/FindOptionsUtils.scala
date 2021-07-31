package typings.typeorm.mod

import typings.std.Partial
import typings.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typings.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "FindOptionsUtils")
@js.native
class FindOptionsUtils ()
  extends typings.typeorm.findOptionsFindOptionsUtilsMod.FindOptionsUtils
/* static members */
object FindOptionsUtils {
  
  @JSImport("typeorm", "FindOptionsUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies give find many options to the given query builder.
    */
  @scala.inline
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  @scala.inline
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T], options: Partial[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  @scala.inline
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFindManyOptionsOrConditionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  
  /**
    * Applies give find options to the given query builder.
    */
  @scala.inline
  def applyOptionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  @scala.inline
  def applyOptionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  @scala.inline
  def applyOptionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindOneOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptionsToQueryBuilder")(qb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]]
  
  /**
    * Adds joins for all relations and sub-relations of the given relations provided in the find options.
    */
  @scala.inline
  def applyRelationsRecursively(
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[js.Any],
    allRelations: js.Array[String],
    alias: String,
    metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata,
    prefix: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRelationsRecursively")(qb.asInstanceOf[js.Any], allRelations.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Checks if given object is really instance of FindOptions interface.
    */
  @scala.inline
  def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFindManyOptionsAlias")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Checks if given object is really instance of FindManyOptions interface.
    */
  @scala.inline
  def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFindManyOptions")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean]
  
  /**
    * Checks if given object is really instance of FindOneOptions interface.
    */
  @scala.inline
  def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFindOneOptions")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean]
  
  @scala.inline
  def joinEagerRelations(
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[js.Any],
    alias: String,
    metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("joinEagerRelations")(qb.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
