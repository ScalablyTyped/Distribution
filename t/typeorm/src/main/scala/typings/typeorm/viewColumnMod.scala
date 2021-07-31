package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.viewColumnOptionsMod.ViewColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewColumnMod {
  
  @JSImport("typeorm/browser/decorator/columns/ViewColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ViewColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewColumn")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def ViewColumn(options: ViewColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
