package typings.yaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ast {
  type DocumentConstructor = org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* options */ typings.yaml.mod.ParseOptions], 
    typings.yaml.mod.ast.Document
  ]
  type MapConstructor = org.scalablytyped.runtime.Instantiable0[typings.yaml.mod.ast.MapBase]
  type PairConstructor = org.scalablytyped.runtime.Instantiable2[
    /* key */ typings.yaml.mod.ast.AstNode | scala.Null, 
    js.UndefOr[typings.yaml.mod.ast.AstNode | scala.Null], 
    typings.yaml.mod.ast.Pair
  ]
  type ScalarConstructor = org.scalablytyped.runtime.Instantiable1[
    /* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, 
    typings.yaml.mod.ast.Scalar
  ]
  type SeqConstructor = org.scalablytyped.runtime.Instantiable0[typings.yaml.mod.ast.SeqBase]
}
