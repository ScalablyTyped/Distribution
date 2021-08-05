package typings.typeorm

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorExclusionMod {
  
  @JSImport("typeorm/decorator/Exclusion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Exclusion(expression: String): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclusion")(expression.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  inline def Exclusion(name: String, expression: String): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Exclusion")(name.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
}
