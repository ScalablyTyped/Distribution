package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astNs {
  type AstNode = ScalarNode | MapNode | SeqNode | Alias
  type DocumentConstructor = org.scalablytyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ yamlLib.yamlMod.ParseOptions], Document]
  type MapConstructor = org.scalablytyped.runtime.Instantiable0[MapBase]
  type MapNode = FlowMap | Map
  type PairConstructor = org.scalablytyped.runtime.Instantiable2[
    /* key */ AstNode | scala.Null, 
    /* value */ js.UndefOr[/* value */ AstNode | scala.Null], 
    Pair
  ]
  type ScalarConstructor = org.scalablytyped.runtime.Instantiable1[/* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, Scalar]
  type ScalarNode = BlockFolded | BlockLiteral | PlainValue | QuoteDouble | QuoteSingle
  type SeqConstructor = org.scalablytyped.runtime.Instantiable0[SeqBase]
  type SeqNode = FlowSeq | Seq
}
