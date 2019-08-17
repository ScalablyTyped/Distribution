package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLanguageUtilsMod {
  import typings.typescript.typescriptMod.Node
  import typings.typescript.typescriptMod.SyntaxKind

  type FilterCallback = js.Function1[/* node */ Node, Boolean]
  type ForEachCommentCallback = js.Function3[/* fullText */ String, /* kind */ SyntaxKind, /* pos */ TokenPosition, Unit]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* pos */ TokenPosition, 
    /* parent */ Node, 
    Unit
  ]
}
