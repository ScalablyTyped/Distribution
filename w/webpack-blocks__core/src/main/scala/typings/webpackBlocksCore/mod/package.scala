package typings.webpackBlocksCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigSetter[T /* <: typings.webpackBlocksCore.mod.Context */] = js.Function2[
    /* context */ T, 
    /* util */ typings.webpackBlocksCore.mod.Util, 
    js.Function1[/* config */ typings.webpack.mod.Configuration, typings.webpack.mod.Configuration]
  ]
}
