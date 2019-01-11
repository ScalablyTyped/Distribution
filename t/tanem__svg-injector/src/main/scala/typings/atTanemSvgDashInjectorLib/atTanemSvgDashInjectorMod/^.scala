package typings
package atTanemSvgDashInjectorLib.atTanemSvgDashInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(): scala.Unit = js.native
  def default(
    elements: scala.Null,
    hasDoneEachEvalScriptsRenumerateIRIElements: atTanemSvgDashInjectorLib.atTanemSvgDashInjectorMod.IOptionalArgs
  ): scala.Unit = js.native
  /**
    * :NOTE: We are using get/setAttribute with SVG because the SVG DOM spec
    * differs from HTML DOM and can return other unexpected object types when
    * trying to directly access svg properties. ex: "className" returns a
    * SVGAnimatedString with the class value found in the "baseVal" property,
    * instead of simple string like with HTML Elements.
    */
  def default(elements: stdLib.Element): scala.Unit = js.native
  def default(
    elements: stdLib.Element,
    hasDoneEachEvalScriptsRenumerateIRIElements: atTanemSvgDashInjectorLib.atTanemSvgDashInjectorMod.IOptionalArgs
  ): scala.Unit = js.native
  def default(elements: stdLib.HTMLCollectionOf[stdLib.Element]): scala.Unit = js.native
  def default(
    elements: stdLib.HTMLCollectionOf[stdLib.Element],
    hasDoneEachEvalScriptsRenumerateIRIElements: atTanemSvgDashInjectorLib.atTanemSvgDashInjectorMod.IOptionalArgs
  ): scala.Unit = js.native
  def default(elements: stdLib.NodeListOf[stdLib.Element]): scala.Unit = js.native
  def default(
    elements: stdLib.NodeListOf[stdLib.Element],
    hasDoneEachEvalScriptsRenumerateIRIElements: atTanemSvgDashInjectorLib.atTanemSvgDashInjectorMod.IOptionalArgs
  ): scala.Unit = js.native
}

