package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wreckLib {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestOptions */ js.Any) with Anon_Payload, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Boom */ js.Any
    ], 
    /* details */ Anon_Url, 
    scala.Unit
  ]
}
