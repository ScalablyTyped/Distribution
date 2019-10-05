package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ColorTracker utility to track colored blobs in a frame using color
  * difference evaluation.
  */
@JSGlobal("tracking.ColorTracker")
@js.native
/**
  * Create a new ColorTracker.
  * @param colors Optional color(s) to track.
  */
class ColorTracker () extends Tracker {
  def this(colors: String) = this()
  def this(colors: js.Array[String]) = this()
  /** Gets the colors being tracked by the `ColorTracker` instance. */
  def getColors(): js.Array[String] = js.native
  /** Gets the maximum dimension to classify a rectangle. */
  def getMaxDimension(): Double = js.native
  /** Gets the minimum dimension to classify a rectangle. */
  def getMinDimension(): Double = js.native
  /** Gets the minimum group size to be classified as a rectangle. */
  def getMinGroupSize(): Double = js.native
  /**
    * Sets the colors to be tracked by the `ColorTracker` instance.
    * @param colors Array of color names to add.
    */
  def setColors(colors: js.Array[String]): Unit = js.native
  /**
    * Sets the maximum dimension to classify a rectangle.
    * @param maxDimension The max dimension.
    */
  def setMaxDimension(maxDimension: Double): Unit = js.native
  /**
    * Sets the minimum dimension to classify a rectangle.
    * @param minDimension The min dimension.
    */
  def setMinDimension(minDimension: Double): Unit = js.native
  /**
    * Sets the minimum group size to be classified as a rectangle.
    * @param minGroupSize The min group size.
    */
  def setMinGroupSize(minGroupSize: Double): Unit = js.native
}

/* static members */
@JSGlobal("tracking.ColorTracker")
@js.native
object ColorTracker extends js.Object {
  /**
    * Gets the known color function that is able to test whether an (r,g,b) is
    * the desired color.
    * @param name The color name.
    */
  def getColor(name: String): ColorFunction = js.native
  /**
    * Registers a color as known color.
    * @param name The color name.
    * @param predicate The color function to test if the passed (r,g,b) is
    *        the desired color.
    */
  def registerColor(name: String, predicate: ColorFunction): Unit = js.native
}

