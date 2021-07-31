package typings.typestyle

import typings.freeStyle.mod.Styles
import typings.typestyle.typesMod.KeyFrames
import typings.typestyle.typesMod.NestedCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattingMod {
  
  @JSImport("typestyle/lib/internal/formatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertToKeyframes(frames: KeyFrames): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToKeyframes")(frames.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  @scala.inline
  def convertToStyles(`object`: NestedCSSProperties): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToStyles")(`object`.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
