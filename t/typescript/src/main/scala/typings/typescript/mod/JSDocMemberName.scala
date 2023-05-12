package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class#method reference in JSDoc */
@js.native
trait JSDocMemberName
  extends StObject
     with Node {
  
  @JSName("kind")
  val kind_JSDocMemberName: typings.typescript.mod.SyntaxKind.JSDocMemberName = js.native
  
  val left: EntityName | JSDocMemberName = js.native
  
  val right: Identifier = js.native
}
