package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tokenizr", JSImport.Namespace)
@js.native
class ^ () extends Tokenizr

@JSImport("tokenizr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionContext: org.scalablytyped.runtime.Instantiable1[/* e */ js.Any, ActionContext] = js.native
  val ParsingError: org.scalablytyped.runtime.Instantiable5[
    /* message */ java.lang.String, 
    /* pos */ scala.Double, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* input */ java.lang.String, 
    ParsingError
  ] = js.native
  val Token: org.scalablytyped.runtime.Instantiable6[
    /* type */ java.lang.String, 
    /* value */ js.Any, 
    /* text */ java.lang.String, 
    /* pos */ js.UndefOr[/* pos */ scala.Double], 
    /* line */ js.UndefOr[/* line */ scala.Double], 
    /* column */ js.UndefOr[/* column */ scala.Double], 
    Token
  ] = js.native
}

