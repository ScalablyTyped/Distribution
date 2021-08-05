package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.columnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionColumnMod {
  
  @JSImport("typeorm/browser/decorator/columns/VersionColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def VersionColumn(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VersionColumn")().asInstanceOf[PropertyDecorator]
  inline def VersionColumn(options: ColumnOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VersionColumn")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
