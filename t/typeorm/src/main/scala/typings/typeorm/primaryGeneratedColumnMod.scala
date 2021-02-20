package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.primaryGeneratedColumnNumericOptionsMod.PrimaryGeneratedColumnNumericOptions
import typings.typeorm.primaryGeneratedColumnUUIDOptionsMod.PrimaryGeneratedColumnUUIDOptions
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryGeneratedColumnMod {
  
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn(): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn(options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_increment(strategy: increment): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_increment(strategy: increment, options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_rowid(strategy: rowid): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_rowid(strategy: rowid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_uuid(strategy: uuid): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_uuid(strategy: uuid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
}
