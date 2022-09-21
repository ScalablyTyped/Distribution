package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TextChangeRange")
@js.native
open class TextChangeRange protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typings.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
  
  /* private */ /* CompleteClass */
  var _newLength: Any = js.native
  
  /* private */ /* CompleteClass */
  var _span: Any = js.native
  
  /* CompleteClass */
  override def isUnchanged(): Boolean = js.native
  
  /* CompleteClass */
  override def newLength(): Double = js.native
  
  /* CompleteClass */
  override def newSpan(): typings.typescriptServices.TypeScript.TextSpan = js.native
  
  /* CompleteClass */
  override def span(): typings.typescriptServices.TypeScript.TextSpan = js.native
}
object TextChangeRange {
  
  @JSImport("typescript-services", "TextChangeRange")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def collapseChangesAcrossMultipleVersions(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseChangesAcrossMultipleVersions")(changes.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.TextChangeRange]
  
  /* static member */
  inline def collapseChangesFromSingleVersion(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseChangesFromSingleVersion")(changes.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.TextChangeRange]
  
  /* static member */
  @JSImport("typescript-services", "TextChangeRange.unchanged")
  @js.native
  def unchanged: typings.typescriptServices.TypeScript.TextChangeRange = js.native
  inline def unchanged_=(x: typings.typescriptServices.TypeScript.TextChangeRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unchanged")(x.asInstanceOf[js.Any])
}
