package typings.yaml

import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeUtilFlowIndentCheckMod {
  
  @JSImport("yaml/dist/compose/util-flow-indent-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flowIndentCheck(indent: Double, fc: Null, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flowIndentCheck(indent: Double, fc: Unit, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flowIndentCheck(indent: Double, fc: Token, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
