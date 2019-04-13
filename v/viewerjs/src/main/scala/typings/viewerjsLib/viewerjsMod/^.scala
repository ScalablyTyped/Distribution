package typings
package viewerjsLib.viewerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript image viewer.
  * @see {@link https://github.com/fengyuanchen/viewerjs}
  */
@JSImport("viewerjs", JSImport.Namespace)
@js.native
class ^ protected () extends Viewer {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ViewerOption) = this()
}

@JSImport("viewerjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * If you have to use other viewer with the same namespace, just call the `Viewer.noConflict` static method to revert to it.
    */
  def noConflict(): scala.Unit = js.native
  /**
    * Change the global default options.
    */
  def setDefaults(options: ViewerOption): scala.Unit = js.native
}

