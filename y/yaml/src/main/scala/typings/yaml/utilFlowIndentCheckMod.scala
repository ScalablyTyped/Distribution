package typings.yaml

import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilFlowIndentCheckMod {
  
  @JSImport("yaml/dist/compose/util-flow-indent-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flowIndentCheck(indent: Double, fc: Null, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flowIndentCheck(indent: Double, fc: Unit, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flowIndentCheck(indent: Double, fc: Token, onError: ComposeErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowIndentCheck")(indent.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
