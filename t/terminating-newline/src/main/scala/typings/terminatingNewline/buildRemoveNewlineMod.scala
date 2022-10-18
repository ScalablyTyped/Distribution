package typings.terminatingNewline

import typings.node.bufferMod.global.Buffer
import typings.terminatingNewline.buildMod.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRemoveNewlineMod {
  
  @JSImport("terminating-newline/build/remove-newline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): ReturnValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[String]]
  inline def default(input: Buffer): ReturnValue[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[Buffer]]
}
