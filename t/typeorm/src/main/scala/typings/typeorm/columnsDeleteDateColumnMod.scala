package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsDeleteDateColumnMod {
  
  @JSImport("typeorm/decorator/columns/DeleteDateColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DeleteDateColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteDateColumn")().asInstanceOf[PropertyDecorator]
  inline def DeleteDateColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteDateColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
