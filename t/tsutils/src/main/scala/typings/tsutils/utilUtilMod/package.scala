package typings.tsutils

import typings.typescript.typescriptMod.CommentRange
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SyntaxKind
import typings.typescript.typescriptMod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[/* fullText */ String, /* comment */ CommentRange, Unit]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* range */ TextRange, 
    /* parent */ Node, 
    Unit
  ]
}
