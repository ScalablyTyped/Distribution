package typings
package tsutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typescriptLib.typescriptMod.tsNs.CommentRange, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.tsNs.SyntaxKind, 
    /* range */ typescriptLib.typescriptMod.tsNs.TextRange, 
    /* parent */ typescriptLib.typescriptMod.tsNs.Node, 
    scala.Unit
  ]
  type StrictCompilerOption = tsutilsLib.tsutilsLibStrings.noImplicitAny | tsutilsLib.tsutilsLibStrings.noImplicitThis | tsutilsLib.tsutilsLibStrings.strictNullChecks | tsutilsLib.tsutilsLibStrings.strictFunctionTypes | tsutilsLib.tsutilsLibStrings.strictPropertyInitialization | tsutilsLib.tsutilsLibStrings.alwaysStrict
}
