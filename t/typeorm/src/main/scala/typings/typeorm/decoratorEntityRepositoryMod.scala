package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.entitySchemaEntitySchemaMod.EntitySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/EntityRepository", JSImport.Namespace)
@js.native
object decoratorEntityRepositoryMod extends js.Object {
  
  def EntityRepository(): ClassDecorator = js.native
  def EntityRepository(entity: js.Function): ClassDecorator = js.native
  def EntityRepository(entity: EntitySchema[_]): ClassDecorator = js.native
}
