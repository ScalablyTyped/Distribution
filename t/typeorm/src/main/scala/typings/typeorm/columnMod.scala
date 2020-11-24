package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.columnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typings.typeorm.columnEnumOptionsMod.ColumnEnumOptions
import typings.typeorm.columnHstoreOptionsMod.ColumnHstoreOptions
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
import typings.typeorm.typeormStrings.`simple-enum`
import typings.typeorm.typeormStrings.enum
import typings.typeorm.typeormStrings.hstore
import typings.typeorm.typeormStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/columns/Column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  
  def Column(): PropertyDecorator = js.native
  def Column(options: ColumnOptions): PropertyDecorator = js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  def Column(`type`: SimpleColumnType): PropertyDecorator = js.native
  def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  def Column(`type`: SpatialColumnType): PropertyDecorator = js.native
  def Column(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  def Column(`type`: WithLengthColumnType): PropertyDecorator = js.native
  def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  def Column(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  def Column(`type`: WithWidthColumnType): PropertyDecorator = js.native
  def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_enum(`type`: enum): PropertyDecorator = js.native
  @JSName("Column")
  def Column_enum(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_hstore(`type`: hstore): PropertyDecorator = js.native
  @JSName("Column")
  def Column_hstore(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_set(`type`: set): PropertyDecorator = js.native
  @JSName("Column")
  def Column_set(`type`: set, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = js.native
  @JSName("Column")
  def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
