package typings
package uuidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type OutputBuffer = stdLib.ArrayLike[scala.Double] | nodeLib.Buffer
  type v1 = v1String with v1Buffer
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[V1Options | scala.Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    OutputBuffer
  ]
  type v1String = js.Function1[/* options */ js.UndefOr[V1Options], java.lang.String]
  type v4 = v4String with v4Buffer
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[V4Options | scala.Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    OutputBuffer
  ]
  type v4String = js.Function1[/* options */ js.UndefOr[V4Options], java.lang.String]
  type v5 = v5String with v5Buffer
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | js.Array[scala.Double], 
    /* namespace */ java.lang.String | js.Array[scala.Double], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    OutputBuffer
  ]
  type v5String = js.Function2[
    /* name */ java.lang.String | js.Array[scala.Double], 
    /* namespace */ java.lang.String | js.Array[scala.Double], 
    java.lang.String
  ]
}
