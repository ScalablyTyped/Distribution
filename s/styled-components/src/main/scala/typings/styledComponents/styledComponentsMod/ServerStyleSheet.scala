package typings.styledComponents.styledComponentsMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.styledComponents.styledComponentsMod.global.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styled-components", "ServerStyleSheet")
@js.native
class ServerStyleSheet () extends StObject {
  
  def collectStyles(tree: ReactNode): ReactElement = js.native
  
  def getStyleElement(): js.Array[ReactElement] = js.native
  
  def getStyleTags(): String = js.native
  
  val instance: this.type = js.native
  
  def interleaveWithNodeStream(readableStream: ReadableStream): ReadableStream = js.native
  
  def seal(): Unit = js.native
}
