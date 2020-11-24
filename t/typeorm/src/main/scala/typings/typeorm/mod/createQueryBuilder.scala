package typings.typeorm.mod

import typings.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "createQueryBuilder")
@js.native
object createQueryBuilder extends js.Object {
  
  def apply[Entity](): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](
    entityClass: js.UndefOr[EntityTarget[Entity]],
    alias: js.UndefOr[scala.Nothing],
    connectionName: String
  ): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: js.UndefOr[EntityTarget[Entity]], alias: String): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: js.UndefOr[EntityTarget[Entity]], alias: String, connectionName: String): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity]): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
}
