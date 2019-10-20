package typings.atWebpackDashBlocksCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWebpackDashBlocksCoreMod {
  import typings.webpack.webpackMod.Configuration

  type ConfigSetter[T /* <: Context */] = js.Function2[
    /* context */ T, 
    /* util */ Util, 
    js.Function1[/* config */ Configuration, Configuration]
  ]
}
