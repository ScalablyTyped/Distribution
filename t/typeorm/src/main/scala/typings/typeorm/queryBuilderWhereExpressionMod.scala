package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.queryBuilderBracketsMod.Brackets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/WhereExpression", JSImport.Namespace)
@js.native
object queryBuilderWhereExpressionMod extends js.Object {
  
  @js.native
  trait WhereExpression extends js.Object {
    
    /**
      * Adds new AND WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def andWhere(subQuery: js.Function1[/* qb */ this.type, String]): this.type = js.native
    def andWhere(subQuery: js.Function1[/* qb */ this.type, String], parameters: ObjectLiteral): this.type = js.native
    /**
      * Adds new AND WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def andWhere(where: String): this.type = js.native
    def andWhere(where: String, parameters: ObjectLiteral): this.type = js.native
    /**
      * Adds new AND WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def andWhere(where: Brackets): this.type = js.native
    def andWhere(where: Brackets, parameters: ObjectLiteral): this.type = js.native
    
    /**
      * Adds new AND WHERE with conditions for the given ids.
      *
      * Ids are mixed.
      * It means if you have single primary key you can pass a simple id values, for example [1, 2, 3].
      * If you have multiple primary keys you need to pass object with property names and values specified,
      * for example [{ firstId: 1, secondId: 2 }, { firstId: 2, secondId: 3 }, ...]
      */
    def andWhereInIds(ids: js.Any): this.type = js.native
    def andWhereInIds(ids: js.Array[_]): this.type = js.native
    
    /**
      * Adds new OR WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def orWhere(subQuery: js.Function1[/* qb */ this.type, String]): this.type = js.native
    def orWhere(subQuery: js.Function1[/* qb */ this.type, String], parameters: ObjectLiteral): this.type = js.native
    /**
      * Adds new OR WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def orWhere(where: String): this.type = js.native
    def orWhere(where: String, parameters: ObjectLiteral): this.type = js.native
    /**
      * Adds new OR WHERE condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def orWhere(where: Brackets): this.type = js.native
    def orWhere(where: Brackets, parameters: ObjectLiteral): this.type = js.native
    
    /**
      * Adds new OR WHERE with conditions for the given ids.
      *
      * Ids are mixed.
      * It means if you have single primary key you can pass a simple id values, for example [1, 2, 3].
      * If you have multiple primary keys you need to pass object with property names and values specified,
      * for example [{ firstId: 1, secondId: 2 }, { firstId: 2, secondId: 3 }, ...]
      */
    def orWhereInIds(ids: js.Any): this.type = js.native
    def orWhereInIds(ids: js.Array[_]): this.type = js.native
    
    /**
      * Sets WHERE condition in the query builder.
      * If you had previously WHERE expression defined,
      * calling this function will override previously set WHERE conditions.
      * Additionally you can add parameters used in where expression.
      */
    def where(subQuery: js.Function1[/* qb */ this.type, String]): this.type = js.native
    def where(subQuery: js.Function1[/* qb */ this.type, String], parameters: ObjectLiteral): this.type = js.native
    /**
      * Sets WHERE condition in the query builder.
      * If you had previously WHERE expression defined,
      * calling this function will override previously set WHERE conditions.
      * Additionally you can add parameters used in where expression.
      */
    def where(where: String): this.type = js.native
    def where(where: String, parameters: ObjectLiteral): this.type = js.native
    /**
      * Sets WHERE condition in the query builder.
      * If you had previously WHERE expression defined,
      * calling this function will override previously set WHERE conditions.
      * Additionally you can add parameters used in where expression.
      */
    def where(where: js.Array[ObjectLiteral]): this.type = js.native
    def where(where: js.Array[ObjectLiteral], parameters: ObjectLiteral): this.type = js.native
    /**
      * Sets WHERE condition in the query builder.
      * If you had previously WHERE expression defined,
      * calling this function will override previously set WHERE conditions.
      * Additionally you can add parameters used in where expression.
      */
    def where(where: ObjectLiteral): this.type = js.native
    def where(where: ObjectLiteral, parameters: ObjectLiteral): this.type = js.native
    /**
      * Sets WHERE condition in the query builder.
      * If you had previously WHERE expression defined,
      * calling this function will override previously set WHERE conditions.
      * Additionally you can add parameters used in where expression.
      */
    def where(where: Brackets): this.type = js.native
    def where(where: Brackets, parameters: ObjectLiteral): this.type = js.native
    
    /**
      * Adds new AND WHERE with conditions for the given ids.
      *
      * Ids are mixed.
      * It means if you have single primary key you can pass a simple id values, for example [1, 2, 3].
      * If you have multiple primary keys you need to pass object with property names and values specified,
      * for example [{ firstId: 1, secondId: 2 }, { firstId: 2, secondId: 3 }, ...]
      */
    def whereInIds(ids: js.Any): this.type = js.native
    def whereInIds(ids: js.Array[_]): this.type = js.native
  }
}
