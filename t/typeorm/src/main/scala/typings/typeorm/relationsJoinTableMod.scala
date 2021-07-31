package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.optionsJoinTableMultipleColumnsOptionsMod.JoinTableMultipleColumnsOptions
import typings.typeorm.optionsJoinTableOptionsMod.JoinTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationsJoinTableMod {
  
  @JSImport("typeorm/decorator/relations/JoinTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def JoinTable(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinTable")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def JoinTable(options: JoinTableMultipleColumnsOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinTable")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def JoinTable(options: JoinTableOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("JoinTable")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
