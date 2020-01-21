package typings.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // array.js
  type ArrayAlias = typings.svgJs.mod.Array | js.Array[scala.Double] | java.lang.String
  // line.js
  type ArrayPoint = js.Array[scala.Double]
  type ColorAlias = java.lang.String | typings.svgJs.mod.ColorLike
  /* Rewritten from type alias, can be one of: 
    - typings.svgJs.mod.MatrixLike
    - js.Array[scala.Double]
    - typings.svgJs.mod.Element
    - java.lang.String
  */
  type MatrixAlias = typings.svgJs.mod._MatrixAlias | js.Array[scala.Double] | java.lang.String
  type NumberAlias = typings.svgJs.mod.Number | scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.svgJs.mod.Doc
    - typings.svgJs.mod.Nested
    - typings.svgJs.mod.G
  */
  type ParentTypeAlias = typings.svgJs.mod._ParentTypeAlias | java.lang.String
  type PathArrayAlias = typings.svgJs.mod.PathArray | (js.Array[scala.Double | typings.svgJs.mod.PathArrayPoint | java.lang.String]) | java.lang.String
  // path.js
  type PathArrayPoint = js.Array[scala.Double | java.lang.String]
  type PointArrayAlias = (js.Array[typings.svgJs.mod.ArrayPoint | scala.Double]) | typings.svgJs.mod.PointArray | java.lang.String
  // viewbox.js
  /* Rewritten from type alias, can be one of: 
    - typings.svgJs.mod.ViewBoxLike
    - js.Array[scala.Double]
    - java.lang.String
    - typings.svgJs.mod.Element
  */
  type ViewBoxAlias = typings.svgJs.mod._ViewBoxAlias | js.Array[scala.Double] | java.lang.String
}
