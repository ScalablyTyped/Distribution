package typings.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.ResolvedCompletionEntry")
@js.native
class ResolvedCompletionEntry protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.ResolvedCompletionEntry {
  def this(
    name: String,
    kind: String,
    kindModifiers: String,
    `type`: String,
    fullSymbolName: String,
    docComment: String
  ) = this()
  
  /* CompleteClass */
  var docComment: String = js.native
  
  /* CompleteClass */
  var fullSymbolName: String = js.native
  
  /* CompleteClass */
  override def isResolved(): Boolean = js.native
  
  /* CompleteClass */
  var kind: String = js.native
  
  /* CompleteClass */
  var kindModifiers: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
