package typings.typeorm.mod

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.typesColumnTypesMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "PrimaryColumn")
@js.native
object PrimaryColumn extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: js.UndefOr[ColumnType], options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: ColumnType): PropertyDecorator = js.native
}
