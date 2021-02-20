package typings.twineSugarcube

import typings.std.HTMLElement
import typings.twineSugarcube.twineSugarcubeStrings.idle
import typings.twineSugarcube.twineSugarcubeStrings.playing
import typings.twineSugarcube.twineSugarcubeStrings.rendering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @js.native
  trait EngineAPI extends StObject {
    
    /**
      * Moves backward one moment within the full history (past + future), if possible, activating and showing the
      * moment moved to. Returns whether the history navigation was successful (should only fail if already at the
      * beginning of the full history).
      * @since 2.0.0
      */
    def backward(): Boolean = js.native
    
    /**
      * Moves forward one moment within the full history (past + future), if possible, activating and showing the moment
      * moved to. Returns whether the history navigation was successful (should only fail if already at the end of the
      * full history).
      * @since 2.0.0
      */
    def forward(): Boolean = js.native
    
    /**
      * Activates the moment at the given offset from the active (present) moment within the full state history and show
      * it. Returns whether the history navigation was successful (should only fail if the offset from the active
      * (present) moment is not within the bounds of the full history).
      * @param offset The offset from the active (present) moment of the moment to go to.
      * @since 2.0.0
      */
    def go(offset: Double): Boolean = js.native
    
    /**
      * Activates the moment at the given index within the full state history and show it. Returns whether the history
      * navigation was successful (should only fail if the index is not within the bounds of the full history).
      * @param index The index of the moment to go to.
      * @since 2.0.0
      * @example
      * Engine.goTo(0) // Goes to the first moment
      * Engine.goTo(9) // Goes to the tenth moment
      */
    def goTo(index: Double): Boolean = js.native
    
    /**
      * Returns whether the engine is idle.
      * @since 2.16.0
      */
    def isIdle(): Boolean = js.native
    
    /**
      * Returns whether the engine is processing a turn — i.e. passage navigation has been triggered.
      * @since 2.16.0
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Returns whether the engine is rendering the incoming passage.
      * @since 2.16.0
      */
    def isRendering(): Boolean = js.native
    
    /**
      * Returns a timestamp representing the last time Engine.play() was called.
      * @since 2.0.0
      */
    val lastPlay: Double = js.native
    
    /**
      * Renders and displays the passage referenced by the given title, optionally without adding a new moment to the
      * history.
      * @param passageTitle The title of the passage to play.
      * @param noHistory Disables the update of the history (i.e. no moment is added to the history).
      * @since 2.0.0
      */
    def play(passageTitle: String): HTMLElement = js.native
    def play(passageTitle: String, noHistory: Boolean): HTMLElement = js.native
    
    /**
      * Restarts the story.
      *
      * WARNING: The player will not be prompted and all unsaved state will be lost.
      * NOTE: In general, you should not call this method directly. Instead, call the UI.restart() static method, which
      * prompts the player with an OK/Cancel dialog before itself calling Engine.restart(), if they accept.
      * @since 2.0.0
      */
    def restart(): Unit = js.native
    
    /**
      * Renders and displays the active (present) moment's associated passage without adding a new moment to the history.
      * @since 2.0.0
      */
    def show(): HTMLElement = js.native
    
    /**
      * Returns the current state of the engine ("idle", "playing", "rendering").
      * States:
      * * "idle": The engine is idle, awaiting the triggering of passage navigation—the default state.
      * * "playing": Passage navigation has been triggered and a turn is being processed.
      * * "rendering": The incoming passage is being rendered and added to the page—takes place during turn processing,
      *   so implies "playing".
      * @since 2.7.0
      */
    val state: idle | playing | rendering = js.native
  }
}
