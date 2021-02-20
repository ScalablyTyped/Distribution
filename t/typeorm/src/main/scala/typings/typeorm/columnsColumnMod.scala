package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.optionsColumnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typings.typeorm.optionsColumnEnumOptionsMod.ColumnEnumOptions
import typings.typeorm.optionsColumnHstoreOptionsMod.ColumnHstoreOptions
import typings.typeorm.optionsColumnNumericOptionsMod.ColumnNumericOptions
import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.optionsColumnWithLengthOptionsMod.ColumnWithLengthOptions
import typings.typeorm.optionsColumnWithWidthOptionsMod.ColumnWithWidthOptions
import typings.typeorm.optionsSpatialColumnOptionsMod.SpatialColumnOptions
import typings.typeorm.typeormStrings.`simple-enum`
import typings.typeorm.typeormStrings.enum
import typings.typeorm.typeormStrings.hstore
import typings.typeorm.typeormStrings.set
import typings.typeorm.typesColumnTypesMod.SimpleColumnType
import typings.typeorm.typesColumnTypesMod.SpatialColumnType
import typings.typeorm.typesColumnTypesMod.WithLengthColumnType
import typings.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typings.typeorm.typesColumnTypesMod.WithWidthColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsColumnMod {
  
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(options: ColumnOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SimpleColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SpatialColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithLengthColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithWidthColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_enum(`type`: enum): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_enum(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_hstore(`type`: hstore): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_hstore(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_set(`type`: set): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_set(`type`: set, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
