package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorGeneratedMod {
  
  @JSImport("typeorm/decorator/Generated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Generated(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Generated")().asInstanceOf[PropertyDecorator]
  
  inline def Generated_increment(strategy: increment): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Generated")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def Generated_rowid(strategy: rowid): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Generated")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def Generated_uuid(strategy: uuid): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Generated")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
