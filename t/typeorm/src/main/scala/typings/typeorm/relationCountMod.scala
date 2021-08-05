package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.browserMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountMod {
  
  @JSImport("typeorm/browser/decorator/relations/RelationCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RelationCount[T](relation: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](relation: String, alias: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](
    relation: String,
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](
    relation: String,
    alias: Unit,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](relation: js.Function1[/* object */ T, js.Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](relation: js.Function1[/* object */ T, js.Any], alias: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](
    relation: js.Function1[/* object */ T, js.Any],
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def RelationCount[T](
    relation: js.Function1[/* object */ T, js.Any],
    alias: Unit,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationCount")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
