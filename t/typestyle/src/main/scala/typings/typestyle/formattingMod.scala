package typings.typestyle

import typings.freeStyle.mod.Styles
import typings.typestyle.typesMod.KeyFrames
import typings.typestyle.typesMod.NestedCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattingMod {
  
  @JSImport("typestyle/lib/internal/formatting", "convertToKeyframes")
  @js.native
  def convertToKeyframes(frames: KeyFrames): Styles = js.native
  
  @JSImport("typestyle/lib/internal/formatting", "convertToStyles")
  @js.native
  def convertToStyles(`object`: NestedCSSProperties): Styles = js.native
}
