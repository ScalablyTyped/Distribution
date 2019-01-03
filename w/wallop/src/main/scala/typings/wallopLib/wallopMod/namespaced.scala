package typings
package wallopLib.wallopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wallop", JSImport.Namespace)
@js.native
class namespaced protected () extends Wallop {
  /**
    * Implement new instance of Wallop.
    */
  def this(selector: stdLib.Element) = this()
  def this(selector: stdLib.Element, options: wallopLib.wallopMod.WallopNs.Options) = this()
  /**
    * Advances to the slide with the given index.
    */
  /* CompleteClass */
  override def goTo(index: scala.Double): Wallop = js.native
  /**
    * Advances to next slide.
    */
  /* CompleteClass */
  override def next(): Wallop = js.native
  /**
    * Unbinds method from custom event.
    */
  /* CompleteClass */
  override def off(eventName: java.lang.String, callback: js.Function0[scala.Unit]): Wallop = js.native
  /**
    * Bind method to custom event.
    */
  /* CompleteClass */
  override def on(eventName: java.lang.String, callback: js.Function0[scala.Unit]): Wallop = js.native
  /**
    * Returns to previous slide.
    */
  /* CompleteClass */
  override def previous(): Wallop = js.native
  /**
    * Resets current Wallop instance to defaults.
    */
  /* CompleteClass */
  override def reset(): Wallop = js.native
}

