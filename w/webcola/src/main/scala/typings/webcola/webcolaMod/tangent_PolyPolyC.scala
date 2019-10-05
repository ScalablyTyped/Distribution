package typings.webcola.webcolaMod

import typings.webcola.Anon_T1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "tangent_PolyPolyC")
@js.native
object tangent_PolyPolyC extends js.Object {
  def apply(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point],
    t1: js.Function2[
      /* a */ typings.webcola.distSrcGeomMod.Point, 
      /* b */ js.Array[typings.webcola.distSrcGeomMod.Point], 
      Double
    ],
    t2: js.Function2[
      /* a */ typings.webcola.distSrcGeomMod.Point, 
      /* b */ js.Array[typings.webcola.distSrcGeomMod.Point], 
      Double
    ],
    cmp1: js.Function3[
      /* a */ typings.webcola.distSrcGeomMod.Point, 
      /* b */ typings.webcola.distSrcGeomMod.Point, 
      /* c */ typings.webcola.distSrcGeomMod.Point, 
      Boolean
    ],
    cmp2: js.Function3[
      /* a */ typings.webcola.distSrcGeomMod.Point, 
      /* b */ typings.webcola.distSrcGeomMod.Point, 
      /* c */ typings.webcola.distSrcGeomMod.Point, 
      Boolean
    ]
  ): Anon_T1 = js.native
}

