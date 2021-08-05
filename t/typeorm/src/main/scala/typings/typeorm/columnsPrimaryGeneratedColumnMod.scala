package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsPrimaryGeneratedColumnNumericOptionsMod.PrimaryGeneratedColumnNumericOptions
import typings.typeorm.optionsPrimaryGeneratedColumnUUIDOptionsMod.PrimaryGeneratedColumnUUIDOptions
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsPrimaryGeneratedColumnMod {
  
  @JSImport("typeorm/decorator/columns/PrimaryGeneratedColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PrimaryGeneratedColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")().asInstanceOf[PropertyDecorator]
  inline def PrimaryGeneratedColumn(options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def PrimaryGeneratedColumn_increment(strategy: increment): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def PrimaryGeneratedColumn_increment(strategy: increment, options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def PrimaryGeneratedColumn_rowid(strategy: rowid): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def PrimaryGeneratedColumn_rowid(strategy: rowid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def PrimaryGeneratedColumn_uuid(strategy: uuid): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def PrimaryGeneratedColumn_uuid(strategy: uuid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("PrimaryGeneratedColumn")(strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
