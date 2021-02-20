package typings.typeorm.browserMod

import typings.typeorm.whereExpressionMod.WhereExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Brackets")
@js.native
class Brackets protected ()
  extends typings.typeorm.bracketsMod.Brackets {
  /**
    * Given WHERE query builder that will build a WHERE expression that will be taken into brackets.
    */
  def this(whereFactory: js.Function1[/* qb */ WhereExpression, _]) = this()
}
