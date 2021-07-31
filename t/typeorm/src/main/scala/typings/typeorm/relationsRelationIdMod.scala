package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.mod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationsRelationIdMod {
  
  @JSImport("typeorm/decorator/relations/RelationId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def RelationId[T](relation: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](relation: String, alias: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](
    relation: String,
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](
    relation: String,
    alias: Unit,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](relation: js.Function1[/* object */ T, js.Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](relation: js.Function1[/* object */ T, js.Any], alias: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](
    relation: js.Function1[/* object */ T, js.Any],
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def RelationId[T](
    relation: js.Function1[/* object */ T, js.Any],
    alias: Unit,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("RelationId")(relation.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], queryBuilderFactory.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
