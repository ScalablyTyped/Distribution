package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsUpdateDateColumnMod {
  
  @JSImport("typeorm/decorator/columns/UpdateDateColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def UpdateDateColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateDateColumn")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def UpdateDateColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateDateColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
