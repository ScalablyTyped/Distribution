package typings.typeorm.browserMod

import typings.std.PropertyDecorator
import typings.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.columnHstoreOptionsMod.ColumnHstoreOptions
import typings.typeorm.typeormStrings.hstore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Column")
@js.native
object Column_hstore extends js.Object {
  
  def apply(`type`: hstore): PropertyDecorator = js.native
  def apply(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
}
