package typings.typeorm

import typings.typeorm.queryBuilderWhereExpressionMod.WhereExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderBracketsMod {
  
  @JSImport("typeorm/query-builder/Brackets", "Brackets")
  @js.native
  class Brackets protected () extends StObject {
    /**
      * Given WHERE query builder that will build a WHERE expression that will be taken into brackets.
      */
    def this(whereFactory: js.Function1[/* qb */ WhereExpression, js.Any]) = this()
    
    /**
      * WHERE expression that will be taken into brackets.
      */
    def whereFactory(qb: WhereExpression): js.Any = js.native
  }
}
