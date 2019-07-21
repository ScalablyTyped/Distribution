package typings
package uid2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uid2", JSImport.Namespace)
@js.native
object uid2Mod extends js.Object {
  def apply(length: scala.Double): java.lang.String = js.native
  def apply(
    length: scala.Double,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

