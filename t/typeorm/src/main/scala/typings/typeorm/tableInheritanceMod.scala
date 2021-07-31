package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableInheritanceMod {
  
  @JSImport("typeorm/browser/decorator/entity/TableInheritance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def TableInheritance(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TableInheritance")().asInstanceOf[ClassDecorator]
  @scala.inline
  def TableInheritance(options: Column): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TableInheritance")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
