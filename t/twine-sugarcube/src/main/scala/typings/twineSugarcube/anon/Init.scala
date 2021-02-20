package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Init extends StObject {
  
  /**
    * Initializes the seedable pseudo-random number generator (PRNG) and integrates it into the story state and saves.
    * Once initialized, the State.random() method and story functions, random() and randomFloat(), return deterministic
    * results from the seeded PRNG—by default, they return non-deterministic results from Math.random().
    *
    * **NOTE**: State.prng.init() must be called during story initialization, within either a script section (Twine 2: the
    * Story JavaScript, Twine 1/Twee: a script-tagged passage) or the StoryInit special passage. Additionally, it is
    * strongly recommended that you do not specify any arguments to State.prng.init() and allow it to automatically
    * seed itself. If you should chose to use an explicit seed, however, it is strongly recommended that you also enable
    * additional entropy, otherwise all playthroughs for all players will be exactly the same.
    *
    * @param seed The explicit seed used to initialize the pseudo-random number generator.
    * @param useEntropy Enables the use of additional entropy to pad the specified explicit seed.
    *
    * @since 2.29.0
    * @example
    * State.prng.init(); // Automatically seed the PRNG (recommended)
    * State.prng.init("aVeryLongSeed"); // Seed the PRNG with "aVeryLongSeed" (not recommended)
    * State.prng.init("aVeryLongSeed", true); //Seed the PRNG with "aVeryLongSeed" and pad it with extra entropy
    */
  def init(): Unit = js.native
  def init(seed: js.UndefOr[scala.Nothing], useEntropy: Boolean): Unit = js.native
  def init(seed: String): Unit = js.native
  def init(seed: String, useEntropy: Boolean): Unit = js.native
  
  /**
    * Returns whether the seedable PRNG has been enabled
    * @since 2.29.0
    */
  def isEnabled(): Boolean = js.native
  
  /**
    * Returns the current pull count—i.e., how many requests have been made—from the seedable PRNG or, if the PRNG is
    * not enabled, NaN.
    *
    * **NOTE**: The pull count is automatically included within saves and sessions, so this is not especially useful
    * outside of debugging purposes.
    * @since 2.29.0
    */
  def pull(): Double = js.native
  
  /**
    * Returns the seed from the seedable PRNG or, if the PRNG is not enabled, null.
    * @since 2.29.0
    */
  def seed(): String = js.native
}
