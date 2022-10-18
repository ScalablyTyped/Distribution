package typings.yaml

import typings.yaml.anon.CommentOffset
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveEndMod {
  
  @JSImport("yaml/dist/compose/resolve-end", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEnd(end: js.Array[SourceToken], offset: Double, reqSpace: Boolean, onError: ComposeErrorHandler): CommentOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnd")(end.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], reqSpace.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[CommentOffset]
  inline def resolveEnd(end: Unit, offset: Double, reqSpace: Boolean, onError: ComposeErrorHandler): CommentOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnd")(end.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], reqSpace.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[CommentOffset]
}
