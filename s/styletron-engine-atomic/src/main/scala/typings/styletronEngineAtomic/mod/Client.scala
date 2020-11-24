package typings.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLStyleElement
import typings.styletronEngineAtomic.anon.Block
import typings.styletronStandard.mod.FontFace
import typings.styletronStandard.mod.KeyframesObject
import typings.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styletron-engine-atomic", "Client")
@js.native
class Client () extends StandardEngine {
  def this(opts: ClientOptions) = this()
  
  var fontFaceCache: Cache[FontFace] = js.native
  
  var fontFaceSheet: HTMLStyleElement = js.native
  
  var keyframesCache: Cache[KeyframesObject] = js.native
  
  var keyframesSheet: HTMLStyleElement = js.native
  
  var styleCache: MultiCache[Block] = js.native
  
  var styleElements: StringDictionary[HTMLStyleElement] = js.native
}
