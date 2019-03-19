package typings
package varaLib.varaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaraType extends js.Object {
  def analyseWidth(): varaLib.Anon_BreakPoints = js.native
  def animate(element: stdLib.SVGElement, duration: scala.Double, delay: scala.Double, `final`: scala.Double): scala.Unit = js.native
  /**
    * Used to execute a function once animation ends, triggers every time a block of text is drawn.
    *
    * @param onEnd callback with the id of the drawn text, and an object containing the group DOM object,
    * this is the same object that is returned when calling the get() method.
    */
  def animationEnd(
    onEnd: js.Function2[/* id */ java.lang.String | scala.Double, /* group */ TextElements, scala.Unit]
  ): scala.Unit = js.native
  def createNode(
    noneName: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): stdLib.SVGElement = js.native
  def createText(): scala.Unit = js.native
  /**
    * Used to animate texts with autoAnimation:false
    * If an id was given to the text during creation, it should be given as the argument.
    * Otherwise use the index of the text block.
    *
    * @param id text ID or index
    * @param duration
    */
  def draw(id: java.lang.String): scala.Unit = js.native
  def draw(id: java.lang.String, duration: scala.Double): scala.Unit = js.native
  def draw(id: scala.Double): scala.Unit = js.native
  def draw(id: scala.Double, duration: scala.Double): scala.Unit = js.native
  /**
    * If an id was given to the text during creation, it should be given as the argument.
    * Otherwise use the index of the text block.
    *
    * @param id text ID or index
    */
  def get(id: java.lang.String): TextElements | varaLib.varaLibNumbers.`false` = js.native
  def get(id: scala.Double): TextElements | varaLib.varaLibNumbers.`false` = js.native
  def getSVGData(): scala.Unit = js.native
  def getSectionPathLength(id: java.lang.String): scala.Double = js.native
  def getSectionPathLength(id: scala.Double): scala.Double = js.native
  /**
    * Is used to play the animation of every text block, obeying delay and queue.
    */
  def playAll(): scala.Unit = js.native
  def preCreate(): scala.Unit = js.native
  /**
    * Is used to execute a function when the font is loaded and the elements are created.
    * ! Any other method should be called inside the function !
    *
    * @param onReady callback
    */
  def ready(onReady: js.Function0[scala.Unit]): scala.Unit = js.native
  def setPosition(element: stdLib.SVGGElement, obj: varaLib.Anon_XY): scala.Unit = js.native
  def setPosition(element: stdLib.SVGGElement, obj: varaLib.Anon_XY, relative: varaLib.Anon_XYBoolean): scala.Unit = js.native
}

