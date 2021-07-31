package typings.typeorm

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  @JSImport("typeorm/browser/decorator/Check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Check(expression: String): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Check")(expression.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Check(name: String, expression: String): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(name.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
}
