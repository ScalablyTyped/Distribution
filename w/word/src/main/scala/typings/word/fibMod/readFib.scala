package typings.word.fibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/DOC/fib", "readFib")
@js.native
object readFib extends js.Object {
  
  /**
    * [MS-DOC] 2.5.1 Fib
    */
  def apply(buffer: Buffer): Fib = js.native
}
