package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgjsNs {
  // array.js
  type ArrayAlias = _Array | js.Array[scala.Double] | java.lang.String
  // line.js
  type ArrayPoint = js.Array[scala.Double]
  type ColorAlias = java.lang.String | ColorLike
  /* Rewritten from type alias, can be one of: 
    - MatrixLike
    - js.Array[scala.Double]
    - Element
    - java.lang.String
  */
  type MatrixAlias = _MatrixAlias | js.Array[scala.Double] | java.lang.String
  type NumberAlias = _Number | scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - Doc
    - Nested
    - G
  */
  type ParentTypeAlias = _ParentTypeAlias | java.lang.String
  type PathArrayAlias = PathArray | (js.Array[java.lang.String | scala.Double]) | js.Array[PathArrayPoint] | java.lang.String
  // path.js
  type PathArrayPoint = js.Array[scala.Double | java.lang.String]
  type PointArrayAlias = js.Array[ArrayPoint] | js.Array[scala.Double] | PointArray | java.lang.String
  // viewbox.js
  /* Rewritten from type alias, can be one of: 
    - ViewBoxLike
    - js.Array[scala.Double]
    - java.lang.String
    - Element
  */
  type ViewBoxAlias = _ViewBoxAlias | js.Array[scala.Double] | java.lang.String
}
