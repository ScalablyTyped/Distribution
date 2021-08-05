package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.commonObjectTypeMod.ObjectType
import typings.typeorm.optionsRelationOptionsMod.RelationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationsManyToOneMod {
  
  @JSImport("typeorm/decorator/relations/ManyToOne", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ManyToOne[T](typeFunctionOrTarget: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, js.Any]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: String, inverseSide: Unit, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](typeFunctionOrTarget: js.Function1[js.UndefOr[js.Any], ObjectType[T]]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: Unit,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToOne")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
