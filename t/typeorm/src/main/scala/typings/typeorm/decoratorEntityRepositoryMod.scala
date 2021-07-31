package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.entitySchemaEntitySchemaMod.EntitySchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorEntityRepositoryMod {
  
  @JSImport("typeorm/decorator/EntityRepository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def EntityRepository(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("EntityRepository")().asInstanceOf[ClassDecorator]
  @scala.inline
  def EntityRepository(entity: js.Function): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("EntityRepository")(entity.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  @scala.inline
  def EntityRepository(entity: EntitySchema[js.Any]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("EntityRepository")(entity.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
