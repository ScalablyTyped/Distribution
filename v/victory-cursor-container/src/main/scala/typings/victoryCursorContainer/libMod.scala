package typings.victoryCursorContainer

import typings.victoryCursorContainer.anon.ComponentDidCatch
import typings.victoryCursorContainer.anon.DefaultEvents
import typings.victoryCursorContainer.anon.Instantiable
import typings.victoryCursorContainer.libCursorHelpersMod.CursorHelpersClass
import typings.victoryCursorContainer.libVictoryCursorContainerMod.ComponentClass
import typings.victoryCursorContainer.libVictoryCursorContainerMod.VictoryCursorContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("victory-cursor-container/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-cursor-container/lib", "CursorHelpers")
  @js.native
  val CursorHelpers: CursorHelpersClass = js.native
  
  @JSImport("victory-cursor-container/lib", "VictoryCursorContainer")
  @js.native
  val VictoryCursorContainer: Instantiable & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VictoryContainer */ Any) = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("victory-cursor-container/lib", "VictoryCursorContainer")
  @js.native
  open class VictoryCursorContainerCls protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: VictoryCursorContainerProps) = this()
  }
  
  inline def cursorContainerMixin[TBase /* <: ComponentClass[TProps] */, TProps /* <: VictoryCursorContainerProps */](Base: TBase): DefaultEvents[TProps] & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorContainerMixin")(Base.asInstanceOf[js.Any]).asInstanceOf[DefaultEvents[TProps] & TBase]
}
