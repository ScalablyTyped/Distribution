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
import typings.typeorm.typeormStrings.`enum`
import typings.typeorm.typeormStrings.`simple-enum`
import typings.typeorm.typeormStrings.hstore
import typings.typeorm.typeormStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("typeorm/browser/decorator/columns/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Column(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")().asInstanceOf[PropertyDecorator]
  inline def Column(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: SimpleColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: SpatialColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: SpatialColumnType, options: ColumnCommonOptions & SpatialColumnOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithLengthColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions & ColumnWithLengthOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithPrecisionColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions & ColumnNumericOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithWidthColumnType): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions & ColumnWithWidthOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Column_enum(`type`: `enum`): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column_enum(`type`: `enum`, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Column_hstore(`type`: hstore): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column_hstore(`type`: hstore, options: ColumnCommonOptions & ColumnHstoreOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Column_set(`type`: set): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column_set(`type`: set, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions & ColumnEnumOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Column")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
