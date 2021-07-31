package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalTypeNode
  extends StObject
     with TypeNode {
  
  val checkType: TypeNode = js.native
  
  val extendsType: TypeNode = js.native
  
  val falseType: TypeNode = js.native
  
  @JSName("kind")
  val kind_ConditionalTypeNode: typings.typescript.mod.SyntaxKind.ConditionalType = js.native
  
  val trueType: TypeNode = js.native
}
