package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block
  extends Statement
     with BlockLike {
  
  @JSName("kind")
  val kind_Block: typings.typescript.mod.SyntaxKind.Block = js.native
  
  val statements: NodeArray[Statement] = js.native
}
