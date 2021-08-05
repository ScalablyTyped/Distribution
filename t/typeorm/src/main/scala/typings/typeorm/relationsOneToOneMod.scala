package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.commonObjectTypeMod.ObjectType
import typings.typeorm.optionsRelationOptionsMod.RelationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationsOneToOneMod {
  
  @JSImport("typeorm/decorator/relations/OneToOne", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def OneToOne[T](typeFunctionOrTarget: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, js.Any]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: String, inverseSide: Unit, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](typeFunctionOrTarget: js.Function1[js.UndefOr[js.Any], ObjectType[T]]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: Unit,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("OneToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
