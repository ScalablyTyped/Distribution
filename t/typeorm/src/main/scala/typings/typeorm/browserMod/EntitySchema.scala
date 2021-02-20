package typings.typeorm.browserMod

import typings.typeorm.entitySchemaOptionsMod.EntitySchemaOptions
import typings.typeorm.entityTargetMod._EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntitySchema")
@js.native
class EntitySchema[T] protected ()
  extends typings.typeorm.entitySchemaMod.EntitySchema[T]
     with _EntityTarget[T] {
  def this(options: EntitySchemaOptions[T]) = this()
}
