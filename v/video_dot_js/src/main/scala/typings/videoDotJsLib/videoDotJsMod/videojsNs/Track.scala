package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A Track class that contains all of the common functionality for {@link AudioTrack},
	 * {@link VideoTrack}, and {@link TextTrack}.
	 *
	 * > Note: This class should not be used directly
	 *
	 * @see {@link https://html.spec.whatwg.org/multipage/embedded-content.html}
	 */
@js.native
trait Track extends EventTarget {
  /**
  		 * The id of this track. Cannot be changed after creation.
  		 */
  val id: java.lang.String = js.native
  /**
  		 * The kind of track that this is. Cannot be changed after creation.
  		 */
  val kind: java.lang.String = js.native
  /**
  		 * The label of this track. Cannot be changed after creation.
  		 */
  val label: java.lang.String = js.native
  /**
  		 * The two letter language code for this track. Cannot be changed after creation.
  		 */
  val language: java.lang.String = js.native
}

