package typings.vara.varaMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.vara.Anon_BreakPoints
import typings.vara.Anon_XY
import typings.vara.Anon_XYBoolean
import typings.vara.varaNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaraType extends js.Object {
  def analyseWidth(): Anon_BreakPoints = js.native
  def animate(element: SVGElement, duration: Double, delay: Double, `final`: Double): Unit = js.native
  /**
    * Used to execute a function once animation ends, triggers every time a block of text is drawn.
    *
    * @param onEnd callback with the id of the drawn text, and an object containing the group DOM object,
    * this is the same object that is returned when calling the get() method.
    */
  def animationEnd(onEnd: js.Function2[/* id */ String | Double, /* group */ TextElements, Unit]): Unit = js.native
  def createNode(noneName: String, properties: StringDictionary[String]): SVGElement = js.native
  def createText(): Unit = js.native
  /**
    * Used to animate texts with autoAnimation:false
    * If an id was given to the text during creation, it should be given as the argument.
    * Otherwise use the index of the text block.
    *
    * @param id text ID or index
    * @param duration
    */
  def draw(id: String): Unit = js.native
  def draw(id: String, duration: Double): Unit = js.native
  def draw(id: Double): Unit = js.native
  def draw(id: Double, duration: Double): Unit = js.native
  /**
    * If an id was given to the text during creation, it should be given as the argument.
    * Otherwise use the index of the text block.
    *
    * @param id text ID or index
    */
  def get(id: String): TextElements | `false` = js.native
  def get(id: Double): TextElements | `false` = js.native
  def getSVGData(): Unit = js.native
  def getSectionPathLength(id: String): Double = js.native
  def getSectionPathLength(id: Double): Double = js.native
  /**
    * Is used to play the animation of every text block, obeying delay and queue.
    */
  def playAll(): Unit = js.native
  def preCreate(): Unit = js.native
  /**
    * Is used to execute a function when the font is loaded and the elements are created.
    * ! Any other method should be called inside the function !
    *
    * @param onReady callback
    */
  def ready(onReady: js.Function0[Unit]): Unit = js.native
  def setPosition(element: SVGGElement, obj: Anon_XY): Unit = js.native
  def setPosition(element: SVGGElement, obj: Anon_XY, relative: Anon_XYBoolean): Unit = js.native
}

