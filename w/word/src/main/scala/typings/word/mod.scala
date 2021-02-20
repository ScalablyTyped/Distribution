package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word", "read")
  @js.native
  def read(data: Buffer): WJSDoc = js.native
  
  @JSImport("word", "readFile")
  @js.native
  def readFile(path: String): WJSDoc = js.native
  
  @JSImport("word", "to_text")
  @js.native
  def toText(doc: WJSDoc): String = js.native
  @JSImport("word", "to_text")
  @js.native
  def toText(doc: WJSDoc, opts: js.Any): String = js.native
}
