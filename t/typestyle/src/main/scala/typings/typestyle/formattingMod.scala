package typings.typestyle

import typings.freeStyle.mod.Styles
import typings.typestyle.typesMod.KeyFrames
import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typestyle/lib/internal/formatting", JSImport.Namespace)
@js.native
object formattingMod extends js.Object {
  
  def convertToKeyframes(frames: KeyFrames): Styles = js.native
  
  def convertToStyles(`object`: NestedCSSProperties): Styles = js.native
}
