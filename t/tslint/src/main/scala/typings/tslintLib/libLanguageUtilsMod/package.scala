package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLanguageUtilsMod {
  type FilterCallback = js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  type ForEachCommentCallback = js.Function3[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.tsNs.SyntaxKind, 
    /* pos */ TokenPosition, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.tsNs.SyntaxKind, 
    /* pos */ TokenPosition, 
    /* parent */ typescriptLib.typescriptMod.tsNs.Node, 
    scala.Unit
  ]
}
