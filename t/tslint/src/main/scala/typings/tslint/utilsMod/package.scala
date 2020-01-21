package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type FilterCallback = js.Function1[/* node */ typings.typescript.mod.Node, scala.Boolean]
  type ForEachCommentCallback = js.Function3[
    /* fullText */ java.lang.String, 
    /* kind */ typings.typescript.mod.SyntaxKind, 
    /* pos */ typings.tslint.utilsMod.TokenPosition, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typings.typescript.mod.SyntaxKind, 
    /* pos */ typings.tslint.utilsMod.TokenPosition, 
    /* parent */ typings.typescript.mod.Node, 
    scala.Unit
  ]
}
