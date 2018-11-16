package typings
package velocityDashAnimateLib.jqueryNs.velocityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VelocityStatic extends js.Object {
  var Sequences: js.Any = js.native
  var mock: js.Any = js.native
  def RegisterEffect(name: java.lang.String, options: RegisterEffectOptions): VelocityStatic = js.native
  def RunSequence(sequence: js.Array[SequenceCall]): VelocityStatic = js.native
  def animate(elements: stdLib.HTMLCollection, properties: Properties, options: Options): js.Any = js.native
  def animate(elements: stdLib.HTMLElement, properties: Properties, options: Options): js.Any = js.native
  def animate(elements: stdLib.NodeListOf[stdLib.HTMLElement], properties: Properties, options: Options): js.Any = js.native
  def animate(options: velocityDashAnimateLib.Anon_OptionsProperties): js.Any = js.native
  /**
  		 * Get a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: stdLib.HTMLElement, cssKey: java.lang.String): java.lang.String = js.native
  /**
  		 * Set a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: stdLib.HTMLElement, cssKey: java.lang.String, cssValue: java.lang.String): scala.Unit = js.native
  /**
  		 * Get a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: velocityDashAnimateLib.JQuery, cssKey: java.lang.String): java.lang.String = js.native
  /**
  		 * Set a hook value. Hooks are the subvalues of multi-value CSS properties.
  		 * It features the same API as $.css().
  		 */
  def hook(element: velocityDashAnimateLib.JQuery, cssKey: java.lang.String, cssValue: java.lang.String): scala.Unit = js.native
}

