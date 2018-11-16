package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Callback[T] = js.Function2[/* error */ stdLib.Error, /* result */ T, scala.Unit]
}
