package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Parser")
@js.native
open class Parser () extends StObject {
  
  def parse(source: String, state: ParserState): ParserState = js.native
  def parse(source: Buffer, state: ParserState): ParserState = js.native
  def parse(source: PreparsedAst, state: ParserState): ParserState = js.native
}
