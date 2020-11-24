package typings.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InputBuffer = typings.std.ArrayLike[scala.Double]
  
  type NIL = java.lang.String
  
  // Uses ArrayLike to admit Unit8 and co.
  type OutputBuffer = typings.std.ArrayLike[scala.Double]
  
  type parse = js.Function1[/* uuid */ java.lang.String, typings.uuid.mod.OutputBuffer]
  
  type stringify = js.Function2[
    /* buffer */ typings.uuid.mod.InputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  
  type v1 = typings.uuid.mod.v1Buffer with typings.uuid.mod.v1String
  
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[typings.uuid.mod.V1Options | scala.Null], 
    /* buffer */ typings.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.mod.OutputBuffer
  ]
  
  type v1String = js.Function1[/* options */ js.UndefOr[typings.uuid.mod.V1Options], java.lang.String]
  
  type v3 = typings.uuid.mod.v3Buffer with typings.uuid.mod.v3String with typings.uuid.mod.v3Static
  
  type v3Buffer = js.Function4[
    /* name */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* buffer */ typings.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.mod.OutputBuffer
  ]
  
  type v3String = js.Function2[
    /* name */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.mod.InputBuffer, 
    java.lang.String
  ]
  
  type v4 = typings.uuid.mod.v4Buffer with typings.uuid.mod.v4String
  
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[typings.uuid.mod.V4Options | scala.Null], 
    /* buffer */ typings.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.mod.OutputBuffer
  ]
  
  type v4String = js.Function1[/* options */ js.UndefOr[typings.uuid.mod.V4Options], java.lang.String]
  
  type v5 = typings.uuid.mod.v5Buffer with typings.uuid.mod.v5String with typings.uuid.mod.v5Static
  
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* buffer */ typings.uuid.mod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typings.uuid.mod.OutputBuffer
  ]
  
  type v5String = js.Function2[
    /* name */ java.lang.String | typings.uuid.mod.InputBuffer, 
    /* namespace */ java.lang.String | typings.uuid.mod.InputBuffer, 
    java.lang.String
  ]
  
  type validate = js.Function1[/* uuid */ java.lang.String, scala.Boolean]
  
  type version = js.Function1[/* uuid */ java.lang.String, scala.Double]
}
