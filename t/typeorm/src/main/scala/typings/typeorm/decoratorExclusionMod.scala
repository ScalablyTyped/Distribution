package typings.typeorm

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/Exclusion", JSImport.Namespace)
@js.native
object decoratorExclusionMod extends js.Object {
  
  def Exclusion(expression: String): ClassDecorator with PropertyDecorator = js.native
  def Exclusion(name: String, expression: String): ClassDecorator with PropertyDecorator = js.native
}
