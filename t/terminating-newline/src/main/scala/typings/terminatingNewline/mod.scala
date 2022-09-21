package typings.terminatingNewline

import typings.node.bufferMod.global.Buffer
import typings.terminatingNewline.addNewlineMod.Options
import typings.terminatingNewline.terminatingNewlineStrings.CarriagereturnLinefeed
import typings.terminatingNewline.terminatingNewlineStrings.Linefeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terminating-newline/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTerminatingNewline(input: String): ReturnValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTerminatingNewline")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[String]]
  inline def addTerminatingNewline(input: String, options: Options): ReturnValue[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTerminatingNewline")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[String]]
  inline def addTerminatingNewline(input: Buffer): ReturnValue[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTerminatingNewline")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[Buffer]]
  inline def addTerminatingNewline(input: Buffer, options: Options): ReturnValue[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTerminatingNewline")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[Buffer]]
  
  @JSImport("terminating-newline/build", "carriageReturn")
  @js.native
  val carriageReturn: /* "\r" */ String = js.native
  
  @JSImport("terminating-newline/build", "carriageReturnLineFeed")
  @js.native
  val carriageReturnLineFeed: /* "\r\n" */ String = js.native
  
  inline def isBuffer(input: String): /* is node.buffer.<global>.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.Buffer */ Boolean]
  inline def isBuffer(input: Buffer): /* is node.buffer.<global>.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.Buffer */ Boolean]
  
  @JSImport("terminating-newline/build", "lineFeed")
  @js.native
  val lineFeed: /* "\n" */ String = js.native
  
  inline def removeTerminatingNewline(input: String): ReturnValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTerminatingNewline")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[String]]
  inline def removeTerminatingNewline(input: Buffer): ReturnValue[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTerminatingNewline")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[Buffer]]
  
  type CarriageReturnLineFeed_ = CarriagereturnLinefeed
  
  type LineFeed_ = Linefeed
  
  type ReturnValue[T] = String | Buffer
}
