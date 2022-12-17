package typings.victoryCore.libMod

import typings.react.mod.global.JSX.Element
import typings.victoryCore.anon.Title
import typings.victoryCore.libVictoryPrimitivesTextMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/lib", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "Text.propTypes")
  @js.native
  def propTypes: Title = js.native
  inline def propTypes_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
