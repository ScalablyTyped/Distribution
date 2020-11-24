package typings.typeorm.browserMod

import typings.std.PropertyDecorator
import typings.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.columnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typings.typeorm.columnNumericOptionsMod.ColumnNumericOptions
import typings.typeorm.columnOptionsMod.ColumnOptions
import typings.typeorm.columnTypesMod.SimpleColumnType
import typings.typeorm.columnTypesMod.SpatialColumnType
import typings.typeorm.columnTypesMod.WithLengthColumnType
import typings.typeorm.columnTypesMod.WithPrecisionColumnType
import typings.typeorm.columnTypesMod.WithWidthColumnType
import typings.typeorm.columnWithLengthOptionsMod.ColumnWithLengthOptions
import typings.typeorm.columnWithWidthOptionsMod.ColumnWithWidthOptions
import typings.typeorm.spatialColumnOptionsMod.SpatialColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Column")
@js.native
object Column extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  def apply(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  def apply(`type`: SimpleColumnType): PropertyDecorator = js.native
  def apply(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  def apply(`type`: SpatialColumnType): PropertyDecorator = js.native
  def apply(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  def apply(`type`: WithLengthColumnType): PropertyDecorator = js.native
  def apply(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  def apply(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  def apply(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  def apply(`type`: WithWidthColumnType): PropertyDecorator = js.native
  def apply(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
}
