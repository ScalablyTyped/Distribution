package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.entitySchemaMod.EntitySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/EntityRepository", JSImport.Namespace)
@js.native
object entityRepositoryMod extends js.Object {
  
  def EntityRepository(): ClassDecorator = js.native
  def EntityRepository(entity: js.Function): ClassDecorator = js.native
  def EntityRepository(entity: EntitySchema[_]): ClassDecorator = js.native
}
