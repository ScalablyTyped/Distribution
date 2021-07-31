package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedName
  extends StObject
     with Node
     with EntityName {
  
  @JSName("kind")
  val kind_QualifiedName: typings.typescript.mod.SyntaxKind.QualifiedName = js.native
  
  val left: EntityName = js.native
  
  val right: Identifier = js.native
}
