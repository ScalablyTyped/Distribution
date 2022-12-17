package typings.victoryCore.libMod

import typings.react.mod.global.JSX.Element
import typings.victoryCore.anon.ClipId
import typings.victoryCore.libVictoryPrimitivesClipPathMod.ClipPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClipPath {
  
  inline def apply(props: ClipPathProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/lib", "ClipPath")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "ClipPath.propTypes")
  @js.native
  def propTypes: ClipId = js.native
  inline def propTypes_=(x: ClipId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
