package typings.xml2js.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml2js", "Parser")
@js.native
class Parser () extends EventEmitter {
  def this(options: ParserOptions) = this()
  
  def parseString(str: convertableToString): Unit = js.native
  def parseString(str: convertableToString, cb: js.Function): Unit = js.native
  
  def parseStringPromise(str: convertableToString): js.Promise[_] = js.native
  
  def reset(): Unit = js.native
}
