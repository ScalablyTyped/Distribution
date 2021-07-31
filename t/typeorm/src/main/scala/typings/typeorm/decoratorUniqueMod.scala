package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorUniqueMod {
  
  @JSImport("typeorm/decorator/Unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Unique(fields: js.Array[String]): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Unique")(fields.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Unique(fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Unique")(fields.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Unique(name: String, fields: js.Array[String]): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Unique")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Unique(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]
  ): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Unique")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
}
