package typings.typeorm

import typings.typeorm.whereExpressionMod.WhereExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/Brackets", JSImport.Namespace)
@js.native
object bracketsMod extends js.Object {
  
  @js.native
  class Brackets protected () extends js.Object {
    /**
      * Given WHERE query builder that will build a WHERE expression that will be taken into brackets.
      */
    def this(whereFactory: js.Function1[/* qb */ WhereExpression, _]) = this()
    
    /**
      * WHERE expression that will be taken into brackets.
      */
    def whereFactory(qb: WhereExpression): js.Any = js.native
  }
}
