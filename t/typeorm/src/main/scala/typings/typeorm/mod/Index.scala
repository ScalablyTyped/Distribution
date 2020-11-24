package typings.typeorm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import typings.typeorm.anon.Synchronize
import typings.typeorm.optionsIndexOptionsMod.IndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Index")
@js.native
object Index extends js.Object {
  
  def apply(): ClassDecorator with PropertyDecorator = js.native
  def apply(fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def apply(fields: js.Array[String], options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def apply(
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[scala.Double]]
  ): ClassDecorator with PropertyDecorator = js.native
  def apply(
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[scala.Double]],
    options: IndexOptions
  ): ClassDecorator with PropertyDecorator = js.native
  def apply(name: String): ClassDecorator with PropertyDecorator = js.native
  def apply(name: String, fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def apply(name: String, fields: js.Array[String], options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def apply(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[scala.Double]]
  ): ClassDecorator with PropertyDecorator = js.native
  def apply(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[scala.Double]],
    options: IndexOptions
  ): ClassDecorator with PropertyDecorator = js.native
  def apply(name: String, options: Synchronize): ClassDecorator with PropertyDecorator = js.native
  def apply(name: String, options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def apply(options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
}
