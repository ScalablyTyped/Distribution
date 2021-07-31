package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.columnOptionsMod.ColumnOptions
import typings.typeorm.columnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryColumnMod {
  
  @JSImport("typeorm/browser/decorator/columns/PrimaryColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PrimaryColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryColumn")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def PrimaryColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def PrimaryColumn(`type`: Unit, options: ColumnOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryColumn")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def PrimaryColumn(`type`: ColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryColumn")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def PrimaryColumn(`type`: ColumnType, options: ColumnOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryColumn")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
