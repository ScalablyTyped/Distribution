package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLanguageUtilsMod {
  type FilterCallback = js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  type ForEachCommentCallback = js.Function3[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.SyntaxKind, 
    /* pos */ TokenPosition, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.SyntaxKind, 
    /* pos */ TokenPosition, 
    /* parent */ typescriptLib.typescriptMod.Node, 
    scala.Unit
  ]
}
