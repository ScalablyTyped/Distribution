package typings.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type InputBuffer = typings.std.ArrayLike[scala.Double]
  type OutputBuffer = typings.std.ArrayLike[scala.Double]
  type v1 = typings.uuid.interfacesMod.v1Buffer with typings.uuid.interfacesMod.v1String
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[typings.uuid.interfacesMod.V1Options | scala.Null], 
    /* buffer */ typings.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.interfacesMod.OutputBuffer
  ]
  type v1String = js.Function1[/* options */ js.UndefOr[typings.uuid.interfacesMod.V1Options], java.lang.String]
  type v3 = typings.uuid.interfacesMod.v3Buffer with typings.uuid.interfacesMod.v3String with typings.uuid.interfacesMod.v3Static
  type v3Buffer = js.Function4[
    /* name */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typings.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.interfacesMod.OutputBuffer
  ]
  type v3String = js.Function2[
    /* name */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
  type v4 = typings.uuid.interfacesMod.v4Buffer with typings.uuid.interfacesMod.v4String
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[typings.uuid.interfacesMod.V4Options | scala.Null], 
    /* buffer */ typings.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.interfacesMod.OutputBuffer
  ]
  type v4String = js.Function1[/* options */ js.UndefOr[typings.uuid.interfacesMod.V4Options], java.lang.String]
  type v5 = typings.uuid.interfacesMod.v5Buffer with typings.uuid.interfacesMod.v5String with typings.uuid.interfacesMod.v5Static
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typings.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.interfacesMod.OutputBuffer
  ]
  type v5String = js.Function2[
    /* name */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
}
