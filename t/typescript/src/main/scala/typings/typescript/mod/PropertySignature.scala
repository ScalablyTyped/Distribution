package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySignature
  extends StObject
     with TypeElement
     with JSDocContainer {
  
  /** @deprecated A property signature cannot have an initializer */
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_PropertySignature: typings.typescript.mod.SyntaxKind.PropertySignature = js.native
  
  @JSName("modifiers")
  val modifiers_PropertySignature: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_PropertySignature: PropertyName = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
