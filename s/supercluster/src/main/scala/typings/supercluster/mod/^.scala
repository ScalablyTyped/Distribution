package typings.supercluster.mod

import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A very fast geospatial point clustering library for browsers and Node.
  */
@JSImport("supercluster", JSImport.Namespace)
@js.native
class ^[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] () extends Supercluster[P, C] {
  def this(options: Options[P, C]) = this()
}

