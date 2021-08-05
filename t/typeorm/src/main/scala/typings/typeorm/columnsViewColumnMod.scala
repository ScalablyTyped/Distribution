package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsViewColumnOptionsMod.ViewColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsViewColumnMod {
  
  @JSImport("typeorm/decorator/columns/ViewColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ViewColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewColumn")().asInstanceOf[PropertyDecorator]
  inline def ViewColumn(options: ViewColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
