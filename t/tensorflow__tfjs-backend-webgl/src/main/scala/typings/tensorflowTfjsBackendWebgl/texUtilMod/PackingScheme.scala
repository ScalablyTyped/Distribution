package typings.tensorflowTfjsBackendWebgl.texUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackingScheme extends js.Object

@JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PackingScheme")
@js.native
object PackingScheme extends js.Object {
  /**
    * All values in a single texel are densely packed without any constraints.
    *
    * This is how the shader encodes a tensor with shape = [2, 3, 4]
    * (indices are [batch, row, col]).
    *
    * 000|001   010|011   020|021
    * -------   -------   -------
    * 002|003   012|013   022|023
    *
    * 100|101   110|111   120|121
    * -------   -------   -------
    * 102|103   112|113   122|123
    *
    */
  @js.native
  sealed trait DENSE extends PackingScheme
  
  /**
    * Single texels contain only values from the same batch, and from adjacent
    * rows and columns.
    *
    * This is how the shader encodes a tensor with shape = [2, 3, 5]
    * (indices are [batch, row, col]).
    *
    * 000|001   002|003   004|xxx   020|021   022|023   024|xxx
    * -------   -------   -------   -------   -------   -------
    * 010|011   012|013   014|xxx   xxx|xxx   xxx|xxx   xxx|xxx
    *
    * 100|101   102|103   104|xxx   120|121   122|123   124|xxx
    * -------   -------   -------   -------   -------   -------
    * 110|111   112|113   114|xxx   xxx|xxx   xxx|xxx   xxx|xxx
    *
    */
  @js.native
  sealed trait SHARED_BATCH extends PackingScheme
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackingScheme with Double] = js.native
  /* 0 */ @js.native
  object DENSE extends TopLevel[DENSE with Double]
  
  /* 1 */ @js.native
  object SHARED_BATCH extends TopLevel[SHARED_BATCH with Double]
  
}

