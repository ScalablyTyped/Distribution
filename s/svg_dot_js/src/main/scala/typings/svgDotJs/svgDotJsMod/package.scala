package typings.svgDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDotJsMod {
  // array.js
  type ArrayAlias = _Array | js.Array[Double] | String
  // line.js
  type ArrayPoint = js.Array[Double]
  type ColorAlias = String | ColorLike
  /* Rewritten from type alias, can be one of: 
    - typings.svgDotJs.svgDotJsMod.MatrixLike
    - js.Array[scala.Double]
    - typings.svgDotJs.svgDotJsMod.Element
    - java.lang.String
  */
  type MatrixAlias = _MatrixAlias | js.Array[Double] | String
  type NumberAlias = _Number | Double | String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.svgDotJs.svgDotJsMod.Doc
    - typings.svgDotJs.svgDotJsMod.Nested
    - typings.svgDotJs.svgDotJsMod.G
  */
  type ParentTypeAlias = _ParentTypeAlias | String
  type PathArrayAlias = PathArray | (js.Array[Double | PathArrayPoint | String]) | String
  // path.js
  type PathArrayPoint = js.Array[Double | String]
  type PointArrayAlias = (js.Array[ArrayPoint | Double]) | PointArray | String
  // viewbox.js
  /* Rewritten from type alias, can be one of: 
    - typings.svgDotJs.svgDotJsMod.ViewBoxLike
    - js.Array[scala.Double]
    - java.lang.String
    - typings.svgDotJs.svgDotJsMod.Element
  */
  type ViewBoxAlias = _ViewBoxAlias | js.Array[Double] | String
}
