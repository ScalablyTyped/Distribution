package typings.tabris.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8ClampedArray
import typings.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("Crypto")
  var Crypto_ : Instantiable0[typings.tabris.Crypto_] = js.native
  var Headers: Instantiable1[
    js.UndefOr[
      typings.tabris.Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]
    ], 
    typings.tabris.Headers
  ] = js.native
  var ImageData: Instantiable3[
    /* data */ Uint8ClampedArray, 
    /* width */ Double, 
    js.UndefOr[/* height */ Double], 
    typings.tabris.ImageData
  ] = js.native
  var Request: Instantiable2[
    /* input */ String | typings.tabris.Request, 
    js.UndefOr[/* init */ RequestInit], 
    typings.tabris.Request
  ] = js.native
  var Storage: Instantiable0[typings.tabris.Storage] = js.native
  var crypto: typings.tabris.Crypto_ = js.native
  var fetch: js.Function2[
    /* url */ String | typings.tabris.Request, 
    /* init */ js.UndefOr[RequestInit], 
    js.Promise[typings.tabris.Response]
  ] = js.native
}

