package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.joinColumnOptionsMod.JoinColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinColumnMod {
  
  @JSImport("typeorm/browser/decorator/relations/JoinColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JoinColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinColumn")().asInstanceOf[PropertyDecorator]
  inline def JoinColumn(options: js.Array[JoinColumnOptions]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def JoinColumn(options: JoinColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
