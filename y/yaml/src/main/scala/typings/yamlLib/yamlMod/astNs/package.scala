package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astNs {
  type DocumentConstructor = org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ yamlLib.yamlMod.ParseOptions], Document]
  type MapConstructor = org.scalablytyped.runtime.Instantiable0[MapBase]
  type PairConstructor = org.scalablytyped.runtime.Instantiable2[/* key */ AstNode | scala.Null, js.UndefOr[AstNode | scala.Null], Pair]
  type ScalarConstructor = org.scalablytyped.runtime.Instantiable1[/* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, Scalar]
  type SeqConstructor = org.scalablytyped.runtime.Instantiable0[SeqBase]
}
