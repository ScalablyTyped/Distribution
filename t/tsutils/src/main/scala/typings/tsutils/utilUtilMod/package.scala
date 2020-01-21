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
  type ImportLike = typings.typescript.mod.ImportDeclaration | (typings.typescript.mod.ImportEqualsDeclaration with typings.tsutils.AnonModuleReference) | (typings.typescript.mod.ExportDeclaration with typings.tsutils.AnonModuleSpecifier) | (typings.typescript.mod.CallExpression with typings.tsutils.AnonArguments) | typings.typescript.mod.ImportTypeNode
}
