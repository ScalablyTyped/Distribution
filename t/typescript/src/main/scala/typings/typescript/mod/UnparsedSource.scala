package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedSource
  extends StObject
     with Node {
  
  var fileName: java.lang.String = js.native
  
  var hasNoDefaultLib: js.UndefOr[Boolean] = js.native
  
  var helpers: js.UndefOr[js.Array[UnscopedEmitHelper]] = js.native
  
  @JSName("kind")
  val kind_UnparsedSource: typings.typescript.mod.SyntaxKind.UnparsedSource = js.native
  
  var libReferenceDirectives: js.Array[FileReference] = js.native
  
  val prologues: js.Array[UnparsedPrologue] = js.native
  
  var referencedFiles: js.Array[FileReference] = js.native
  
  var sourceMapPath: js.UndefOr[java.lang.String] = js.native
  
  var sourceMapText: js.UndefOr[java.lang.String] = js.native
  
  val syntheticReferences: js.UndefOr[js.Array[UnparsedSyntheticReference]] = js.native
  
  var text: java.lang.String = js.native
  
  val texts: js.Array[UnparsedSourceText] = js.native
  
  var typeReferenceDirectives: js.UndefOr[js.Array[java.lang.String]] = js.native
}
