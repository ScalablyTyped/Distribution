package typings.word

import typings.node.Buffer
import typings.word.fibMod.FibRgLw97
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clxMod {
  
  @JSImport("word/dist/typings/codecs/DOC/clx", "getTxt")
  @js.native
  def getTxt(fibRgLw: FibRgLw97, plcPcd: Buffer, doc: Buffer): String = js.native
  
  /**
    * [MS-DOC] 2.9.38 Clx
    */
  @JSImport("word/dist/typings/codecs/DOC/clx", "parseClx")
  @js.native
  def parseClx(clx: Buffer): Buffer = js.native
}
