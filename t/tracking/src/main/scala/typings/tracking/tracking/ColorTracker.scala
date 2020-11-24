package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ColorTracker utility to track colored blobs in a frame using color
  * difference evaluation.
  */
@js.native
trait ColorTracker extends Tracker {
  
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
