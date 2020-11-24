package typings.typeorm

import typings.std.Date
import typings.typeorm.mongodbTypingsMod.ObjectID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/repository/EntityId", JSImport.Namespace)
@js.native
object repositoryEntityIdMod extends js.Object {
  
  type EntityId = String | Double | Date | ObjectID
}
