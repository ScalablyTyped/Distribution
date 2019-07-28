package typings.velocityDashAnimate.jqueryNs.velocityNs

import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.velocityDashAnimate.Anon_Elements
import typings.velocityDashAnimate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VelocityStatic extends js.Object {
  var Sequences: js.Any = js.native
  var mock: js.Any = js.native
  def RegisterEffect(name: String, options: RegisterEffectOptions): VelocityStatic = js.native
  def RunSequence(sequence: js.Array[SequenceCall]): VelocityStatic = js.native
  def animate(elements: HTMLCollection, properties: Properties, options: Options): js.Any = js.native
  def animate(elements: HTMLElement, properties: Properties, options: Options): js.Any = js.native
  def animate(elements: NodeListOf[HTMLElement], properties: Properties, options: Options): js.Any = js.native
  def animate(options: Anon_Elements): js.Any = js.native
  /**
  		 * Get a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: HTMLElement, cssKey: String): String = js.native
  /**
  		 * Set a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: HTMLElement, cssKey: String, cssValue: String): Unit = js.native
  def hook(element: JQuery, cssKey: String): String = js.native
  def hook(element: JQuery, cssKey: String, cssValue: String): Unit = js.native
}

