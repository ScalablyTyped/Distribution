package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Server")
@js.native
class Server ()
  extends styletronDashStandardLib.styletronDashStandardMod.StandardEngine {
  def this(opts: ServerOptions) = this()
  var fontFaceRules: java.lang.String = js.native
  var keyframesRules: java.lang.String = js.native
  var styleRules: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getCss(): java.lang.String = js.native
  def getStylesheets(): js.Array[Sheet] = js.native
  def getStylesheetsHtml(): java.lang.String = js.native
  def getStylesheetsHtml(className: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def renderFontFace(fontFace: styletronDashStandardLib.styletronDashStandardMod.FontFace): java.lang.String = js.native
  /* CompleteClass */
  override def renderKeyframes(keyframes: styletronDashStandardLib.styletronDashStandardMod.KeyframesObject): java.lang.String = js.native
  /* CompleteClass */
  override def renderStyle(style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): java.lang.String = js.native
}

