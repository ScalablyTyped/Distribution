package typings.typeorm

import typings.std.Date
import typings.typeorm.typingsMod.ObjectID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/repository/EntityId", JSImport.Namespace)
@js.native
object entityIdMod extends js.Object {
  
  type EntityId = String | Double | Date | ObjectID
}
