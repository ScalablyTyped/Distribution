package typings.viewerjs.viewerjsMod

import typings.std.Element
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
  def this(element: Element) = this()
  def this(element: Element, options: ViewerOption) = this()
}

@JSImport("viewerjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * If you have to use other viewer with the same namespace, just call the `Viewer.noConflict` static method to revert to it.
    */
  def noConflict(): Unit = js.native
  /**
    * Change the global default options.
    */
  def setDefaults(options: ViewerOption): Unit = js.native
}

