package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsCreateDateColumnMod {
  
  @JSImport("typeorm/decorator/columns/CreateDateColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def CreateDateColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDateColumn")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def CreateDateColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDateColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
