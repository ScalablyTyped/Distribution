package typings.textToSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextToSVG extends js.Object {
  
  /**
    * Generate SVG `<path>` `d` value.
    *
    * @param text to measure
    * @param options font options and attributes
    * @returns SVG path d attribute value
    */
  def getD(text: String): String = js.native
  def getD(text: String, options: GenerationOptions): String = js.native
  
  /**
    * Measure the height of the font.
    *
    * @param fontSize to measure with
    * @returns height of the font
    */
  def getHeight(fontSize: Double): Double = js.native
  
  /**
    * Measure the text metrics.
    *
    * @param text to measure
    * @param options font options
    */
  def getMetrics(text: String): Metrics = js.native
  def getMetrics(text: String, options: FontOptions): Metrics = js.native
  
  /**
    * Generate SVG `<path>` from text.
    *
    * @param text to measure
    * @param options font options and attributes
    * @returns SVG path element string
    */
  def getPath(text: String): String = js.native
  def getPath(text: String, options: GenerationOptions): String = js.native
  
  /**
    * Generate SVG as a string with text converted to paths.
    *
    * @param text to measure
    * @param options font options and attributes
    * @returns SVG string
    */
  def getSVG(text: String): String = js.native
  def getSVG(text: String, options: GenerationOptions): String = js.native
  
  /**
    * Measure the width of the specified text.
    *
    * @param text to measure
    * @param options font options
    * @returns width of the text
    */
  def getWidth(text: String): Double = js.native
  def getWidth(text: String, options: FontOptions): Double = js.native
}
