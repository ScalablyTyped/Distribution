package typings.typeorm.mod

import typings.std.Partial
import typings.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typings.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "FindOptionsUtils")
@js.native
class FindOptionsUtils ()
  extends typings.typeorm.findOptionsFindOptionsUtilsMod.FindOptionsUtils
/* static members */
object FindOptionsUtils {
  
  /**
    * Applies give find many options to the given query builder.
    */
  @JSImport("typeorm", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T], options: Partial[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Applies give find options to the given query builder.
    */
  @JSImport("typeorm", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindOneOptions[T]
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Adds joins for all relations and sub-relations of the given relations provided in the find options.
    */
  @JSImport("typeorm", "FindOptionsUtils.applyRelationsRecursively")
  @js.native
  def applyRelationsRecursively(
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[_],
    allRelations: js.Array[String],
    alias: String,
    metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata,
    prefix: String
  ): Unit = js.native
  
  /**
    * Checks if given object is really instance of FindOptions interface.
    */
  @JSImport("typeorm", "FindOptionsUtils.extractFindManyOptionsAlias")
  @js.native
  def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = js.native
  
  /**
    * Checks if given object is really instance of FindManyOptions interface.
    */
  @JSImport("typeorm", "FindOptionsUtils.isFindManyOptions")
  @js.native
  def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = js.native
  
  /**
    * Checks if given object is really instance of FindOneOptions interface.
    */
  @JSImport("typeorm", "FindOptionsUtils.isFindOneOptions")
  @js.native
  def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = js.native
  
  @JSImport("typeorm", "FindOptionsUtils.joinEagerRelations")
  @js.native
  def joinEagerRelations(
    qb: typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[_],
    alias: String,
    metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): Unit = js.native
}
