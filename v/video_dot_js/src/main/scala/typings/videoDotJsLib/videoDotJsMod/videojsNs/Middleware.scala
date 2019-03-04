package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
  		 *
  		 * @param src
  		 * @param next
  		 */
  def setSource(
    src: videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject,
    next: js.Function2[
      /* err */ js.Any, 
      /* next */ js.Function1[/* src */ videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit
}

object Middleware {
  @scala.inline
  def apply(
    setSource: js.Function2[
      videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject, 
      js.Function2[
        /* err */ js.Any, 
        /* next */ js.Function1[/* src */ videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject, scala.Unit], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Middleware = {
    val __obj = js.Dynamic.literal(setSource = setSource)
  
    __obj.asInstanceOf[Middleware]
  }
}

