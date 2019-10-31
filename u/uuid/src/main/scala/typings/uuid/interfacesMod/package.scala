package typings.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  import typings.node.Buffer
  import typings.std.ArrayLike

  type InputBuffer = ArrayLike[Double] | Buffer
  type OutputBuffer = ArrayLike[Double] | Buffer
  type v1 = v1Buffer with v1String
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[V1Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  type v1String = js.Function1[/* options */ js.UndefOr[V1Options], String]
  type v4 = v4Buffer with v4String
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[V4Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  type v4String = js.Function1[/* options */ js.UndefOr[V4Options], String]
  type v5 = v5Buffer with v5String
  type v5Buffer = js.Function4[
    /* name */ String | InputBuffer, 
    /* namespace */ String | InputBuffer, 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  type v5String = js.Function2[/* name */ String | InputBuffer, /* namespace */ String | InputBuffer, String]
}
