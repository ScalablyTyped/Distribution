package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import typings.typeorm.anon.Synchronize
import typings.typeorm.indexOptionsMod.IndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("typeorm/browser/decorator/Index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Index(): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Index")().asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(fields: js.Array[String]): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Index")(fields.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(fields: js.Array[String], options: IndexOptions): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Index")(fields.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]],
    options: IndexOptions
  ): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(name: String): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(name: String, fields: js.Array[String]): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(name: String, fields: js.Array[String], options: IndexOptions): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]
  ): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]],
    options: IndexOptions
  ): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(name: String, options: Synchronize): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(name: String, options: IndexOptions): ClassDecorator & PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Index")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator & PropertyDecorator]
  @scala.inline
  def Index(options: IndexOptions): ClassDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Index")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator & PropertyDecorator]
}
