package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astNs {
  type AstNode = ScalarNode | MapNode | SeqNode | Alias
  type DocumentConstructor = ScalablyTyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ yamlLib.yamlMod.ParseOptions], Document]
  type MapConstructor = ScalablyTyped.runtime.Instantiable0[MapBase]
  type MapNode = FlowMap | Map
  type PairConstructor = ScalablyTyped.runtime.Instantiable2[
    /* key */ AstNode | scala.Null, 
    /* value */ js.UndefOr[/* value */ AstNode | scala.Null], 
    Pair
  ]
  type ScalarConstructor = ScalablyTyped.runtime.Instantiable1[/* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, Scalar]
  type ScalarNode = BlockFolded | BlockLiteral | PlainValue | QuoteDouble | QuoteSingle
  type SeqConstructor = ScalablyTyped.runtime.Instantiable0[SeqBase]
  type SeqNode = FlowSeq | Seq
}
