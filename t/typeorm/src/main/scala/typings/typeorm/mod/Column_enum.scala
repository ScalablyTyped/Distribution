package typings.typeorm.mod

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.optionsColumnEnumOptionsMod.ColumnEnumOptions
import typings.typeorm.typeormStrings.enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Column")
@js.native
object Column_enum extends js.Object {
  
  def apply(`type`: enum): PropertyDecorator = js.native
  def apply(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
