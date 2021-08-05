package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.entityOptionsMod.EntityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("typeorm/browser/decorator/entity/Entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Entity(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Entity")().asInstanceOf[ClassDecorator]
  inline def Entity(name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Entity")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def Entity(name: String, options: EntityOptions): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Entity")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  inline def Entity(name: Unit, options: EntityOptions): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Entity")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  inline def Entity(options: EntityOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Entity")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
