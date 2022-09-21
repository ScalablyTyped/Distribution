package typings.word

import typings.node.bufferMod.global.Buffer
import typings.word.fibMod.FibRgLw97
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clxMod {
  
  @JSImport("word/dist/typings/codecs/DOC/clx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTxt(fibRgLw: FibRgLw97, plcPcd: Buffer, doc: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTxt")(fibRgLw.asInstanceOf[js.Any], plcPcd.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * [MS-DOC] 2.9.38 Clx
    */
  inline def parseClx(clx: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClx")(clx.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
