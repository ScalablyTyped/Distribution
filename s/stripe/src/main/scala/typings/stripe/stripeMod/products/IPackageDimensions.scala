package typings.stripe.stripeMod.products

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its
  * own package_dimensions
  */
trait IPackageDimensions extends js.Object {
  /**
    * Height, in inches. Maximum precision is 2 decimal places.
    */
  var height: Double
  /**
    * Length, in inches. Maximum precision is 2 decimal places.
    */
  var length: Double
  /**
    * Weight, in ounces. Maximum precision is 2 decimal places.
    */
  var weight: Double
  /**
    * Width, in inches. Maximum precision is 2 decimal places.
    */
  var width: Double
}

object IPackageDimensions {
  @scala.inline
  def apply(height: Double, length: Double, weight: Double, width: Double): IPackageDimensions = {
    val __obj = js.Dynamic.literal(height = height, length = length, weight = weight, width = width)
  
    __obj.asInstanceOf[IPackageDimensions]
  }
}

