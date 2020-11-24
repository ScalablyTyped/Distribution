package typings.typeorm.browserMod

import typings.std.PropertyDecorator
import typings.typeorm.objectTypeMod.ObjectType
import typings.typeorm.relationOptionsMod.RelationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ManyToOne")
@js.native
object ManyToOne extends js.Object {
  
  def apply[T](typeFunctionOrTarget: String): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: String, inverseSide: js.UndefOr[scala.Nothing], options: RelationOptions): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: String, options: RelationOptions): PropertyDecorator = js.native
  def apply[T](typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]]): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.UndefOr[scala.Nothing],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _]
  ): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def apply[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    options: RelationOptions
  ): PropertyDecorator = js.native
}
