package typings.typeorm.mod

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.optionsColumnHstoreOptionsMod.ColumnHstoreOptions
import typings.typeorm.typeormStrings.hstore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Column")
@js.native
object Column_hstore extends js.Object {
  
  def apply(`type`: hstore): PropertyDecorator = js.native
  def apply(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
}
