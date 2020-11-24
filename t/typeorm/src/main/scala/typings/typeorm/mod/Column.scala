package typings.typeorm.mod

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.optionsColumnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typings.typeorm.optionsColumnNumericOptionsMod.ColumnNumericOptions
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.optionsColumnWithLengthOptionsMod.ColumnWithLengthOptions
import typings.typeorm.optionsColumnWithWidthOptionsMod.ColumnWithWidthOptions
import typings.typeorm.optionsSpatialColumnOptionsMod.SpatialColumnOptions
import typings.typeorm.typesColumnTypesMod.SimpleColumnType
import typings.typeorm.typesColumnTypesMod.SpatialColumnType
import typings.typeorm.typesColumnTypesMod.WithLengthColumnType
import typings.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typings.typeorm.typesColumnTypesMod.WithWidthColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Column")
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
