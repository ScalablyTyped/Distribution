package typings.word

import typings.cfb.mod.CFBContainer
import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecsMod {
  
  @JSImport("word/dist/typings/codecs", "parse_cfb")
  @js.native
  def parseCfb(file: CFBContainer): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs", "parse_zip")
  @js.native
  def parseZip(file: CFBContainer): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs", "read")
  @js.native
  def read(data: Buffer): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs", "readFile")
  @js.native
  def readFile(path: String): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs", "read_str")
  @js.native
  def readStr(data: String): WJSDoc = js.native
}
