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
import typings.typeorm.typeormStrings.`enum`
import typings.typeorm.typeormStrings.`simple-enum`
import typings.typeorm.typeormStrings.hstore
import typings.typeorm.typeormStrings.set
import typings.typeorm.typesColumnTypesMod.SimpleColumnType
import typings.typeorm.typesColumnTypesMod.SpatialColumnType
import typings.typeorm.typesColumnTypesMod.WithLengthColumnType
import typings.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typings.typeorm.typesColumnTypesMod.WithWidthColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsColumnMod {
  
  @JSImport("typeorm/decorator/columns/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Column(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: SimpleColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: SpatialColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: SpatialColumnType, options: ColumnCommonOptions & SpatialColumnOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithLengthColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions & ColumnWithLengthOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithPrecisionColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions & ColumnNumericOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithWidthColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions & ColumnWithWidthOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def Column_enum(`type`: `enum`): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column_enum(`type`: `enum`, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def Column_hstore(`type`: hstore): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column_hstore(`type`: hstore, options: ColumnCommonOptions & ColumnHstoreOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def Column_set(`type`: set): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column_set(`type`: set, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
