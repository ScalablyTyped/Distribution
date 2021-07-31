package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object txtMod {
  
  @JSImport("word/dist/typings/codecs/TXT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseStr(data: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_str")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  @scala.inline
  def writeBuf(doc: WJSDoc): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("write_buf")(doc.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def writeBuf(doc: WJSDoc, opts: js.Any): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("write_buf")(doc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def writeStr(doc: WJSDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write_str")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def writeStr(doc: WJSDoc, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write_str")(doc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
