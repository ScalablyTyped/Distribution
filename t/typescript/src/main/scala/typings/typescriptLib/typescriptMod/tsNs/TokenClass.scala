package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSImport("typescript/ts", "TokenClass")
@js.native
object TokenClass extends js.Object {
  @js.native
  sealed trait Comment
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait Identifier
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait Keyword
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait NumberLiteral
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait Operator
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait Punctuation
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait RegExpLiteral
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait StringLiteral
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
  @js.native
  sealed trait Whitespace
    extends typescriptLib.typescriptMod.tsNs.TokenClass
  
}

