package typings.word

import typings.node.Buffer
import typings.word.fibMod.FibRgLw97
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/DOC/clx", JSImport.Namespace)
@js.native
object clxMod extends js.Object {
  
  def getTxt(fibRgLw: FibRgLw97, plcPcd: Buffer, doc: Buffer): String = js.native
  
  /**
    * [MS-DOC] 2.9.38 Clx
    */
  def parseClx(clx: Buffer): Buffer = js.native
}
