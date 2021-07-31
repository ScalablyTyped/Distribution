package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedAccessTypeNode
  extends StObject
     with TypeNode {
  
  val indexType: TypeNode = js.native
  
  @JSName("kind")
  val kind_IndexedAccessTypeNode: typings.typescript.mod.SyntaxKind.IndexedAccessType = js.native
  
  val objectType: TypeNode = js.native
}
