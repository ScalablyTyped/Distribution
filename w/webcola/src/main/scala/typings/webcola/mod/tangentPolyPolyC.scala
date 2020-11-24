package typings.webcola.mod

import typings.webcola.anon.T1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "tangent_PolyPolyC")
@js.native
object tangentPolyPolyC extends js.Object {
  
  def apply(
    V: js.Array[typings.webcola.geomMod.Point],
    W: js.Array[typings.webcola.geomMod.Point],
    t1: js.Function2[
      /* a */ typings.webcola.geomMod.Point, 
      /* b */ js.Array[typings.webcola.geomMod.Point], 
      Double
    ],
    t2: js.Function2[
      /* a */ typings.webcola.geomMod.Point, 
      /* b */ js.Array[typings.webcola.geomMod.Point], 
      Double
    ],
    cmp1: js.Function3[
      /* a */ typings.webcola.geomMod.Point, 
      /* b */ typings.webcola.geomMod.Point, 
      /* c */ typings.webcola.geomMod.Point, 
      Boolean
    ],
    cmp2: js.Function3[
      /* a */ typings.webcola.geomMod.Point, 
      /* b */ typings.webcola.geomMod.Point, 
      /* c */ typings.webcola.geomMod.Point, 
      Boolean
    ]
  ): T1 = js.native
}
