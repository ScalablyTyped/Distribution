package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsObjectIdColumnMod {
  
  @JSImport("typeorm/decorator/columns/ObjectIdColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ObjectIdColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIdColumn")().asInstanceOf[PropertyDecorator]
  inline def ObjectIdColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIdColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
