package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Client")
@js.native
class Client ()
  extends styletronDashStandardLib.styletronDashStandardMod.StandardEngine {
  def this(opts: ClientOptions) = this()
  var fontFaceCache: Cache[styletronDashStandardLib.styletronDashStandardMod.FontFace] = js.native
  var fontFaceSheet: stdLib.HTMLStyleElement = js.native
  var keyframesCache: Cache[styletronDashStandardLib.styletronDashStandardMod.KeyframesObject] = js.native
  var keyframesSheet: stdLib.HTMLStyleElement = js.native
  var styleCache: MultiCache[styletronDashEngineDashAtomicLib.Anon_Block] = js.native
  var styleElements: org.scalablytyped.runtime.StringDictionary[stdLib.HTMLStyleElement] = js.native
  /* CompleteClass */
  override def renderFontFace(fontFace: styletronDashStandardLib.styletronDashStandardMod.FontFace): java.lang.String = js.native
  /* CompleteClass */
  override def renderKeyframes(keyframes: styletronDashStandardLib.styletronDashStandardMod.KeyframesObject): java.lang.String = js.native
  /* CompleteClass */
  override def renderStyle(style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): java.lang.String = js.native
}

