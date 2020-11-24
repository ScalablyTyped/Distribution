package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.mod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/relations/RelationId", JSImport.Namespace)
@js.native
object relationsRelationIdMod extends js.Object {
  
  def RelationId[T](relation: String): PropertyDecorator = js.native
  def RelationId[T](
    relation: String,
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationId[T](relation: String, alias: String): PropertyDecorator = js.native
  def RelationId[T](
    relation: String,
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationId[T](relation: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def RelationId[T](
    relation: js.Function1[/* object */ T, _],
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationId[T](relation: js.Function1[/* object */ T, _], alias: String): PropertyDecorator = js.native
  def RelationId[T](
    relation: js.Function1[/* object */ T, _],
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
}
