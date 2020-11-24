package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.browserMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/relations/RelationCount", JSImport.Namespace)
@js.native
object relationCountMod extends js.Object {
  
  def RelationCount[T](relation: String): PropertyDecorator = js.native
  def RelationCount[T](
    relation: String,
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationCount[T](relation: String, alias: String): PropertyDecorator = js.native
  def RelationCount[T](
    relation: String,
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationCount[T](relation: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def RelationCount[T](
    relation: js.Function1[/* object */ T, _],
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def RelationCount[T](relation: js.Function1[/* object */ T, _], alias: String): PropertyDecorator = js.native
  def RelationCount[T](
    relation: js.Function1[/* object */ T, _],
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
}
