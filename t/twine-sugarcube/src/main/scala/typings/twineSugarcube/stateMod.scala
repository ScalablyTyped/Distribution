package typings.twineSugarcube

import typings.twineSugarcube.anon.Has
import typings.twineSugarcube.anon.Init
import typings.twineSugarcube.userdataMod.SugarCubeStoryVariables
import typings.twineSugarcube.userdataMod.SugarCubeTemporaryVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @js.native
  trait StateAPI extends StObject {
    
    /**
      * Returns the active (present) moment.
      * @since 2.0.0
      */
    val active: StoryMoment = js.native
    
    /**
      * Returns the bottommost (least recent) moment from the full in-play history (past + future).
      * @since 2.0.0
      */
    val bottom: StoryMoment = js.native
    
    /**
      * Returns the current moment from the full in-play history (past + future), which is the pre-play version of the active
      * moment.
      *
      * **WARNING**: State.current is not a synonym for State.active. You will, very likely, never need to use State.current
      * directly within your code.
      *
      * @since 2.8.0
      */
    val current: StoryMoment = js.native
    
    /**
      * Returns the value of the story or temporary variable by the given name.
      * @param varName The name of the story or temporary variable, including its sigil—e.g. $charName.
      * @since 2.22.0
      */
    def getVar(varName: String): js.Any = js.native
    
    /**
      * Returns whether any moments with the given title exist within the past in-play history (past only).
      *
      * **NOTE**: State.has() does not check expired moments. If you need to know if the player has ever been to a particular
      * passage, then you must use the State.hasPlayed() method or the hasVisited() story function.
      * @param passageTitle The title of the moment whose existence will be verified.
      * @since 2.0.0
      */
    def has(passageTitle: String): Boolean = js.native
    
    /**
      * Returns whether any moments with the given title exist within the extended past history (expired + past).
      *
      * **NOTE**: If you need to check for multiple passages, the hasVisited() story function will likely be more convenient to
      * use.
      * @param passageTitle The title of the moment whose existence will be verified.
      * @since 2.0.0
      */
    def hasPlayed(passageTitle: String): Boolean = js.native
    
    /**
      * Returns the moment, relative to the bottom of the past in-play history (past only), at the given index.
      * @param index The index of the moment to return.
      * @since 2.0.0
      */
    def index(index: Double): StoryMoment = js.native
    
    /**
      * Initializes the seedable pseudo-random number generator (PRNG) and integrates it into the story state and saves.
      * Once initialized, the State.random() method and story functions, random() and randomFloat(), return results from
      * the seeded PRNG (by default, they return results from Math.random()).
      *
      * **NOTE**: State.initPRNG() must be called during story initialization, within either a script section (Twine 2: the
      * Story JavaScript, Twine 1/Twee: a script-tagged passage) or the StoryInit special passage. Additionally, it is
      * recommended that you do not specify any arguments to State.initPRNG() and allow it to automatically seed itself. If
      * you should chose to use an explicit seed, however, it is strongly recommended that you also enable additional
      * entropy, otherwise all playthroughs for all players will be exactly the same.
      * @param seed The explicit seed used to initialize the pseudo-random number generator.
      * @param useEntropy Enables the use of additional entropy to pad the specified explicit seed.
      * @since 2.0.0
      * @deprecated use State.prng.init() instead
      * @example
      * State.initPRNG() // Automatically seed the PRNG (recommended)
      * State.initPRNG("aVeryLongSeed") // Seed the PRNG with "aVeryLongSeed"
      * State.initPRNG("aVeryLongSeed", true) // Seed the PRNG with "aVeryLongSeed" and pad it with extra entropy
      */
    def initPRNG(): Unit = js.native
    def initPRNG(seed: js.UndefOr[scala.Nothing], useEntropy: Boolean): Unit = js.native
    def initPRNG(seed: String): Unit = js.native
    def initPRNG(seed: String, useEntropy: Boolean): Unit = js.native
    
    /**
      * Returns whether the full in-play history (past + future) is empty.
      * @since 2.0.0
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Returns the number of moments within the past in-play history (past only).
      * @since 2.0.0
      */
    val length: Double = js.native
    
    val metadata: Has = js.native
    
    /**
      * Returns the title of the passage associated with the active (present) moment.
      * @since 2.0.0
      */
    val passage: String = js.native
    
    /**
      * Returns the moment, relative to the top of the past in-play history (past only), at the, optional, offset.
      * @param offset The offset, from the top of the past in-play history, of the moment to return. If not given, an offset
      * of 0 is used.
      */
    def peek(): StoryMoment = js.native
    def peek(offset: Double): StoryMoment = js.native
    
    val prng: Init = js.native
    
    /**
      * Returns a pseudo-random real number (floating-point) in the range 0 (inclusive) up to, but not including, 1
      * (exclusive).
      *
      * **NOTE**: By default, it simply returns results from Math.random(), however, when the seedable PRNG has been enabled,
      * via State.prng.init(), it returns results from the seeded PRNG instead.
      * @since 2.0.0
      */
    def random(): Double = js.native
    
    /**
      * Sets the value of the story or temporary variable by the given name. Returns whether the operation was successful.
      * @param varName The name of the story or temporary variable, including its sigil—e.g. $charName.
      * @param value The value to assign.
      * @since 2.22.0
      */
    def setVar(varName: String, value: js.Any): Boolean = js.native
    
    /**
      * Returns the number of moments within the full in-play history (past + future).
      * @since 2.0.0
      */
    val size: Double = js.native
    
    /**
      * Returns the current temporary variables.
      * @since 2.13.0
      */
    val temporary: SugarCubeTemporaryVariables = js.native
    
    /**
      * Returns the topmost (most recent) moment from the full in-play history (past + future).
      *
      * **WARNING**: State.top is not a synonym for State.active. You will, very likely, never need to use State.top directly
      * within your code.
      * @since 2.0.0
      */
    val top: StoryMoment = js.native
    
    /**
      * Returns the total number of played moments within the extended past history (expired + past).
      * @since 2.0.0
      */
    val turns: Double = js.native
    
    /**
      * Returns the variables from the active (present) moment.
      * @since 2.0.0
      */
    val variables: SugarCubeStoryVariables = js.native
  }
  
  @js.native
  trait StoryMoment extends StObject {
    
    var title: String = js.native
    
    var variables: SugarCubeStoryVariables = js.native
  }
  object StoryMoment {
    
    @scala.inline
    def apply(title: String, variables: SugarCubeStoryVariables): StoryMoment = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryMoment]
    }
    
    @scala.inline
    implicit class StoryMomentMutableBuilder[Self <: StoryMoment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: SugarCubeStoryVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
