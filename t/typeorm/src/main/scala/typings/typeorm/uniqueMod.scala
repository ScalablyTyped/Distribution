package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/Unique", JSImport.Namespace)
@js.native
object uniqueMod extends js.Object {
  
  def Unique(fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def Unique(fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]): ClassDecorator with PropertyDecorator = js.native
  def Unique(name: String, fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def Unique(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]
  ): ClassDecorator with PropertyDecorator = js.native
}
