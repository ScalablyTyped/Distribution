package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BulkLoadColumnOpts extends ParameterOptions {
  //  Indicates whether the column accepts NULL values.
  var nullable: scala.Boolean
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[java.lang.String] = js.undefined
}

