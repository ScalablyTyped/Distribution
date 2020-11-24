package typings.typeorm.mod

import typings.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "getMongoRepository")
@js.native
object getMongoRepository extends js.Object {
  
  def apply[Entity](entityClass: EntityTarget[Entity]): typings.typeorm.repositoryMongoRepositoryMod.MongoRepository[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity], connectionName: String): typings.typeorm.repositoryMongoRepositoryMod.MongoRepository[Entity] = js.native
}
