package typings
package vegaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vegaLibStrings {
  @js.native
  sealed trait canvas extends js.Object
  
  @js.native
  sealed trait svg extends js.Object
  
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  def svg: svg = "svg".asInstanceOf[svg]
}

