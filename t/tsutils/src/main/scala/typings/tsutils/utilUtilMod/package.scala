package typings.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typings.typescript.mod.CommentRange, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typings.typescript.mod.SyntaxKind, 
    /* range */ typings.typescript.mod.TextRange, 
    /* parent */ typings.typescript.mod.Node, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.ImportDeclaration
    - typings.tsutils.anon.ImportEqualsDeclarationmo
    - typings.tsutils.anon.ExportDeclarationmoduleSp
    - typings.tsutils.anon.CallExpressionexpressionT
    - typings.typescript.mod.ImportTypeNode
  */
  type ImportLike = typings.tsutils.utilUtilMod._ImportLike | typings.typescript.mod.ImportDeclaration | typings.typescript.mod.ImportTypeNode
}
