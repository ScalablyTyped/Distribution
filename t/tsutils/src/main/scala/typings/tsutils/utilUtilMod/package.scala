package typings.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  import typings.tsutils.Anon_Arguments
  import typings.tsutils.Anon_ModuleReference
  import typings.tsutils.Anon_ModuleSpecifier
  import typings.typescript.typescriptMod.CallExpression
  import typings.typescript.typescriptMod.CommentRange
  import typings.typescript.typescriptMod.ExportDeclaration
  import typings.typescript.typescriptMod.ImportDeclaration
  import typings.typescript.typescriptMod.ImportEqualsDeclaration
  import typings.typescript.typescriptMod.ImportTypeNode
  import typings.typescript.typescriptMod.Node
  import typings.typescript.typescriptMod.SyntaxKind
  import typings.typescript.typescriptMod.TextRange

  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[/* fullText */ String, /* comment */ CommentRange, Unit]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* range */ TextRange, 
    /* parent */ Node, 
    Unit
  ]
  type ImportLike = ImportDeclaration | (ImportEqualsDeclaration with Anon_ModuleReference) | (ExportDeclaration with Anon_ModuleSpecifier) | (CallExpression with Anon_Arguments) | ImportTypeNode
}
