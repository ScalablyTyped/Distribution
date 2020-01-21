package typings.tokenizr.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tokenizr", JSImport.Default)
@js.native
class default () extends Tokenizr

/* static members */
@JSImport("tokenizr", JSImport.Default)
@js.native
object default extends js.Object {
  val ActionContext: Instantiable1[/* e */ js.Any, typings.tokenizr.mod.ActionContext] = js.native
  val ParsingError: Instantiable5[
    /* message */ String, 
    /* pos */ Double, 
    /* line */ Double, 
    /* column */ Double, 
    /* input */ String, 
    typings.tokenizr.mod.ParsingError
  ] = js.native
  val Token: Instantiable6[
    /* type */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    /* text */ String, 
    js.UndefOr[/* pos */ Double], 
    js.UndefOr[/* line */ Double], 
    js.UndefOr[/* column */ Double], 
    typings.tokenizr.mod.Token[js.Object]
  ] = js.native
}

