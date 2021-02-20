package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.objectTypeMod.ObjectType
import typings.typeorm.relationOptionsMod.RelationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneToManyMod {
  
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _]
  ): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/relations/OneToMany", "OneToMany")
  @js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
}
